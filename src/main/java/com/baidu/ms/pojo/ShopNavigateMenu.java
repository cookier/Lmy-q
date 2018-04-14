package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopNavigateMenu implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer styleType;

    private String pages;

    private Date createTime;

    private Date updateTime;

    private Integer enable;

    private String menuItem;

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

    public Integer getStyleType() {
        return styleType;
    }

    public void setStyleType(Integer styleType) {
        this.styleType = styleType;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages == null ? null : pages.trim();
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

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem == null ? null : menuItem.trim();
    }
}