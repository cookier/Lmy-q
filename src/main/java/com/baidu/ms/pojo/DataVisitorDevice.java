package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataVisitorDevice implements Serializable {
    private Integer id;

    private Integer ios;

    private Integer android;

    private Integer otherDevice;

    private Integer wechatBrowser;

    private Integer otherBrowser;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIos() {
        return ios;
    }

    public void setIos(Integer ios) {
        this.ios = ios;
    }

    public Integer getAndroid() {
        return android;
    }

    public void setAndroid(Integer android) {
        this.android = android;
    }

    public Integer getOtherDevice() {
        return otherDevice;
    }

    public void setOtherDevice(Integer otherDevice) {
        this.otherDevice = otherDevice;
    }

    public Integer getWechatBrowser() {
        return wechatBrowser;
    }

    public void setWechatBrowser(Integer wechatBrowser) {
        this.wechatBrowser = wechatBrowser;
    }

    public Integer getOtherBrowser() {
        return otherBrowser;
    }

    public void setOtherBrowser(Integer otherBrowser) {
        this.otherBrowser = otherBrowser;
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