package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class WechatAutoReplyRule implements Serializable {
    private Integer ruleId;

    private Integer shopId;

    private String ruleName;

    private Short ruleType;

    private Integer activityId;

    private Short replyType;

    private Short deleteFlag;

    private Short enableFlag;

    private Date createTime;

    private Date updateTime;

    private String settings;

    private static final long serialVersionUID = 1L;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public Short getRuleType() {
        return ruleType;
    }

    public void setRuleType(Short ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Short getReplyType() {
        return replyType;
    }

    public void setReplyType(Short replyType) {
        this.replyType = replyType;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Short getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Short enableFlag) {
        this.enableFlag = enableFlag;
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

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings == null ? null : settings.trim();
    }
}