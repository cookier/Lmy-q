package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class GoodsTags implements Serializable {
    private Integer id;

    private Integer shopId;

    private String groupName;

    private Short showGroupName;

    private Short sortPriority1;

    private Short sortPriority2;

    private Short listStyle;

    private Short itemStyle;

    private Short showProductName;

    private Short showPrice;

    private Short showCartIcon;

    private Short showBuyIcon;

    private Short showBuyIconStyle;

    private String groupLabelIntroduction;

    private Date createTime;

    private Date lastUpdateTime;

    private Short systemGroupFlag;

    private Short productCount;

    private Short deleteFlag;

    private String url;

    private String templateContent;

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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Short getShowGroupName() {
        return showGroupName;
    }

    public void setShowGroupName(Short showGroupName) {
        this.showGroupName = showGroupName;
    }

    public Short getSortPriority1() {
        return sortPriority1;
    }

    public void setSortPriority1(Short sortPriority1) {
        this.sortPriority1 = sortPriority1;
    }

    public Short getSortPriority2() {
        return sortPriority2;
    }

    public void setSortPriority2(Short sortPriority2) {
        this.sortPriority2 = sortPriority2;
    }

    public Short getListStyle() {
        return listStyle;
    }

    public void setListStyle(Short listStyle) {
        this.listStyle = listStyle;
    }

    public Short getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(Short itemStyle) {
        this.itemStyle = itemStyle;
    }

    public Short getShowProductName() {
        return showProductName;
    }

    public void setShowProductName(Short showProductName) {
        this.showProductName = showProductName;
    }

    public Short getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Short showPrice) {
        this.showPrice = showPrice;
    }

    public Short getShowCartIcon() {
        return showCartIcon;
    }

    public void setShowCartIcon(Short showCartIcon) {
        this.showCartIcon = showCartIcon;
    }

    public Short getShowBuyIcon() {
        return showBuyIcon;
    }

    public void setShowBuyIcon(Short showBuyIcon) {
        this.showBuyIcon = showBuyIcon;
    }

    public Short getShowBuyIconStyle() {
        return showBuyIconStyle;
    }

    public void setShowBuyIconStyle(Short showBuyIconStyle) {
        this.showBuyIconStyle = showBuyIconStyle;
    }

    public String getGroupLabelIntroduction() {
        return groupLabelIntroduction;
    }

    public void setGroupLabelIntroduction(String groupLabelIntroduction) {
        this.groupLabelIntroduction = groupLabelIntroduction == null ? null : groupLabelIntroduction.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Short getSystemGroupFlag() {
        return systemGroupFlag;
    }

    public void setSystemGroupFlag(Short systemGroupFlag) {
        this.systemGroupFlag = systemGroupFlag;
    }

    public Short getProductCount() {
        return productCount;
    }

    public void setProductCount(Short productCount) {
        this.productCount = productCount;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent == null ? null : templateContent.trim();
    }
}