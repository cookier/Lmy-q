package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class CouponCode implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer orderLimitFlag;

    private Double orderMoneyLimit;

    private String backgroundName;

    private String backgroundValue;

    private Integer canAttorn;

    private String codeNo;

    private Integer codeType;

    private String cardNo;

    private String useCondition;

    private Integer type;

    private Date createTime;

    private String useInstructions;

    private Date validTime;

    private Date expireTime;

    private Integer expireFlag;

    private Integer extendSetting;

    private Integer syncWechatFlag;

    private String name;

    private Integer eachOneLimitCount;

    private Integer useRange;

    private Integer usedByFullrates;

    private String servicePhone;

    private Integer issueQuantity;

    private Integer canReceiveQuantity;

    private Integer receivedPeopleCount;

    private Integer usedCount;

    private Date updateTime;

    private String couponUrl;

    private Integer vipLevelLimit;

    private String vipLevelName;

    private Double amount;

    private String wechatCardNoticeContent;

    private String wechatCardTitle;

    private String wechatCardSubTitle;

    private Integer invalidStatus;

    private Short source;

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

    public Integer getOrderLimitFlag() {
        return orderLimitFlag;
    }

    public void setOrderLimitFlag(Integer orderLimitFlag) {
        this.orderLimitFlag = orderLimitFlag;
    }

    public Double getOrderMoneyLimit() {
        return orderMoneyLimit;
    }

    public void setOrderMoneyLimit(Double orderMoneyLimit) {
        this.orderMoneyLimit = orderMoneyLimit;
    }

    public String getBackgroundName() {
        return backgroundName;
    }

    public void setBackgroundName(String backgroundName) {
        this.backgroundName = backgroundName == null ? null : backgroundName.trim();
    }

    public String getBackgroundValue() {
        return backgroundValue;
    }

    public void setBackgroundValue(String backgroundValue) {
        this.backgroundValue = backgroundValue == null ? null : backgroundValue.trim();
    }

    public Integer getCanAttorn() {
        return canAttorn;
    }

    public void setCanAttorn(Integer canAttorn) {
        this.canAttorn = canAttorn;
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo == null ? null : codeNo.trim();
    }

    public Integer getCodeType() {
        return codeType;
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition == null ? null : useCondition.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUseInstructions() {
        return useInstructions;
    }

    public void setUseInstructions(String useInstructions) {
        this.useInstructions = useInstructions == null ? null : useInstructions.trim();
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

    public Integer getExpireFlag() {
        return expireFlag;
    }

    public void setExpireFlag(Integer expireFlag) {
        this.expireFlag = expireFlag;
    }

    public Integer getExtendSetting() {
        return extendSetting;
    }

    public void setExtendSetting(Integer extendSetting) {
        this.extendSetting = extendSetting;
    }

    public Integer getSyncWechatFlag() {
        return syncWechatFlag;
    }

    public void setSyncWechatFlag(Integer syncWechatFlag) {
        this.syncWechatFlag = syncWechatFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEachOneLimitCount() {
        return eachOneLimitCount;
    }

    public void setEachOneLimitCount(Integer eachOneLimitCount) {
        this.eachOneLimitCount = eachOneLimitCount;
    }

    public Integer getUseRange() {
        return useRange;
    }

    public void setUseRange(Integer useRange) {
        this.useRange = useRange;
    }

    public Integer getUsedByFullrates() {
        return usedByFullrates;
    }

    public void setUsedByFullrates(Integer usedByFullrates) {
        this.usedByFullrates = usedByFullrates;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public Integer getIssueQuantity() {
        return issueQuantity;
    }

    public void setIssueQuantity(Integer issueQuantity) {
        this.issueQuantity = issueQuantity;
    }

    public Integer getCanReceiveQuantity() {
        return canReceiveQuantity;
    }

    public void setCanReceiveQuantity(Integer canReceiveQuantity) {
        this.canReceiveQuantity = canReceiveQuantity;
    }

    public Integer getReceivedPeopleCount() {
        return receivedPeopleCount;
    }

    public void setReceivedPeopleCount(Integer receivedPeopleCount) {
        this.receivedPeopleCount = receivedPeopleCount;
    }

    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCouponUrl() {
        return couponUrl;
    }

    public void setCouponUrl(String couponUrl) {
        this.couponUrl = couponUrl == null ? null : couponUrl.trim();
    }

    public Integer getVipLevelLimit() {
        return vipLevelLimit;
    }

    public void setVipLevelLimit(Integer vipLevelLimit) {
        this.vipLevelLimit = vipLevelLimit;
    }

    public String getVipLevelName() {
        return vipLevelName;
    }

    public void setVipLevelName(String vipLevelName) {
        this.vipLevelName = vipLevelName == null ? null : vipLevelName.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getWechatCardNoticeContent() {
        return wechatCardNoticeContent;
    }

    public void setWechatCardNoticeContent(String wechatCardNoticeContent) {
        this.wechatCardNoticeContent = wechatCardNoticeContent == null ? null : wechatCardNoticeContent.trim();
    }

    public String getWechatCardTitle() {
        return wechatCardTitle;
    }

    public void setWechatCardTitle(String wechatCardTitle) {
        this.wechatCardTitle = wechatCardTitle == null ? null : wechatCardTitle.trim();
    }

    public String getWechatCardSubTitle() {
        return wechatCardSubTitle;
    }

    public void setWechatCardSubTitle(String wechatCardSubTitle) {
        this.wechatCardSubTitle = wechatCardSubTitle == null ? null : wechatCardSubTitle.trim();
    }

    public Integer getInvalidStatus() {
        return invalidStatus;
    }

    public void setInvalidStatus(Integer invalidStatus) {
        this.invalidStatus = invalidStatus;
    }

    public Short getSource() {
        return source;
    }

    public void setSource(Short source) {
        this.source = source;
    }
}