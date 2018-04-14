package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityParticipationBlanklist implements Serializable {
    private Integer id;

    private Integer activityId;

    private Integer userId;

    private Integer apId;

    private String excludeRuleIds;

    private Integer activityDataRetainFlag;

    private Date invalidTime;

    private Integer invalidStatus;

    private String remark;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getApId() {
        return apId;
    }

    public void setApId(Integer apId) {
        this.apId = apId;
    }

    public String getExcludeRuleIds() {
        return excludeRuleIds;
    }

    public void setExcludeRuleIds(String excludeRuleIds) {
        this.excludeRuleIds = excludeRuleIds == null ? null : excludeRuleIds.trim();
    }

    public Integer getActivityDataRetainFlag() {
        return activityDataRetainFlag;
    }

    public void setActivityDataRetainFlag(Integer activityDataRetainFlag) {
        this.activityDataRetainFlag = activityDataRetainFlag;
    }

    public Date getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
    }

    public Integer getInvalidStatus() {
        return invalidStatus;
    }

    public void setInvalidStatus(Integer invalidStatus) {
        this.invalidStatus = invalidStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}