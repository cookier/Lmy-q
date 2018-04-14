package com.baidu.ms.pojo;

import java.io.Serializable;

public class Notification implements Serializable {
    private Integer id;

    private Integer type;

    private Integer readStatus;

    private Integer orderId;

    private String tipsStr;

    private Integer userId;

    private Integer shopId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getTipsStr() {
        return tipsStr;
    }

    public void setTipsStr(String tipsStr) {
        this.tipsStr = tipsStr == null ? null : tipsStr.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}