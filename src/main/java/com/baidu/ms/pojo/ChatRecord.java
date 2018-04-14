package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ChatRecord implements Serializable {
    private Integer id;

    private Integer chatType;

    private Integer user1Id;

    private Integer user2Id;

    private Integer shop1Id;

    private Integer shop2Id;

    private Date createTime;

    private Date updateTime;

    private Integer lastTimeProxyReadLength;

    private Integer lastTimeSupplierReadLength;

    private Integer lastTimeSaveLength;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChatType() {
        return chatType;
    }

    public void setChatType(Integer chatType) {
        this.chatType = chatType;
    }

    public Integer getUser1Id() {
        return user1Id;
    }

    public void setUser1Id(Integer user1Id) {
        this.user1Id = user1Id;
    }

    public Integer getUser2Id() {
        return user2Id;
    }

    public void setUser2Id(Integer user2Id) {
        this.user2Id = user2Id;
    }

    public Integer getShop1Id() {
        return shop1Id;
    }

    public void setShop1Id(Integer shop1Id) {
        this.shop1Id = shop1Id;
    }

    public Integer getShop2Id() {
        return shop2Id;
    }

    public void setShop2Id(Integer shop2Id) {
        this.shop2Id = shop2Id;
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

    public Integer getLastTimeProxyReadLength() {
        return lastTimeProxyReadLength;
    }

    public void setLastTimeProxyReadLength(Integer lastTimeProxyReadLength) {
        this.lastTimeProxyReadLength = lastTimeProxyReadLength;
    }

    public Integer getLastTimeSupplierReadLength() {
        return lastTimeSupplierReadLength;
    }

    public void setLastTimeSupplierReadLength(Integer lastTimeSupplierReadLength) {
        this.lastTimeSupplierReadLength = lastTimeSupplierReadLength;
    }

    public Integer getLastTimeSaveLength() {
        return lastTimeSaveLength;
    }

    public void setLastTimeSaveLength(Integer lastTimeSaveLength) {
        this.lastTimeSaveLength = lastTimeSaveLength;
    }
}