package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class CheckinRecord implements Serializable {
    private Integer id;

    private Integer activityId;

    private Integer userId;

    private Date firstCheckinTime;

    private Date lastCheckinTime;

    private Integer totalTimes;

    private Integer totalContinuouTimes;

    private Integer points;

    private String coupons;

    private String gifts;

    private String userInfo;

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

    public Date getFirstCheckinTime() {
        return firstCheckinTime;
    }

    public void setFirstCheckinTime(Date firstCheckinTime) {
        this.firstCheckinTime = firstCheckinTime;
    }

    public Date getLastCheckinTime() {
        return lastCheckinTime;
    }

    public void setLastCheckinTime(Date lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    public Integer getTotalTimes() {
        return totalTimes;
    }

    public void setTotalTimes(Integer totalTimes) {
        this.totalTimes = totalTimes;
    }

    public Integer getTotalContinuouTimes() {
        return totalContinuouTimes;
    }

    public void setTotalContinuouTimes(Integer totalContinuouTimes) {
        this.totalContinuouTimes = totalContinuouTimes;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getCoupons() {
        return coupons;
    }

    public void setCoupons(String coupons) {
        this.coupons = coupons == null ? null : coupons.trim();
    }

    public String getGifts() {
        return gifts;
    }

    public void setGifts(String gifts) {
        this.gifts = gifts == null ? null : gifts.trim();
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }
}