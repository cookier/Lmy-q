package com.baidu.ms.pojo;

import java.io.Serializable;

public class TaskJobWithBLOBs extends TaskJob implements Serializable {
    private String field;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}