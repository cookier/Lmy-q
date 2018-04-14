package com.baidu.ms.pojo;

import java.io.Serializable;

public class GoodsReferences implements Serializable {
    private Integer id;

    private String referName;

    private String referValue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferName() {
        return referName;
    }

    public void setReferName(String referName) {
        this.referName = referName == null ? null : referName.trim();
    }

    public String getReferValue() {
        return referValue;
    }

    public void setReferValue(String referValue) {
        this.referValue = referValue == null ? null : referValue.trim();
    }
}