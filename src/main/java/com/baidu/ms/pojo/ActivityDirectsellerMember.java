package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityDirectsellerMember implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer memberId;

    private Date createdTime;

    private Double tradingVolume;

    private Integer orderNum;

    private Double autoSettleAmount;

    private Integer autoSettleNum;

    private Double manualSettleAmount;

    private Integer manualSettleNum;

    private Double settleMoney;

    private Double waitSettleMoney;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Double getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(Double tradingVolume) {
        this.tradingVolume = tradingVolume;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Double getAutoSettleAmount() {
        return autoSettleAmount;
    }

    public void setAutoSettleAmount(Double autoSettleAmount) {
        this.autoSettleAmount = autoSettleAmount;
    }

    public Integer getAutoSettleNum() {
        return autoSettleNum;
    }

    public void setAutoSettleNum(Integer autoSettleNum) {
        this.autoSettleNum = autoSettleNum;
    }

    public Double getManualSettleAmount() {
        return manualSettleAmount;
    }

    public void setManualSettleAmount(Double manualSettleAmount) {
        this.manualSettleAmount = manualSettleAmount;
    }

    public Integer getManualSettleNum() {
        return manualSettleNum;
    }

    public void setManualSettleNum(Integer manualSettleNum) {
        this.manualSettleNum = manualSettleNum;
    }

    public Double getSettleMoney() {
        return settleMoney;
    }

    public void setSettleMoney(Double settleMoney) {
        this.settleMoney = settleMoney;
    }

    public Double getWaitSettleMoney() {
        return waitSettleMoney;
    }

    public void setWaitSettleMoney(Double waitSettleMoney) {
        this.waitSettleMoney = waitSettleMoney;
    }
}