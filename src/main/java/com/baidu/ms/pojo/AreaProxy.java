package com.baidu.ms.pojo;

import java.io.Serializable;

public class AreaProxy implements Serializable {
    private Integer id;

    private Integer proxyShopId;

    private Double totalMoney;

    private Integer tradeNum;

    private Double settledMoney;

    private Double unsettledMoney;

    private Integer areaId;

    private Integer parentId;

    private Integer proxyUserId;

    private Integer level;

    private Integer agentId;

    private String extrContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProxyShopId() {
        return proxyShopId;
    }

    public void setProxyShopId(Integer proxyShopId) {
        this.proxyShopId = proxyShopId;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(Integer tradeNum) {
        this.tradeNum = tradeNum;
    }

    public Double getSettledMoney() {
        return settledMoney;
    }

    public void setSettledMoney(Double settledMoney) {
        this.settledMoney = settledMoney;
    }

    public Double getUnsettledMoney() {
        return unsettledMoney;
    }

    public void setUnsettledMoney(Double unsettledMoney) {
        this.unsettledMoney = unsettledMoney;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getProxyUserId() {
        return proxyUserId;
    }

    public void setProxyUserId(Integer proxyUserId) {
        this.proxyUserId = proxyUserId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getExtrContent() {
        return extrContent;
    }

    public void setExtrContent(String extrContent) {
        this.extrContent = extrContent == null ? null : extrContent.trim();
    }
}