package com.rgb.tools.dao.model.erm;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class ERColumns {

    @JSONField(name = "normal_column")
    private List<ERColumn> normalColumnList;

    public List<ERColumn> getNormalColumnList() {
        return normalColumnList;
    }

    public void setNormalColumnList(List<ERColumn> normalColumnList) {
        this.normalColumnList = normalColumnList;
    }
}
