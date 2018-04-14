package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable {
    private Integer id;

    private String shopNo;

    private Integer userId;

    private String shopName;

    private String intro;

    private String qrPath;

    private String qrUrl;

    private Integer certificationType;

    private Integer certificationStatus;

    private String certificationInfo;

    private Date openTime;

    private Date closeTime;

    private String contactName;

    private String contactQq;

    private String contactMobile;

    private String contactWeixin;

    private String servicePhone;

    private Integer countryId;

    private String countryName;

    private Integer provinceId;

    private String provinceName;

    private Integer cityId;

    private String cityName;

    private Integer areaId;

    private String areaName;

    private Integer streetId;

    private String streetName;

    private String shopAddress;

    private Date createTime;

    private String goodsCategory;

    private String commonSetting;

    private String tradeSetting;

    private String logo;

    private String logoUrl;

    private String weixinSetting;

    private String paymentSetting;

    private String url;

    private Float commissionRate;

    private Integer deleteFlag;

    private String refundSetting;

    private Short logoUpdateFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo == null ? null : shopNo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getQrPath() {
        return qrPath;
    }

    public void setQrPath(String qrPath) {
        this.qrPath = qrPath == null ? null : qrPath.trim();
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl == null ? null : qrUrl.trim();
    }

    public Integer getCertificationType() {
        return certificationType;
    }

    public void setCertificationType(Integer certificationType) {
        this.certificationType = certificationType;
    }

    public Integer getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(Integer certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public String getCertificationInfo() {
        return certificationInfo;
    }

    public void setCertificationInfo(String certificationInfo) {
        this.certificationInfo = certificationInfo == null ? null : certificationInfo.trim();
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactQq() {
        return contactQq;
    }

    public void setContactQq(String contactQq) {
        this.contactQq = contactQq == null ? null : contactQq.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getContactWeixin() {
        return contactWeixin;
    }

    public void setContactWeixin(String contactWeixin) {
        this.contactWeixin = contactWeixin == null ? null : contactWeixin.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory == null ? null : goodsCategory.trim();
    }

    public String getCommonSetting() {
        return commonSetting;
    }

    public void setCommonSetting(String commonSetting) {
        this.commonSetting = commonSetting == null ? null : commonSetting.trim();
    }

    public String getTradeSetting() {
        return tradeSetting;
    }

    public void setTradeSetting(String tradeSetting) {
        this.tradeSetting = tradeSetting == null ? null : tradeSetting.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getWeixinSetting() {
        return weixinSetting;
    }

    public void setWeixinSetting(String weixinSetting) {
        this.weixinSetting = weixinSetting == null ? null : weixinSetting.trim();
    }

    public String getPaymentSetting() {
        return paymentSetting;
    }

    public void setPaymentSetting(String paymentSetting) {
        this.paymentSetting = paymentSetting == null ? null : paymentSetting.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRefundSetting() {
        return refundSetting;
    }

    public void setRefundSetting(String refundSetting) {
        this.refundSetting = refundSetting == null ? null : refundSetting.trim();
    }

    public Short getLogoUpdateFlag() {
        return logoUpdateFlag;
    }

    public void setLogoUpdateFlag(Short logoUpdateFlag) {
        this.logoUpdateFlag = logoUpdateFlag;
    }
}