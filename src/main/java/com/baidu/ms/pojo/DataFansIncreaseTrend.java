package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataFansIncreaseTrend implements Serializable {
    private Integer id;

    private Integer added;

    private Integer runAway;

    private Integer growth;

    private Date calcuDate;

    private Integer shopId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdded() {
        return added;
    }

    public void setAdded(Integer added) {
        this.added = added;
    }

    public Integer getRunAway() {
        return runAway;
    }

    public void setRunAway(Integer runAway) {
        this.runAway = runAway;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Date getCalcuDate() {
        return calcuDate;
    }

    public void setCalcuDate(Date calcuDate) {
        this.calcuDate = calcuDate;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}