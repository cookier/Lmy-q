package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderSafeLog implements Serializable {
    private Integer id;

    private String safeNo;

    private String orderNo;

    private String feedback;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private Integer safeReason;

    private Integer safeType;

    private String phone;

    private String explains;

    private Double refundFee;

    private Double supplierRefundFee;

    private Double realPay;

    private Double supplierRealPay;

    private String safeTypeStr;

    private String safeReasonStr;

    private String explainDetail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSafeNo() {
        return safeNo;
    }

    public void setSafeNo(String safeNo) {
        this.safeNo = safeNo == null ? null : safeNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSafeReason() {
        return safeReason;
    }

    public void setSafeReason(Integer safeReason) {
        this.safeReason = safeReason;
    }

    public Integer getSafeType() {
        return safeType;
    }

    public void setSafeType(Integer safeType) {
        this.safeType = safeType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains == null ? null : explains.trim();
    }

    public Double getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Double refundFee) {
        this.refundFee = refundFee;
    }

    public Double getSupplierRefundFee() {
        return supplierRefundFee;
    }

    public void setSupplierRefundFee(Double supplierRefundFee) {
        this.supplierRefundFee = supplierRefundFee;
    }

    public Double getRealPay() {
        return realPay;
    }

    public void setRealPay(Double realPay) {
        this.realPay = realPay;
    }

    public Double getSupplierRealPay() {
        return supplierRealPay;
    }

    public void setSupplierRealPay(Double supplierRealPay) {
        this.supplierRealPay = supplierRealPay;
    }

    public String getSafeTypeStr() {
        return safeTypeStr;
    }

    public void setSafeTypeStr(String safeTypeStr) {
        this.safeTypeStr = safeTypeStr == null ? null : safeTypeStr.trim();
    }

    public String getSafeReasonStr() {
        return safeReasonStr;
    }

    public void setSafeReasonStr(String safeReasonStr) {
        this.safeReasonStr = safeReasonStr == null ? null : safeReasonStr.trim();
    }

    public String getExplainDetail() {
        return explainDetail;
    }

    public void setExplainDetail(String explainDetail) {
        this.explainDetail = explainDetail == null ? null : explainDetail.trim();
    }
}