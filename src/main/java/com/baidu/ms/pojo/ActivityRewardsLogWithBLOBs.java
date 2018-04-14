package com.baidu.ms.pojo;

import java.io.Serializable;

public class ActivityRewardsLogWithBLOBs extends ActivityRewardsLog implements Serializable {
    private String prize;

    private String rewardsObject;

    private static final long serialVersionUID = 1L;

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize == null ? null : prize.trim();
    }

    public String getRewardsObject() {
        return rewardsObject;
    }

    public void setRewardsObject(String rewardsObject) {
        this.rewardsObject = rewardsObject == null ? null : rewardsObject.trim();
    }
}