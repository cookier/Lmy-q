package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataVisitPagetype implements Serializable {
    private Integer id;

    private Integer pagetypeId;

    private String pagetypeName;

    private Integer pv;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPagetypeId() {
        return pagetypeId;
    }

    public void setPagetypeId(Integer pagetypeId) {
        this.pagetypeId = pagetypeId;
    }

    public String getPagetypeName() {
        return pagetypeName;
    }

    public void setPagetypeName(String pagetypeName) {
        this.pagetypeName = pagetypeName == null ? null : pagetypeName.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getCalcuDate() {
        return calcuDate;
    }

    public void setCalcuDate(Date calcuDate) {
        this.calcuDate = calcuDate;
    }
}