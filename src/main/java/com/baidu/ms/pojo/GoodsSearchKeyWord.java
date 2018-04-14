package com.baidu.ms.pojo;

import java.io.Serializable;

public class GoodsSearchKeyWord implements Serializable {
    private Integer id;

    private String goodsKeyWord;

    private Double hot;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsKeyWord() {
        return goodsKeyWord;
    }

    public void setGoodsKeyWord(String goodsKeyWord) {
        this.goodsKeyWord = goodsKeyWord == null ? null : goodsKeyWord.trim();
    }

    public Double getHot() {
        return hot;
    }

    public void setHot(Double hot) {
        this.hot = hot;
    }
}