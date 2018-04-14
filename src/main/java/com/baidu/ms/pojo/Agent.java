package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Agent implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer parentId;

    private Integer level;

    private Date createTime;

    private Date updateTime;

    private String name;

    private Double totalMoney;

    private Integer tradeNo;

    private Double settledMoney;

    private Double unsettledMoney;

    private Float commissionRate;

    private Integer deleteFlag;

    private Integer status;

    private Double yesterdayMoney;

    private String shareUrl;

    private String qrPath;

    private String qrUrl;

    private String areas;

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(Integer tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Double getSettledMoney() {
        return settledMoney;
    }

    public void setSettledMoney(Double settledMoney) {
        this.settledMoney = settledMoney;
    }

    public Double getUnsettledMoney() {
        return unsettledMoney;
    }

    public void setUnsettledMoney(Double unsettledMoney) {
        this.unsettledMoney = unsettledMoney;
    }

    public Float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getYesterdayMoney() {
        return yesterdayMoney;
    }

    public void setYesterdayMoney(Double yesterdayMoney) {
        this.yesterdayMoney = yesterdayMoney;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl == null ? null : shareUrl.trim();
    }

    public String getQrPath() {
        return qrPath;
    }

    public void setQrPath(String qrPath) {
        this.qrPath = qrPath == null ? null : qrPath.trim();
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl == null ? null : qrUrl.trim();
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas == null ? null : areas.trim();
    }
}