package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderComment implements Serializable {
    private Integer id;

    private Integer orderItemId;

    private Integer level;

    private Integer goodsId;

    private Integer supplierGoodsId;

    private Integer orderId;

    private Integer userId;

    private Integer descriptionScore;

    private Integer serviceScore;

    private Integer deliveryScore;

    private Date createTime;

    private Integer fxGoodsId;

    private Short imgFlag;

    private Short reviewsFlag;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSupplierGoodsId() {
        return supplierGoodsId;
    }

    public void setSupplierGoodsId(Integer supplierGoodsId) {
        this.supplierGoodsId = supplierGoodsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDescriptionScore() {
        return descriptionScore;
    }

    public void setDescriptionScore(Integer descriptionScore) {
        this.descriptionScore = descriptionScore;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Integer getDeliveryScore() {
        return deliveryScore;
    }

    public void setDeliveryScore(Integer deliveryScore) {
        this.deliveryScore = deliveryScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getFxGoodsId() {
        return fxGoodsId;
    }

    public void setFxGoodsId(Integer fxGoodsId) {
        this.fxGoodsId = fxGoodsId;
    }

    public Short getImgFlag() {
        return imgFlag;
    }

    public void setImgFlag(Short imgFlag) {
        this.imgFlag = imgFlag;
    }

    public Short getReviewsFlag() {
        return reviewsFlag;
    }

    public void setReviewsFlag(Short reviewsFlag) {
        this.reviewsFlag = reviewsFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}