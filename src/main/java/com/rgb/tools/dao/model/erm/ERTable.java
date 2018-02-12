package com.rgb.tools.dao.model.erm;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *  ER图中的表对象，如人员表，角色表等等
 *  对应位置：diagram/contents/table
 * @author zhaoch
 */
@TableName("er_table")
public class ERTable {

    /**
     * 标识ID
     */
    @TableId
    private String id;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 物理名称，对应表名 如人员表的物理名称为 USER
     */
    private String physicalName;

    /**
     * 逻辑名称，对应表名的解释 如USER表逻辑名称为 人员
     */
    private String logicalName;

    /**
     * 表描述
     */
    private String description;

    /**
     * 表字段集合
     */
    @TableField(exist = false)
    private ERColumns columns;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getPhysicalName() {
        return physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    public String getLogicalName() {
        return logicalName;
    }

    public void setLogicalName(String logicalName) {
        this.logicalName = logicalName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ERColumns getColumns() {
        return columns;
    }

    public void setColumns(ERColumns columns) {
        this.columns = columns;
    }
}
