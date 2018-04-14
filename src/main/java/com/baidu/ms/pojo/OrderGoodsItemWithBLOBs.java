package com.baidu.ms.pojo;

import java.io.Serializable;

public class OrderGoodsItemWithBLOBs extends OrderGoodsItem implements Serializable {
    private String shopInfo;

    private String sku;

    private String goodsInfo;

    private String discountInfo;

    private String extrContent;

    private static final long serialVersionUID = 1L;

    public String getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(String shopInfo) {
        this.shopInfo = shopInfo == null ? null : shopInfo.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo == null ? null : discountInfo.trim();
    }

    public String getExtrContent() {
        return extrContent;
    }

    public void setExtrContent(String extrContent) {
        this.extrContent = extrContent == null ? null : extrContent.trim();
    }
}