package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopMemberCard implements Serializable {
    private Integer id;

    private Integer shopId;

    private String cardIcon;

    private String cardName;

    private Integer cardLevel;

    private Float discount;

    private Integer cardType;

    private Date createTime;

    private Date upateTime;

    private Integer deleteFlag;

    private Integer tradeUpgradeLimit;

    private Double moneyUpgradeLimit;

    private Integer pointUpgradeLimit;

    private String usageNotes;

    private String templateContent;

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

    public String getCardIcon() {
        return cardIcon;
    }

    public void setCardIcon(String cardIcon) {
        this.cardIcon = cardIcon == null ? null : cardIcon.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public Integer getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(Integer cardLevel) {
        this.cardLevel = cardLevel;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpateTime() {
        return upateTime;
    }

    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getTradeUpgradeLimit() {
        return tradeUpgradeLimit;
    }

    public void setTradeUpgradeLimit(Integer tradeUpgradeLimit) {
        this.tradeUpgradeLimit = tradeUpgradeLimit;
    }

    public Double getMoneyUpgradeLimit() {
        return moneyUpgradeLimit;
    }

    public void setMoneyUpgradeLimit(Double moneyUpgradeLimit) {
        this.moneyUpgradeLimit = moneyUpgradeLimit;
    }

    public Integer getPointUpgradeLimit() {
        return pointUpgradeLimit;
    }

    public void setPointUpgradeLimit(Integer pointUpgradeLimit) {
        this.pointUpgradeLimit = pointUpgradeLimit;
    }

    public String getUsageNotes() {
        return usageNotes;
    }

    public void setUsageNotes(String usageNotes) {
        this.usageNotes = usageNotes == null ? null : usageNotes.trim();
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent == null ? null : templateContent.trim();
    }
}