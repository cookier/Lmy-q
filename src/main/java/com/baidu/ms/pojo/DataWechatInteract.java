package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataWechatInteract implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer receiveMsg;

    private Integer sendMsg;

    private Integer menuClick;

    private Integer uv;

    private Integer pv;

    private Integer shopId;

    private Date calcuDate;

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

    public Integer getReceiveMsg() {
        return receiveMsg;
    }

    public void setReceiveMsg(Integer receiveMsg) {
        this.receiveMsg = receiveMsg;
    }

    public Integer getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(Integer sendMsg) {
        this.sendMsg = sendMsg;
    }

    public Integer getMenuClick() {
        return menuClick;
    }

    public void setMenuClick(Integer menuClick) {
        this.menuClick = menuClick;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getCalcuDate() {
        return calcuDate;
    }

    public void setCalcuDate(Date calcuDate) {
        this.calcuDate = calcuDate;
    }
}