package com.rgb.tools.dao.model.erm;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

/**
 * ER图的分类模块，如常见的 组织管理、权限管理等等
 * 对应位置 diagram/settings/category_settings/categories/category
 * @author zhaoch
 */
@TableName("er_category")
public class ERCategory {

    /**
     * ID 标识
     */
    private String id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类下的表集合
     */
    @JSONField(name = "node_element")
    @TableField(exist = false)
    private List<String> tableList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTableList() {
        return tableList;
    }

    public void setTableList(List<String> tableList) {
        this.tableList = tableList;
    }
}
