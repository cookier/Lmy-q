package com.baidu.ms.pojo;

import java.io.Serializable;

public class DocumentWithBLOBs extends Document implements Serializable {
    private String content;

    private String extraContent;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getExtraContent() {
        return extraContent;
    }

    public void setExtraContent(String extraContent) {
        this.extraContent = extraContent == null ? null : extraContent.trim();
    }
}