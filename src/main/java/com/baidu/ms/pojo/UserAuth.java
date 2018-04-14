package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserAuth implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer shopId;

    private Integer type;

    private Integer identityType;

    private String realName;

    private String identityPic2;

    private String identityPic1;

    private String bizLicence;

    private String identityNum;

    private Date createTime;

    private Integer status;

    private Integer enterpriseType;

    private String auditRemark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdentityPic2() {
        return identityPic2;
    }

    public void setIdentityPic2(String identityPic2) {
        this.identityPic2 = identityPic2 == null ? null : identityPic2.trim();
    }

    public String getIdentityPic1() {
        return identityPic1;
    }

    public void setIdentityPic1(String identityPic1) {
        this.identityPic1 = identityPic1 == null ? null : identityPic1.trim();
    }

    public String getBizLicence() {
        return bizLicence;
    }

    public void setBizLicence(String bizLicence) {
        this.bizLicence = bizLicence == null ? null : bizLicence.trim();
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(Integer enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }
}