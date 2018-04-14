package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopMemberTag implements Serializable {
    private Integer id;

    private Integer shopId;

    private String labelName;

    private Integer wechatVipCount;

    private Integer mobileVipCount;

    private Integer tradeUpgradeLimit;

    private Double moneyUpgradeLimit;

    private Integer pointUpgradeLimit;

    private Date createTime;

    private Date updateTime;

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

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public Integer getWechatVipCount() {
        return wechatVipCount;
    }

    public void setWechatVipCount(Integer wechatVipCount) {
        this.wechatVipCount = wechatVipCount;
    }

    public Integer getMobileVipCount() {
        return mobileVipCount;
    }

    public void setMobileVipCount(Integer mobileVipCount) {
        this.mobileVipCount = mobileVipCount;
    }

    public Integer getTradeUpgradeLimit() {
        return tradeUpgradeLimit;
    }

    public void setTradeUpgradeLimit(Integer tradeUpgradeLimit) {
        this.tradeUpgradeLimit = tradeUpgradeLimit;
    }

    public Double getMoneyUpgradeLimit() {
        return moneyUpgradeLimit;
    }

    public void setMoneyUpgradeLimit(Double moneyUpgradeLimit) {
        this.moneyUpgradeLimit = moneyUpgradeLimit;
    }

    public Integer getPointUpgradeLimit() {
        return pointUpgradeLimit;
    }

    public void setPointUpgradeLimit(Integer pointUpgradeLimit) {
        this.pointUpgradeLimit = pointUpgradeLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}