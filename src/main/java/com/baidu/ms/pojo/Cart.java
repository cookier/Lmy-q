package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Cart implements Serializable {
    private Integer cartId;

    private Integer userId;

    private Integer shopId;

    private Integer goodsId;

    private Double price;

    private Integer count;

    private Date addTime;

    private Date updateTime;

    private Integer selectFlag;

    private Integer deleteFlag;

    private Integer skuId;

    private String s1;

    private String s2;

    private String s3;

    private String s4;

    private String s5;

    private String activityId;

    private String sku;

    private static final long serialVersionUID = 1L;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSelectFlag() {
        return selectFlag;
    }

    public void setSelectFlag(Integer selectFlag) {
        this.selectFlag = selectFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1 == null ? null : s1.trim();
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2 == null ? null : s2.trim();
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3 == null ? null : s3.trim();
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4 == null ? null : s4.trim();
    }

    public String getS5() {
        return s5;
    }

    public void setS5(String s5) {
        this.s5 = s5 == null ? null : s5.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}