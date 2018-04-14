package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DividendDetails implements Serializable {
    private Integer id;

    private Integer dividendId;

    private Date beginTime;

    private Date endTime;

    private Integer effectiveTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDividendId() {
        return dividendId;
    }

    public void setDividendId(Integer dividendId) {
        this.dividendId = dividendId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Integer effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
}