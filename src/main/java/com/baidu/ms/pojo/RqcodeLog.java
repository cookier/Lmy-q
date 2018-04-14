package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class RqcodeLog implements Serializable {
    private Integer id;

    private Integer rqcodeId;

    private Integer userId;

    private Date scanTime;

    private String userInfo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRqcodeId() {
        return rqcodeId;
    }

    public void setRqcodeId(Integer rqcodeId) {
        this.rqcodeId = rqcodeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getScanTime() {
        return scanTime;
    }

    public void setScanTime(Date scanTime) {
        this.scanTime = scanTime;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }
}