package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Document implements Serializable {
    private Integer id;

    private Integer userId;

    private String title;

    private String digest;

    private String keywords;

    private String url;

    private Date createTime;

    private Date updateTime;

    private Short clickCount;

    private Short commentClick;

    private Short deleteFlag;

    private Short interactFlag;

    private Short releaseStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public Short getClickCount() {
        return clickCount;
    }

    public void setClickCount(Short clickCount) {
        this.clickCount = clickCount;
    }

    public Short getCommentClick() {
        return commentClick;
    }

    public void setCommentClick(Short commentClick) {
        this.commentClick = commentClick;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Short getInteractFlag() {
        return interactFlag;
    }

    public void setInteractFlag(Short interactFlag) {
        this.interactFlag = interactFlag;
    }

    public Short getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(Short releaseStatus) {
        this.releaseStatus = releaseStatus;
    }
}