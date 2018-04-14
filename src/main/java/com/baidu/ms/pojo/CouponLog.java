package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class CouponLog implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer userId;

    private Integer couponId;

    private Date createTime;

    private Date expireTime;

    private Date receiveTime;

    private Date useTime;

    private Integer consumeUserId;

    private String orderNo;

    private String orderUrl;

    private Double discountMoney;

    private String verifyCode;

    private String clientIp;

    private String mobile;

    private Integer wechatCardSyncFlag;

    private String wechatCardNo;

    private Integer status;

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

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getConsumeUserId() {
        return consumeUserId;
    }

    public void setConsumeUserId(Integer consumeUserId) {
        this.consumeUserId = consumeUserId;
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

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getWechatCardSyncFlag() {
        return wechatCardSyncFlag;
    }

    public void setWechatCardSyncFlag(Integer wechatCardSyncFlag) {
        this.wechatCardSyncFlag = wechatCardSyncFlag;
    }

    public String getWechatCardNo() {
        return wechatCardNo;
    }

    public void setWechatCardNo(String wechatCardNo) {
        this.wechatCardNo = wechatCardNo == null ? null : wechatCardNo.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}