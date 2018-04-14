package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class WechatGroupsend implements Serializable {
    private Integer id;

    private Integer shopId;

    private Date createTime;

    private String type;

    private Integer mpId;

    private Date sendTime;

    private Integer status;

    private Integer sendCount;

    private Integer filterCount;

    private Integer failFansNum;

    private Integer successFansNum;

    private String openids;

    private Date updateTime;

    private Integer deleteFlag;

    private String content;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getMpId() {
        return mpId;
    }

    public void setMpId(Integer mpId) {
        this.mpId = mpId;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}