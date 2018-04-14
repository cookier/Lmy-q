package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataQrcodeCalcu implements Serializable {
    private Integer id;

    private Integer scanTimes;

    private Integer scanPersons;

    private Integer addedFans;

    private Integer browserUv;

    private Integer browserPv;

    private Integer addTag;

    private Integer orderCount;

    private Integer buyerCount;

    private Integer payPersons;

    private Integer payOrders;

    private Double payAmount;

    private Integer payGoods;

    private Integer shopId;

    private Date calcuDate;

    private Integer fansNew;

    private Integer fansOld;

    private Integer qrcode1;

    private Integer qrcode2;

    private Integer qrcode3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScanTimes() {
        return scanTimes;
    }

    public void setScanTimes(Integer scanTimes) {
        this.scanTimes = scanTimes;
    }

    public Integer getScanPersons() {
        return scanPersons;
    }

    public void setScanPersons(Integer scanPersons) {
        this.scanPersons = scanPersons;
    }

    public Integer getAddedFans() {
        return addedFans;
    }

    public void setAddedFans(Integer addedFans) {
        this.addedFans = addedFans;
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

    public Integer getAddTag() {
        return addTag;
    }

    public void setAddTag(Integer addTag) {
        this.addTag = addTag;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getBuyerCount() {
        return buyerCount;
    }

    public void setBuyerCount(Integer buyerCount) {
        this.buyerCount = buyerCount;
    }

    public Integer getPayPersons() {
        return payPersons;
    }

    public void setPayPersons(Integer payPersons) {
        this.payPersons = payPersons;
    }

    public Integer getPayOrders() {
        return payOrders;
    }

    public void setPayOrders(Integer payOrders) {
        this.payOrders = payOrders;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPayGoods() {
        return payGoods;
    }

    public void setPayGoods(Integer payGoods) {
        this.payGoods = payGoods;
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

    public Integer getFansNew() {
        return fansNew;
    }

    public void setFansNew(Integer fansNew) {
        this.fansNew = fansNew;
    }

    public Integer getFansOld() {
        return fansOld;
    }

    public void setFansOld(Integer fansOld) {
        this.fansOld = fansOld;
    }

    public Integer getQrcode1() {
        return qrcode1;
    }

    public void setQrcode1(Integer qrcode1) {
        this.qrcode1 = qrcode1;
    }

    public Integer getQrcode2() {
        return qrcode2;
    }

    public void setQrcode2(Integer qrcode2) {
        this.qrcode2 = qrcode2;
    }

    public Integer getQrcode3() {
        return qrcode3;
    }

    public void setQrcode3(Integer qrcode3) {
        this.qrcode3 = qrcode3;
    }
}