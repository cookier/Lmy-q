package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityBonusDistribution implements Serializable {
    private Integer id;

    private Integer activityId;

    private String rangeType;

    private String range;

    private Date updateTime;

    private Date createTime;

    private Integer deleteFlag;

    private String distributionDetails;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType == null ? null : rangeType.trim();
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getDistributionDetails() {
        return distributionDetails;
    }

    public void setDistributionDetails(String distributionDetails) {
        this.distributionDetails = distributionDetails == null ? null : distributionDetails.trim();
    }
}