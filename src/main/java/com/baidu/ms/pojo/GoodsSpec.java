package com.baidu.ms.pojo;

import java.io.Serializable;

public class GoodsSpec implements Serializable {
    private Integer id;

    private Integer goodsId;

    private String productCode;

    private String skuName1;

    private String skuValue1;

    private String skuName2;

    private String skuValue2;

    private String skuName3;

    private String skuValue3;

    private String skuName4;

    private String skuValue4;

    private String skuName5;

    private String skuValue5;

    private Double price;

    private Integer saleCount;

    private Integer stock;

    private Double fxPrice;

    private Double productPrice;

    private Double supplyPrice;

    private Double maxRetailPrice;

    private Double minRetailPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getSkuName1() {
        return skuName1;
    }

    public void setSkuName1(String skuName1) {
        this.skuName1 = skuName1 == null ? null : skuName1.trim();
    }

    public String getSkuValue1() {
        return skuValue1;
    }

    public void setSkuValue1(String skuValue1) {
        this.skuValue1 = skuValue1 == null ? null : skuValue1.trim();
    }

    public String getSkuName2() {
        return skuName2;
    }

    public void setSkuName2(String skuName2) {
        this.skuName2 = skuName2 == null ? null : skuName2.trim();
    }

    public String getSkuValue2() {
        return skuValue2;
    }

    public void setSkuValue2(String skuValue2) {
        this.skuValue2 = skuValue2 == null ? null : skuValue2.trim();
    }

    public String getSkuName3() {
        return skuName3;
    }

    public void setSkuName3(String skuName3) {
        this.skuName3 = skuName3 == null ? null : skuName3.trim();
    }

    public String getSkuValue3() {
        return skuValue3;
    }

    public void setSkuValue3(String skuValue3) {
        this.skuValue3 = skuValue3 == null ? null : skuValue3.trim();
    }

    public String getSkuName4() {
        return skuName4;
    }

    public void setSkuName4(String skuName4) {
        this.skuName4 = skuName4 == null ? null : skuName4.trim();
    }

    public String getSkuValue4() {
        return skuValue4;
    }

    public void setSkuValue4(String skuValue4) {
        this.skuValue4 = skuValue4 == null ? null : skuValue4.trim();
    }

    public String getSkuName5() {
        return skuName5;
    }

    public void setSkuName5(String skuName5) {
        this.skuName5 = skuName5 == null ? null : skuName5.trim();
    }

    public String getSkuValue5() {
        return skuValue5;
    }

    public void setSkuValue5(String skuValue5) {
        this.skuValue5 = skuValue5 == null ? null : skuValue5.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getFxPrice() {
        return fxPrice;
    }

    public void setFxPrice(Double fxPrice) {
        this.fxPrice = fxPrice;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(Double supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public Double getMaxRetailPrice() {
        return maxRetailPrice;
    }

    public void setMaxRetailPrice(Double maxRetailPrice) {
        this.maxRetailPrice = maxRetailPrice;
    }

    public Double getMinRetailPrice() {
        return minRetailPrice;
    }

    public void setMinRetailPrice(Double minRetailPrice) {
        this.minRetailPrice = minRetailPrice;
    }
}