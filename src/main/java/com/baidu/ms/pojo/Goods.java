package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private Integer id;

    private Integer fxGoodsId;

    private Integer shopId;

    private Integer showStockFlag;

    private Integer stock;

    private Integer defaultPicId;

    private String defaultPicUrl;

    private Integer haveInvoice;

    private Integer canRepair;

    private String subTitle;

    private String skuName;

    private String skuValue;

    private String title;

    private Date updateTime;

    private Integer productType;

    private Integer quota;

    private Integer saleTimeModel;

    private Date saleTime;

    private Integer onShelfStatus;

    private Date offShelfTime;

    private Integer discountFlag;

    private Integer deleteFlag;

    private Integer deliveryModel;

    private Double postage;

    private Integer transTemplateId;

    private Integer saleModel;

    private String salePrice;

    private Double productPrice;

    private Integer discount;

    private Double discountPrice;

    private Integer showTemplate;

    private String url;

    private String qrUrl;

    private String qrPath;

    private String category;

    private String sellerCode;

    private Date createTime;

    private Double fxPrice;

    private Double supplyPrice;

    private Double maxRetailPrice;

    private Double minRetailPrice;

    private Integer auditingStatus;

    private String auditingRemark;

    private Integer proxyFlag;

    private Integer brandDirectSaleFlag;

    private Integer brandId;

    private Integer saleCount;

    private Integer clickCount;

    private Float compScore;

    private Short synchronizeStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFxGoodsId() {
        return fxGoodsId;
    }

    public void setFxGoodsId(Integer fxGoodsId) {
        this.fxGoodsId = fxGoodsId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getShowStockFlag() {
        return showStockFlag;
    }

    public void setShowStockFlag(Integer showStockFlag) {
        this.showStockFlag = showStockFlag;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getDefaultPicId() {
        return defaultPicId;
    }

    public void setDefaultPicId(Integer defaultPicId) {
        this.defaultPicId = defaultPicId;
    }

    public String getDefaultPicUrl() {
        return defaultPicUrl;
    }

    public void setDefaultPicUrl(String defaultPicUrl) {
        this.defaultPicUrl = defaultPicUrl == null ? null : defaultPicUrl.trim();
    }

    public Integer getHaveInvoice() {
        return haveInvoice;
    }

    public void setHaveInvoice(Integer haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public Integer getCanRepair() {
        return canRepair;
    }

    public void setCanRepair(Integer canRepair) {
        this.canRepair = canRepair;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public String getSkuValue() {
        return skuValue;
    }

    public void setSkuValue(String skuValue) {
        this.skuValue = skuValue == null ? null : skuValue.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getSaleTimeModel() {
        return saleTimeModel;
    }

    public void setSaleTimeModel(Integer saleTimeModel) {
        this.saleTimeModel = saleTimeModel;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getOnShelfStatus() {
        return onShelfStatus;
    }

    public void setOnShelfStatus(Integer onShelfStatus) {
        this.onShelfStatus = onShelfStatus;
    }

    public Date getOffShelfTime() {
        return offShelfTime;
    }

    public void setOffShelfTime(Date offShelfTime) {
        this.offShelfTime = offShelfTime;
    }

    public Integer getDiscountFlag() {
        return discountFlag;
    }

    public void setDiscountFlag(Integer discountFlag) {
        this.discountFlag = discountFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeliveryModel() {
        return deliveryModel;
    }

    public void setDeliveryModel(Integer deliveryModel) {
        this.deliveryModel = deliveryModel;
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public Integer getTransTemplateId() {
        return transTemplateId;
    }

    public void setTransTemplateId(Integer transTemplateId) {
        this.transTemplateId = transTemplateId;
    }

    public Integer getSaleModel() {
        return saleModel;
    }

    public void setSaleModel(Integer saleModel) {
        this.saleModel = saleModel;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice == null ? null : salePrice.trim();
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Integer getShowTemplate() {
        return showTemplate;
    }

    public void setShowTemplate(Integer showTemplate) {
        this.showTemplate = showTemplate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl == null ? null : qrUrl.trim();
    }

    public String getQrPath() {
        return qrPath;
    }

    public void setQrPath(String qrPath) {
        this.qrPath = qrPath == null ? null : qrPath.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode == null ? null : sellerCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Double getMaxRetailPrice() {
        return maxRetailPrice;
    }

    public void setMaxRetailPrice(Double maxRetailPrice) {
        this.maxRetailPrice = maxRetailPrice;
    }

    public Double getMinRetailPrice() {
        return minRetailPrice;
    }

    public void setMinRetailPrice(Double minRetailPrice) {
        this.minRetailPrice = minRetailPrice;
    }

    public Integer getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(Integer auditingStatus) {
        this.auditingStatus = auditingStatus;
    }

    public String getAuditingRemark() {
        return auditingRemark;
    }

    public void setAuditingRemark(String auditingRemark) {
        this.auditingRemark = auditingRemark == null ? null : auditingRemark.trim();
    }

    public Integer getProxyFlag() {
        return proxyFlag;
    }

    public void setProxyFlag(Integer proxyFlag) {
        this.proxyFlag = proxyFlag;
    }

    public Integer getBrandDirectSaleFlag() {
        return brandDirectSaleFlag;
    }

    public void setBrandDirectSaleFlag(Integer brandDirectSaleFlag) {
        this.brandDirectSaleFlag = brandDirectSaleFlag;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Float getCompScore() {
        return compScore;
    }

    public void setCompScore(Float compScore) {
        this.compScore = compScore;
    }

    public Short getSynchronizeStatus() {
        return synchronizeStatus;
    }

    public void setSynchronizeStatus(Short synchronizeStatus) {
        this.synchronizeStatus = synchronizeStatus;
    }
}