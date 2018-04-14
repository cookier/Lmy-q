package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityDirectsellerLog implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer sellerId;

    private Integer memberId;

    private String orderNo;

    private Double realPay;

    private Double cpsMoney;

    private Float cpsRate;

    private Date createdTime;

    private Short settleType;

    private Short settleState;

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

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Double getRealPay() {
        return realPay;
    }

    public void setRealPay(Double realPay) {
        this.realPay = realPay;
    }

    public Double getCpsMoney() {
        return cpsMoney;
    }

    public void setCpsMoney(Double cpsMoney) {
        this.cpsMoney = cpsMoney;
    }

    public Float getCpsRate() {
        return cpsRate;
    }

    public void setCpsRate(Float cpsRate) {
        this.cpsRate = cpsRate;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Short getSettleType() {
        return settleType;
    }

    public void setSettleType(Short settleType) {
        this.settleType = settleType;
    }

    public Short getSettleState() {
        return settleState;
    }

    public void setSettleState(Short settleState) {
        this.settleState = settleState;
    }
}