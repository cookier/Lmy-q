package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopPage implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer pageType;

    private String title;

    private String category;

    private String url;

    private Date createTime;

    private Integer uv;

    private Integer pv;

    private Integer homepageFlag;

    private Date updateTime;

    private Short deleteFlag;

    private Short visibleFlag;

    private Short synchronizeStatus;

    private String templateData;

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

    public Integer getPageType() {
        return pageType;
    }

    public void setPageType(Integer pageType) {
        this.pageType = pageType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getHomepageFlag() {
        return homepageFlag;
    }

    public void setHomepageFlag(Integer homepageFlag) {
        this.homepageFlag = homepageFlag;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Short getVisibleFlag() {
        return visibleFlag;
    }

    public void setVisibleFlag(Short visibleFlag) {
        this.visibleFlag = visibleFlag;
    }

    public Short getSynchronizeStatus() {
        return synchronizeStatus;
    }

    public void setSynchronizeStatus(Short synchronizeStatus) {
        this.synchronizeStatus = synchronizeStatus;
    }

    public String getTemplateData() {
        return templateData;
    }

    public void setTemplateData(String templateData) {
        this.templateData = templateData == null ? null : templateData.trim();
    }
}