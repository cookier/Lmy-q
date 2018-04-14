package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderGoodsItem implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer goodsId;

    private Integer goodsType;

    private Integer shopId;

    private Integer num;

    private Double price;

    private Double payPrice;

    private Integer skuId;

    private String s1;

    private String s2;

    private String s3;

    private String s4;

    private String s5;

    private String skuCode;

    private Integer deliverTemplateId;

    private String goodsUrl;

    private String imageUrl;

    private String goodsTitle;

    private Integer itemStatus;

    private Date refundTime;

    private Date sendTime;

    private Integer sendType;

    private Date successTime;

    private Double needPayMoney;

    private Double realPayMoney;

    private Double refundMoney;

    private Integer freePostage;

    private Double postage;

    private Double adjustPostage;

    private String expressNo;

    private Integer expressId;

    private Integer customerOrderItemId;

    private Double fxPrice;

    private Double supplyPrice;

    private Double commissionMoney;

    private Double memberDiscountMoney;

    private Double adjustMoney;

    private Double discountMoney;

    private Short commentStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
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

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public Integer getDeliverTemplateId() {
        return deliverTemplateId;
    }

    public void setDeliverTemplateId(Integer deliverTemplateId) {
        this.deliverTemplateId = deliverTemplateId;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl == null ? null : goodsUrl.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public Double getNeedPayMoney() {
        return needPayMoney;
    }

    public void setNeedPayMoney(Double needPayMoney) {
        this.needPayMoney = needPayMoney;
    }

    public Double getRealPayMoney() {
        return realPayMoney;
    }

    public void setRealPayMoney(Double realPayMoney) {
        this.realPayMoney = realPayMoney;
    }

    public Double getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(Double refundMoney) {
        this.refundMoney = refundMoney;
    }

    public Integer getFreePostage() {
        return freePostage;
    }

    public void setFreePostage(Integer freePostage) {
        this.freePostage = freePostage;
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public Double getAdjustPostage() {
        return adjustPostage;
    }

    public void setAdjustPostage(Double adjustPostage) {
        this.adjustPostage = adjustPostage;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public Integer getCustomerOrderItemId() {
        return customerOrderItemId;
    }

    public void setCustomerOrderItemId(Integer customerOrderItemId) {
        this.customerOrderItemId = customerOrderItemId;
    }

    public Double getFxPrice() {
        return fxPrice;
    }

    public void setFxPrice(Double fxPrice) {
        this.fxPrice = fxPrice;
    }

    public Double getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(Double supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public Double getCommissionMoney() {
        return commissionMoney;
    }

    public void setCommissionMoney(Double commissionMoney) {
        this.commissionMoney = commissionMoney;
    }

    public Double getMemberDiscountMoney() {
        return memberDiscountMoney;
    }

    public void setMemberDiscountMoney(Double memberDiscountMoney) {
        this.memberDiscountMoney = memberDiscountMoney;
    }

    public Double getAdjustMoney() {
        return adjustMoney;
    }

    public void setAdjustMoney(Double adjustMoney) {
        this.adjustMoney = adjustMoney;
    }

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Short getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Short commentStatus) {
        this.commentStatus = commentStatus;
    }
}