package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class WechatNews implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer type;

    private String mpId;

    private Date sendTime;

    private Integer status;

    private Integer sendCount;

    private Integer filterCount;

    private Integer failFansNum;

    private Integer successFansNum;

    private String openids;

    private Date createTime;

    private Date updateTime;

    private Short deleteFlag;

    private String items;

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

    public String getMpId() {
        return mpId;
    }

    public void setMpId(String mpId) {
        this.mpId = mpId == null ? null : mpId.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSendCount() {
        return sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    public Integer getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(Integer filterCount) {
        this.filterCount = filterCount;
    }

    public Integer getFailFansNum() {
        return failFansNum;
    }

    public void setFailFansNum(Integer failFansNum) {
        this.failFansNum = failFansNum;
    }

    public Integer getSuccessFansNum() {
        return successFansNum;
    }

    public void setSuccessFansNum(Integer successFansNum) {
        this.successFansNum = successFansNum;
    }

    public String getOpenids() {
        return openids;
    }

    public void setOpenids(String openids) {
        this.openids = openids == null ? null : openids.trim();
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

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }
}