package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataFanstagOrder implements Serializable {
    private Integer id;

    private String tagName;

    private Integer tagId;

    private Integer fansCount;

    private Integer wechatAdded;

    private Integer mobileAdded;

    private Integer payOrderCount;

    private Double payAmount;

    private Integer payGoodsCount;

    private Integer payBuyer;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getWechatAdded() {
        return wechatAdded;
    }

    public void setWechatAdded(Integer wechatAdded) {
        this.wechatAdded = wechatAdded;
    }

    public Integer getMobileAdded() {
        return mobileAdded;
    }

    public void setMobileAdded(Integer mobileAdded) {
        this.mobileAdded = mobileAdded;
    }

    public Integer getPayOrderCount() {
        return payOrderCount;
    }

    public void setPayOrderCount(Integer payOrderCount) {
        this.payOrderCount = payOrderCount;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPayGoodsCount() {
        return payGoodsCount;
    }

    public void setPayGoodsCount(Integer payGoodsCount) {
        this.payGoodsCount = payGoodsCount;
    }

    public Integer getPayBuyer() {
        return payBuyer;
    }

    public void setPayBuyer(Integer payBuyer) {
        this.payBuyer = payBuyer;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getCalcuDate() {
        return calcuDate;
    }

    public void setCalcuDate(Date calcuDate) {
        this.calcuDate = calcuDate;
    }
}