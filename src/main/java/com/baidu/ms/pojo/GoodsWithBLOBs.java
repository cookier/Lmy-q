package com.baidu.ms.pojo;

import java.io.Serializable;

public class GoodsWithBLOBs extends Goods implements Serializable {
    private String groupLabel;

    private String extraContent;

    private String fxDescription;

    private String references;

    private static final long serialVersionUID = 1L;

    public String getGroupLabel() {
        return groupLabel;
    }

    public void setGroupLabel(String groupLabel) {
        this.groupLabel = groupLabel == null ? null : groupLabel.trim();
    }

    public String getExtraContent() {
        return extraContent;
    }

    public void setExtraContent(String extraContent) {
        this.extraContent = extraContent == null ? null : extraContent.trim();
    }

    public String getFxDescription() {
        return fxDescription;
    }

    public void setFxDescription(String fxDescription) {
        this.fxDescription = fxDescription == null ? null : fxDescription.trim();
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references == null ? null : references.trim();
    }
}