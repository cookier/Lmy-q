package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ActivityParticipator implements Serializable {
    private Integer id;

    private Integer activityId;

    private Integer userId;

    private Date createTime;

    private Date updateTime;

    private String shareQrPath;

    private String shareQrUrl;

    private String shareLinkUrl;

    private Double sales;

    private Integer recommendNum;

    private Integer ranking;

    private Integer role;

    private Double remainderSales;

    private Integer remainderBonusNumber;

    private Double bonusTotalMoney;

    private Integer blanklistFlag;

    private String extrContent;

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

    public String getShareQrPath() {
        return shareQrPath;
    }

    public void setShareQrPath(String shareQrPath) {
        this.shareQrPath = shareQrPath == null ? null : shareQrPath.trim();
    }

    public String getShareQrUrl() {
        return shareQrUrl;
    }

    public void setShareQrUrl(String shareQrUrl) {
        this.shareQrUrl = shareQrUrl == null ? null : shareQrUrl.trim();
    }

    public String getShareLinkUrl() {
        return shareLinkUrl;
    }

    public void setShareLinkUrl(String shareLinkUrl) {
        this.shareLinkUrl = shareLinkUrl == null ? null : shareLinkUrl.trim();
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }

    public Integer getRecommendNum() {
        return recommendNum;
    }

    public void setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Double getRemainderSales() {
        return remainderSales;
    }

    public void setRemainderSales(Double remainderSales) {
        this.remainderSales = remainderSales;
    }

    public Integer getRemainderBonusNumber() {
        return remainderBonusNumber;
    }

    public void setRemainderBonusNumber(Integer remainderBonusNumber) {
        this.remainderBonusNumber = remainderBonusNumber;
    }

    public Double getBonusTotalMoney() {
        return bonusTotalMoney;
    }

    public void setBonusTotalMoney(Double bonusTotalMoney) {
        this.bonusTotalMoney = bonusTotalMoney;
    }

    public Integer getBlanklistFlag() {
        return blanklistFlag;
    }

    public void setBlanklistFlag(Integer blanklistFlag) {
        this.blanklistFlag = blanklistFlag;
    }

    public String getExtrContent() {
        return extrContent;
    }

    public void setExtrContent(String extrContent) {
        this.extrContent = extrContent == null ? null : extrContent.trim();
    }
}