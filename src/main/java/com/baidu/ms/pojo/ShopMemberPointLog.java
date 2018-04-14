package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopMemberPointLog implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer userId;

    private String lName;

    private Integer lValue;

    private Date createTime;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName == null ? null : lName.trim();
    }

    public Integer getlValue() {
        return lValue;
    }

    public void setlValue(Integer lValue) {
        this.lValue = lValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}