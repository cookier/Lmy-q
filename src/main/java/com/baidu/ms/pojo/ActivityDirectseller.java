package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityDirectseller implements Serializable {
    private Integer id;

    private Integer shopId;

    private String title;

    private Short expTimeType;

    private Short allowSellerBuy;

    private Short allowRecruit;

    private Short autoSettle;

    private Float cpsRate;

    private Date updateTime;

    private Date createTime;

    private Short flag;

    private String url;

    private String content;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Short getExpTimeType() {
        return expTimeType;
    }

    public void setExpTimeType(Short expTimeType) {
        this.expTimeType = expTimeType;
    }

    public Short getAllowSellerBuy() {
        return allowSellerBuy;
    }

    public void setAllowSellerBuy(Short allowSellerBuy) {
        this.allowSellerBuy = allowSellerBuy;
    }

    public Short getAllowRecruit() {
        return allowRecruit;
    }

    public void setAllowRecruit(Short allowRecruit) {
        this.allowRecruit = allowRecruit;
    }

    public Short getAutoSettle() {
        return autoSettle;
    }

    public void setAutoSettle(Short autoSettle) {
        this.autoSettle = autoSettle;
    }

    public Float getCpsRate() {
        return cpsRate;
    }

    public void setCpsRate(Float cpsRate) {
        this.cpsRate = cpsRate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}