package com.baidu.ms.pojo;

import java.io.Serializable;

public class CheckinWithBLOBs extends Checkin implements Serializable {
    private String pageContent;

    private String ruleItems;

    private static final long serialVersionUID = 1L;

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent == null ? null : pageContent.trim();
    }

    public String getRuleItems() {
        return ruleItems;
    }

    public void setRuleItems(String ruleItems) {
        this.ruleItems = ruleItems == null ? null : ruleItems.trim();
    }
}