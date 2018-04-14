package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserDayBill implements Serializable {
    private Integer id;

    private Integer agentId;

    private Integer userId;

    private Double money;

    private Date craeteTime;

    private Date lastBillingTime;

    private Integer deleteFlag;

    private Integer billType;

    private String moneyOperationRecord;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCraeteTime() {
        return craeteTime;
    }

    public void setCraeteTime(Date craeteTime) {
        this.craeteTime = craeteTime;
    }

    public Date getLastBillingTime() {
        return lastBillingTime;
    }

    public void setLastBillingTime(Date lastBillingTime) {
        this.lastBillingTime = lastBillingTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getMoneyOperationRecord() {
        return moneyOperationRecord;
    }

    public void setMoneyOperationRecord(String moneyOperationRecord) {
        this.moneyOperationRecord = moneyOperationRecord == null ? null : moneyOperationRecord.trim();
    }
}