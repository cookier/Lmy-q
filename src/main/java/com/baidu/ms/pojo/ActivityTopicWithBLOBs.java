package com.baidu.ms.pojo;

import java.io.Serializable;

public class ActivityTopicWithBLOBs extends ActivityTopic implements Serializable {
    private String description;

    private String content;

    private String remark;

    private String extrContent;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getExtrContent() {
        return extrContent;
    }

    public void setExtrContent(String extrContent) {
        this.extrContent = extrContent == null ? null : extrContent.trim();
    }
}