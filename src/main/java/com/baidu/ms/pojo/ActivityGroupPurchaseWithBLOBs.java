package com.baidu.ms.pojo;

import java.io.Serializable;

public class ActivityGroupPurchaseWithBLOBs extends ActivityGroupPurchase implements Serializable {
    private String goodsInfo;

    private String rules;

    private static final long serialVersionUID = 1L;

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules == null ? null : rules.trim();
    }
}