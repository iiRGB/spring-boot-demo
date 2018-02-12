package com.rgb.tools.dao.model.erm;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import javax.xml.bind.annotation.XmlRootElement;

@TableName("er_column")
public class ERColumn {

    /**
     * 对应模型数据字典的id {@link ERWord#getId()}
     */
    @TableField(exist = false)
    private String wordId;

    /**
     * 标识
     */
    private String id;

    /**
     * 所属表
     */
    private String tableId;

    /**
     * 描述
     */
    private String description;

    /**
     * 逻辑名称
     */
    private String logicalName;

    /**
     * 物理名称
     */
    private String physicalName;

    /**
     * 字段类型
     */
    private String type;

    /**
     * 字段长度
     */
    private Integer length;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 是否自增 false 、true
     */
    private Boolean autoIncrement;

    /**
     * 是否外键
     */
    private Boolean foreignKey;

    /**
     * 是否不能为空
     */
    private Boolean notNull;

    /**
     * 是否为主键
     */
    private Boolean primaryKey;

    /**
     * 是否唯一
     */
    private Boolean uniqueKey;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getWordId() {
        return wordId;
    }
    public void setWordId(String wordId) {
        this.wordId = wordId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogicalName() {
        return logicalName;
    }
    public void setLogicalName(String logicalName) {
        this.logicalName = logicalName;
    }

    public String getPhysicalName() {
        return physicalName;
    }
    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDefaultValue() {
        return defaultValue;
    }
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public Boolean getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(Boolean foreignKey) {
        this.foreignKey = foreignKey;
    }

    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public Boolean getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Boolean getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(Boolean uniqueKey) {
        this.uniqueKey = uniqueKey;
    }
}
