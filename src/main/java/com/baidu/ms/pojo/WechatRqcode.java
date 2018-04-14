package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class WechatRqcode implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer type;

    private Integer dataId;

    private Integer dataSignType;

    private Integer dataType;

    private String ticket;

    private String url;

    private Integer scanTimes;

    private Integer sceneId;

    private Date lastScanTime;

    private Date createTime;

    private Short enableFlag;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getDataSignType() {
        return dataSignType;
    }

    public void setDataSignType(Integer dataSignType) {
        this.dataSignType = dataSignType;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getScanTimes() {
        return scanTimes;
    }

    public void setScanTimes(Integer scanTimes) {
        this.scanTimes = scanTimes;
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public Date getLastScanTime() {
        return lastScanTime;
    }

    public void setLastScanTime(Date lastScanTime) {
        this.lastScanTime = lastScanTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Short enableFlag) {
        this.enableFlag = enableFlag;
    }
}