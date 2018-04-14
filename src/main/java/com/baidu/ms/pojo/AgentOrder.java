package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class AgentOrder implements Serializable {
    private Integer id;

    private Integer agentId;

    private Integer shopId;

    private String orderNo;

    private Date createTime;

    private Date updateTime;

    private Double orderMoney;

    private Double supplierCommission;

    private Date settleDate;

    private Short settleStatus;

    private Date orderTime;

    private Double platformCommission;

    private Integer orderStatus;

    private Integer orderId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Double getSupplierCommission() {
        return supplierCommission;
    }

    public void setSupplierCommission(Double supplierCommission) {
        this.supplierCommission = supplierCommission;
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    public Short getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Short settleStatus) {
        this.settleStatus = settleStatus;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Double getPlatformCommission() {
        return platformCommission;
    }

    public void setPlatformCommission(Double platformCommission) {
        this.platformCommission = platformCommission;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}