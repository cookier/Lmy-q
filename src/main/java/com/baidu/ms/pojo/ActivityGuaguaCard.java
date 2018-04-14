package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityGuaguaCard implements Serializable {
    private Integer id;

    private Integer shopId;

    private String title;

    private Date createTime;

    private Date updateTime;

    private Date startTime;

    private Date endTime;

    private String intro;

    private Integer consumePoint;

    private Integer userLimit;

    private Integer givePoint;

    private Integer givePointToNoPrizeOnly;

    private Integer timeLimit;

    private Integer probability;

    private String successTip;

    private String failedTip;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public Integer getConsumePoint() {
        return consumePoint;
    }

    public void setConsumePoint(Integer consumePoint) {
        this.consumePoint = consumePoint;
    }

    public Integer getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(Integer userLimit) {
        this.userLimit = userLimit;
    }

    public Integer getGivePoint() {
        return givePoint;
    }

    public void setGivePoint(Integer givePoint) {
        this.givePoint = givePoint;
    }

    public Integer getGivePointToNoPrizeOnly() {
        return givePointToNoPrizeOnly;
    }

    public void setGivePointToNoPrizeOnly(Integer givePointToNoPrizeOnly) {
        this.givePointToNoPrizeOnly = givePointToNoPrizeOnly;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public String getSuccessTip() {
        return successTip;
    }

    public void setSuccessTip(String successTip) {
        this.successTip = successTip == null ? null : successTip.trim();
    }

    public String getFailedTip() {
        return failedTip;
    }

    public void setFailedTip(String failedTip) {
        this.failedTip = failedTip == null ? null : failedTip.trim();
    }
}