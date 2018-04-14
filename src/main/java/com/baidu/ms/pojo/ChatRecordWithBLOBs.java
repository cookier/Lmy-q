package com.baidu.ms.pojo;

import java.io.Serializable;

public class ChatRecordWithBLOBs extends ChatRecord implements Serializable {
    private String extrContent;

    private String conversations;

    private static final long serialVersionUID = 1L;

    public String getExtrContent() {
        return extrContent;
    }

    public void setExtrContent(String extrContent) {
        this.extrContent = extrContent == null ? null : extrContent.trim();
    }

    public String getConversations() {
        return conversations;
    }

    public void setConversations(String conversations) {
        this.conversations = conversations == null ? null : conversations.trim();
    }
}