package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class BonusNumRecord implements Serializable {
    private Integer id;

    private Integer userId;

    private Date billingTime;

    private Integer placesNum;

    private String source;

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

    public Date getBillingTime() {
        return billingTime;
    }

    public void setBillingTime(Date billingTime) {
        this.billingTime = billingTime;
    }

    public Integer getPlacesNum() {
        return placesNum;
    }

    public void setPlacesNum(Integer placesNum) {
        this.placesNum = placesNum;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}