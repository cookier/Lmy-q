package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class SmsMessage implements Serializable {
    private Integer id;

    private Integer tmpl;

    private String message;

    private String mobile;

    private Date sendTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTmpl() {
        return tmpl;
    }

    public void setTmpl(Integer tmpl) {
        this.tmpl = tmpl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}