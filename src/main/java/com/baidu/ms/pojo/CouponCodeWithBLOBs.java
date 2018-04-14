package com.baidu.ms.pojo;

import java.io.Serializable;

public class CouponCodeWithBLOBs extends CouponCode implements Serializable {
    private String vipLabel;

    private String rangeGoods;

    private String extrContent;

    private static final long serialVersionUID = 1L;

    public String getVipLabel() {
        return vipLabel;
    }

    public void setVipLabel(String vipLabel) {
        this.vipLabel = vipLabel == null ? null : vipLabel.trim();
    }

    public String getRangeGoods() {
        return rangeGoods;
    }

    public void setRangeGoods(String rangeGoods) {
        this.rangeGoods = rangeGoods == null ? null : rangeGoods.trim();
    }

    public String getExtrContent() {
        return extrContent;
    }

    public void setExtrContent(String extrContent) {
        this.extrContent = extrContent == null ? null : extrContent.trim();
    }
}