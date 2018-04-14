package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityRewardsLog implements Serializable {
    private Integer id;

    private Integer activityId;

    private Date createTime;

    private Integer rewardRuleId;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRewardRuleId() {
        return rewardRuleId;
    }

    public void setRewardRuleId(Integer rewardRuleId) {
        this.rewardRuleId = rewardRuleId;
    }
}