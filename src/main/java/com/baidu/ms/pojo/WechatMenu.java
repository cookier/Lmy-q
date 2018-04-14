package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class WechatMenu implements Serializable {
    private Integer id;

    private Integer shopId;

    private Date createTime;

    private Date updateTime;

    private Short enableFlag;

    private String content;

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

    public Short getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Short enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}