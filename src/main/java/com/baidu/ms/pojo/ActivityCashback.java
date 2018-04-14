package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityCashback implements Serializable {
    private Integer id;

    private Integer shopId;

    private String name;

    private Date startTime;

    private Date endTime;

    private Integer cashbackMethod;

    private Integer cashbackStart;

    private Integer cashbackEnd;

    private Integer cashbackLimit;

    private Date createTime;

    private Integer deleteFlag;

    private Integer rangeType;

    private Date updateTime;

    private Integer status;

    private String goodsArray;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCashbackMethod() {
        return cashbackMethod;
    }

    public void setCashbackMethod(Integer cashbackMethod) {
        this.cashbackMethod = cashbackMethod;
    }

    public Integer getCashbackStart() {
        return cashbackStart;
    }

    public void setCashbackStart(Integer cashbackStart) {
        this.cashbackStart = cashbackStart;
    }

    public Integer getCashbackEnd() {
        return cashbackEnd;
    }

    public void setCashbackEnd(Integer cashbackEnd) {
        this.cashbackEnd = cashbackEnd;
    }

    public Integer getCashbackLimit() {
        return cashbackLimit;
    }

    public void setCashbackLimit(Integer cashbackLimit) {
        this.cashbackLimit = cashbackLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getRangeType() {
        return rangeType;
    }

    public void setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGoodsArray() {
        return goodsArray;
    }

    public void setGoodsArray(String goodsArray) {
        this.goodsArray = goodsArray == null ? null : goodsArray.trim();
    }
}