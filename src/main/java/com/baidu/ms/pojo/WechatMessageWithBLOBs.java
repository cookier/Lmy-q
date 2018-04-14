package com.baidu.ms.pojo;

import java.io.Serializable;

public class WechatMessageWithBLOBs extends WechatMessage implements Serializable {
    private String userInfo;

    private String replyContent;

    private String messageBody;

    private static final long serialVersionUID = 1L;

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody == null ? null : messageBody.trim();
    }
}