package com.rgb.tools.rservice.impl;

import com.rgb.tools.dao.model.erm.ERCategory;
import com.rgb.tools.dao.model.erm.ERColumn;
import com.rgb.tools.dao.model.erm.ERTable;
import com.rgb.tools.rservice.InitService;
import com.rgb.tools.service.ErCategoryService;
import com.rgb.tools.service.ErColumnService;
import com.rgb.tools.service.ErTableService;
import com.rgb.tools.tools.ErmUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class InitServiceImpl implements InitService {

    @Autowired
    ErTableService tableService;
    @Autowired
    ErCategoryService categoryService;
    @Autowired
    ErColumnService columnService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void parseErm(String xmlStr) {
        Map<String, Object> parse = ErmUtils.parse(xmlStr);
        categoryService.insertBatch((List<ERCategory>) parse.get("category"));
        tableService.insertBatch((List<ERTable>) parse.get("table"));
        columnService.insertBatch((List<ERColumn>) parse.get("column"));
    }
}
