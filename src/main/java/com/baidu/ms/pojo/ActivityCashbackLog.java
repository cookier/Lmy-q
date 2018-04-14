package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityCashbackLog implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer userId;

    private Integer activityId;

    private Date cashbackTime;

    private String orderNo;

    private String orderUrl;

    private Double cashbackMoney;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getCashbackTime() {
        return cashbackTime;
    }

    public void setCashbackTime(Date cashbackTime) {
        this.cashbackTime = cashbackTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl == null ? null : orderUrl.trim();
    }

    public Double getCashbackMoney() {
        return cashbackMoney;
    }

    public void setCashbackMoney(Double cashbackMoney) {
        this.cashbackMoney = cashbackMoney;
    }
}