package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataVisitLocal implements Serializable {
    private Integer id;

    private String provinceId;

    private String provinceName;

    private Integer browserUv;

    private Integer browserPv;

    private Integer reachUv;

    private Integer reachPv;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getBrowserUv() {
        return browserUv;
    }

    public void setBrowserUv(Integer browserUv) {
        this.browserUv = browserUv;
    }

    public Integer getBrowserPv() {
        return browserPv;
    }

    public void setBrowserPv(Integer browserPv) {
        this.browserPv = browserPv;
    }

    public Integer getReachUv() {
        return reachUv;
    }

    public void setReachUv(Integer reachUv) {
        this.reachUv = reachUv;
    }

    public Integer getReachPv() {
        return reachPv;
    }

    public void setReachPv(Integer reachPv) {
        this.reachPv = reachPv;
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