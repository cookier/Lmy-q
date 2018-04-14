package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Gift implements Serializable {
    private Integer id;

    private Integer shopId;

    private Date createTime;

    private Date validTime;

    private Date expireTime;

    private Integer deleteStatus;

    private Integer receiveLimit;

    private Integer stock;

    private String title;

    private Date updateTime;

    private String receiveModel;

    private Integer receivePeriod;

    private String goodsInfo;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getReceiveLimit() {
        return receiveLimit;
    }

    public void setReceiveLimit(Integer receiveLimit) {
        this.receiveLimit = receiveLimit;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getReceiveModel() {
        return receiveModel;
    }

    public void setReceiveModel(String receiveModel) {
        this.receiveModel = receiveModel == null ? null : receiveModel.trim();
    }

    public Integer getReceivePeriod() {
        return receivePeriod;
    }

    public void setReceivePeriod(Integer receivePeriod) {
        this.receivePeriod = receivePeriod;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }
}