package com.baidu.ms.pojo;

import java.io.Serializable;

public class CheckinRule implements Serializable {
    private Integer id;

    private Integer activityId;

    private Integer checkinTimes;

    private Integer points;

    private Integer couponId;

    private Integer giftId;

    private Integer peopleOnce;

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

    public Integer getCheckinTimes() {
        return checkinTimes;
    }

    public void setCheckinTimes(Integer checkinTimes) {
        this.checkinTimes = checkinTimes;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public Integer getPeopleOnce() {
        return peopleOnce;
    }

    public void setPeopleOnce(Integer peopleOnce) {
        this.peopleOnce = peopleOnce;
    }
}