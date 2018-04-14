package com.baidu.ms.pojo;

import java.io.Serializable;

public class PayConfig implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer payPlugingId;

    private Double poundage;

    private Integer poundageType;

    private Integer partnerId;

    private String partnerKey;

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

    public Integer getPayPlugingId() {
        return payPlugingId;
    }

    public void setPayPlugingId(Integer payPlugingId) {
        this.payPlugingId = payPlugingId;
    }

    public Double getPoundage() {
        return poundage;
    }

    public void setPoundage(Double poundage) {
        this.poundage = poundage;
    }

    public Integer getPoundageType() {
        return poundageType;
    }

    public void setPoundageType(Integer poundageType) {
        this.poundageType = poundageType;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerKey() {
        return partnerKey;
    }

    public void setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey == null ? null : partnerKey.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}