package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataPageCalcu implements Serializable {
    private Integer id;

    private Integer browserPv;

    private Integer browserUv;

    private Integer sharePv;

    private Integer exportPv;

    private Integer exposure;

    private Integer meanDepth;

    private Integer meanTime;

    private Integer exposureReach;

    private Integer orderCount;

    private Integer payOrder;

    private Double payAmount;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrowserPv() {
        return browserPv;
    }

    public void setBrowserPv(Integer browserPv) {
        this.browserPv = browserPv;
    }

    public Integer getBrowserUv() {
        return browserUv;
    }

    public void setBrowserUv(Integer browserUv) {
        this.browserUv = browserUv;
    }

    public Integer getSharePv() {
        return sharePv;
    }

    public void setSharePv(Integer sharePv) {
        this.sharePv = sharePv;
    }

    public Integer getExportPv() {
        return exportPv;
    }

    public void setExportPv(Integer exportPv) {
        this.exportPv = exportPv;
    }

    public Integer getExposure() {
        return exposure;
    }

    public void setExposure(Integer exposure) {
        this.exposure = exposure;
    }

    public Integer getMeanDepth() {
        return meanDepth;
    }

    public void setMeanDepth(Integer meanDepth) {
        this.meanDepth = meanDepth;
    }

    public Integer getMeanTime() {
        return meanTime;
    }

    public void setMeanTime(Integer meanTime) {
        this.meanTime = meanTime;
    }

    public Integer getExposureReach() {
        return exposureReach;
    }

    public void setExposureReach(Integer exposureReach) {
        this.exposureReach = exposureReach;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(Integer payOrder) {
        this.payOrder = payOrder;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
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