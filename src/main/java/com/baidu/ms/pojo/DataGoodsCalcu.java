package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataGoodsCalcu implements Serializable {
    private Integer id;

    private String goodsName;

    private Integer goodsId;

    private Integer exposure;

    private Integer exposureReach;

    private Integer browserUv;

    private Integer browserPv;

    private Integer exportUv;

    private Integer exportPv;

    private Integer clickBuy;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getExposure() {
        return exposure;
    }

    public void setExposure(Integer exposure) {
        this.exposure = exposure;
    }

    public Integer getExposureReach() {
        return exposureReach;
    }

    public void setExposureReach(Integer exposureReach) {
        this.exposureReach = exposureReach;
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

    public Integer getExportUv() {
        return exportUv;
    }

    public void setExportUv(Integer exportUv) {
        this.exportUv = exportUv;
    }

    public Integer getExportPv() {
        return exportPv;
    }

    public void setExportPv(Integer exportPv) {
        this.exportPv = exportPv;
    }

    public Integer getClickBuy() {
        return clickBuy;
    }

    public void setClickBuy(Integer clickBuy) {
        this.clickBuy = clickBuy;
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