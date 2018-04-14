package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserAccount implements Serializable {
    private Integer userId;

    private Double availableMoney;

    private Double settlementMoney;

    private Double depositMoney;

    private String bankName;

    private String bankCardNumber;

    private String bankDepositName;

    private String payPassword;

    private String alipayAccount;

    private String alipayValidName;

    private String wechatAccount;

    private String wecharValidName;

    private Double deductPercentage;

    private Date updateTime;

    private Integer bonusNum;

    private Double bonusMoney;

    private Double commissionMoney;

    private Date lastDaySettlementDate;

    private Date lastDividendQuotaSettlementDate;

    private Double orderCommissionMoney;

    private Double lastDaySettlementAvailableMoney;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(Double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public Double getSettlementMoney() {
        return settlementMoney;
    }

    public void setSettlementMoney(Double settlementMoney) {
        this.settlementMoney = settlementMoney;
    }

    public Double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber == null ? null : bankCardNumber.trim();
    }

    public String getBankDepositName() {
        return bankDepositName;
    }

    public void setBankDepositName(String bankDepositName) {
        this.bankDepositName = bankDepositName == null ? null : bankDepositName.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount == null ? null : alipayAccount.trim();
    }

    public String getAlipayValidName() {
        return alipayValidName;
    }

    public void setAlipayValidName(String alipayValidName) {
        this.alipayValidName = alipayValidName == null ? null : alipayValidName.trim();
    }

    public String getWechatAccount() {
        return wechatAccount;
    }

    public void setWechatAccount(String wechatAccount) {
        this.wechatAccount = wechatAccount == null ? null : wechatAccount.trim();
    }

    public String getWecharValidName() {
        return wecharValidName;
    }

    public void setWecharValidName(String wecharValidName) {
        this.wecharValidName = wecharValidName == null ? null : wecharValidName.trim();
    }

    public Double getDeductPercentage() {
        return deductPercentage;
    }

    public void setDeductPercentage(Double deductPercentage) {
        this.deductPercentage = deductPercentage;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBonusNum() {
        return bonusNum;
    }

    public void setBonusNum(Integer bonusNum) {
        this.bonusNum = bonusNum;
    }

    public Double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(Double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public Double getCommissionMoney() {
        return commissionMoney;
    }

    public void setCommissionMoney(Double commissionMoney) {
        this.commissionMoney = commissionMoney;
    }

    public Date getLastDaySettlementDate() {
        return lastDaySettlementDate;
    }

    public void setLastDaySettlementDate(Date lastDaySettlementDate) {
        this.lastDaySettlementDate = lastDaySettlementDate;
    }

    public Date getLastDividendQuotaSettlementDate() {
        return lastDividendQuotaSettlementDate;
    }

    public void setLastDividendQuotaSettlementDate(Date lastDividendQuotaSettlementDate) {
        this.lastDividendQuotaSettlementDate = lastDividendQuotaSettlementDate;
    }

    public Double getOrderCommissionMoney() {
        return orderCommissionMoney;
    }

    public void setOrderCommissionMoney(Double orderCommissionMoney) {
        this.orderCommissionMoney = orderCommissionMoney;
    }

    public Double getLastDaySettlementAvailableMoney() {
        return lastDaySettlementAvailableMoney;
    }

    public void setLastDaySettlementAvailableMoney(Double lastDaySettlementAvailableMoney) {
        this.lastDaySettlementAvailableMoney = lastDaySettlementAvailableMoney;
    }
}