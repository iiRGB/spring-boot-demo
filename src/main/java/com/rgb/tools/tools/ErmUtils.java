package com.rgb.tools.tools;
import com.alibaba.fastjson.JSON;
import com.rgb.tools.dao.model.erm.*;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.XML;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ErmUtils {

    public static String xml2String(String filepath) throws JSONException {
        File f= new File(filepath);
        String xmlstr;
        try {
             xmlstr = FileUtils.readFileToString(f);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            return null;
        }
        return XML.toJSONObject(xmlstr).toString();
    }

    public static String xml2Json(String xmlStr) throws JSONException {
        return XML.toJSONObject(xmlStr).toString();
    }

    public static Map<String, Object> parse(String xmlString) {

        com.alibaba.fastjson.JSONObject diagram = JSON.parseObject(xmlString).getJSONObject("diagram");
        List<ERTable> erTables = diagram.getJSONObject("contents").getJSONArray("table").toJavaList(ERTable.class);
        Map<String, ERWord> wordMap = diagram.getJSONObject("dictionary").getJSONArray("word").toJavaList(ERWord.class)
                .stream().collect(Collectors.toMap(ERWord::getId, w -> w));
        List<ERCategory> erCategories = diagram.getJSONObject("settings")
                .getJSONObject("category_settings")
                .getJSONObject("categories")
                .getJSONArray("category").toJavaList(ERCategory.class);
        erTables.forEach(t -> {
            for (ERCategory c : erCategories) {
                if (c.getTableList().contains(t.getId())) {
                    t.setCategoryId(c.getId());
                    break;
                }
            }
            for (ERColumn c : t.getColumns().getNormalColumnList()) {
                c.setTableId(t.getId());
                String wordId = c.getWordId();
                if (wordId != null && wordMap.get(wordId) != null) {
                    ERWord w = wordMap.get(wordId);
                    c.setLogicalName(w.getLogicalName());
                    c.setPhysicalName(w.getPhysicalName());
                    c.setType(w.getType());
                    c.setDescription(w.getDescription());
                    c.setLength(w.getLength());
                }
            }
        });
        List<ERColumn> columns = erTables.stream()
                .map(ERTable::getColumns)
                .map(ERColumns::getNormalColumnList)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        Map<String, Object> map = new HashMap<>(3);
        map.put("category", erCategories);
        map.put("table", erTables);
        map.put("column", columns);
        return map;
    }

}
