package com.baidu.ms.pojo;

import java.io.Serializable;

public class SpecValue implements Serializable {
    private Integer id;

    private String sName;

    private String sValue;

    private String sRange;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue == null ? null : sValue.trim();
    }

    public String getsRange() {
        return sRange;
    }

    public void setsRange(String sRange) {
        this.sRange = sRange == null ? null : sRange.trim();
    }
}