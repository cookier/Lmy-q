package com.baidu.ms.pojo;

import java.io.Serializable;

public class QuestionWithBLOBs extends Question implements Serializable {
    private String content;

    private String replies;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReplies() {
        return replies;
    }

    public void setReplies(String replies) {
        this.replies = replies == null ? null : replies.trim();
    }
}