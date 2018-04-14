package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderSafe implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer userId;

    private String safeNo;

    private Double refundFee;

    private String orderNo;

    private Double postage;

    private Integer safeType;

    private String safeTypeStr;

    private Integer safeReason;

    private String safeReasonStr;

    private String supplierOrderNo;

    private Double supplierRefundFee;

    private Double supplierRealPay;

    private Double sellerRefundFee;

    private Integer isAssume;

    private String phone;

    private String remark;

    private Double sellerRealPay;

    private Double platformRefundFeed;

    private Double platformRealPay;

    private Date createTime;

    private Integer updateBy;

    private Date updateTime;

    private Integer orderItemId;

    private String refundAddress;

    private String refundExpressNo;

    private String refundExpressName;

    private String refundPayId;

    private String statusStr;

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

    public String getSafeNo() {
        return safeNo;
    }

    public void setSafeNo(String safeNo) {
        this.safeNo = safeNo == null ? null : safeNo.trim();
    }

    public Double getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Double refundFee) {
        this.refundFee = refundFee;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public Integer getSafeType() {
        return safeType;
    }

    public void setSafeType(Integer safeType) {
        this.safeType = safeType;
    }

    public String getSafeTypeStr() {
        return safeTypeStr;
    }

    public void setSafeTypeStr(String safeTypeStr) {
        this.safeTypeStr = safeTypeStr == null ? null : safeTypeStr.trim();
    }

    public Integer getSafeReason() {
        return safeReason;
    }

    public void setSafeReason(Integer safeReason) {
        this.safeReason = safeReason;
    }

    public String getSafeReasonStr() {
        return safeReasonStr;
    }

    public void setSafeReasonStr(String safeReasonStr) {
        this.safeReasonStr = safeReasonStr == null ? null : safeReasonStr.trim();
    }

    public String getSupplierOrderNo() {
        return supplierOrderNo;
    }

    public void setSupplierOrderNo(String supplierOrderNo) {
        this.supplierOrderNo = supplierOrderNo == null ? null : supplierOrderNo.trim();
    }

    public Double getSupplierRefundFee() {
        return supplierRefundFee;
    }

    public void setSupplierRefundFee(Double supplierRefundFee) {
        this.supplierRefundFee = supplierRefundFee;
    }

    public Double getSupplierRealPay() {
        return supplierRealPay;
    }

    public void setSupplierRealPay(Double supplierRealPay) {
        this.supplierRealPay = supplierRealPay;
    }

    public Double getSellerRefundFee() {
        return sellerRefundFee;
    }

    public void setSellerRefundFee(Double sellerRefundFee) {
        this.sellerRefundFee = sellerRefundFee;
    }

    public Integer getIsAssume() {
        return isAssume;
    }

    public void setIsAssume(Integer isAssume) {
        this.isAssume = isAssume;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getSellerRealPay() {
        return sellerRealPay;
    }

    public void setSellerRealPay(Double sellerRealPay) {
        this.sellerRealPay = sellerRealPay;
    }

    public Double getPlatformRefundFeed() {
        return platformRefundFeed;
    }

    public void setPlatformRefundFeed(Double platformRefundFeed) {
        this.platformRefundFeed = platformRefundFeed;
    }

    public Double getPlatformRealPay() {
        return platformRealPay;
    }

    public void setPlatformRealPay(Double platformRealPay) {
        this.platformRealPay = platformRealPay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getRefundAddress() {
        return refundAddress;
    }

    public void setRefundAddress(String refundAddress) {
        this.refundAddress = refundAddress == null ? null : refundAddress.trim();
    }

    public String getRefundExpressNo() {
        return refundExpressNo;
    }

    public void setRefundExpressNo(String refundExpressNo) {
        this.refundExpressNo = refundExpressNo == null ? null : refundExpressNo.trim();
    }

    public String getRefundExpressName() {
        return refundExpressName;
    }

    public void setRefundExpressName(String refundExpressName) {
        this.refundExpressName = refundExpressName == null ? null : refundExpressName.trim();
    }

    public String getRefundPayId() {
        return refundPayId;
    }

    public void setRefundPayId(String refundPayId) {
        this.refundPayId = refundPayId == null ? null : refundPayId.trim();
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr == null ? null : statusStr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}