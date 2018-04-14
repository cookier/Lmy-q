package com.baidu.ms.pojo;

import java.io.Serializable;

public class ActivityRuleWithBLOBs extends ActivityRule implements Serializable {
    private String prize;

    private String extrContent;

    private static final long serialVersionUID = 1L;

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize == null ? null : prize.trim();
    }

    public String getExtrContent() {
        return extrContent;
    }

    public void setExtrContent(String extrContent) {
        this.extrContent = extrContent == null ? null : extrContent.trim();
    }
}