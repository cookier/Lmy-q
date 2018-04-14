package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class PrizeAllocate implements Serializable {
    private Integer id;

    private Short type;

    private Integer prizeId;

    private Integer allocatorObj;

    private Date createTime;

    private String allocatorId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public Integer getAllocatorObj() {
        return allocatorObj;
    }

    public void setAllocatorObj(Integer allocatorObj) {
        this.allocatorObj = allocatorObj;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAllocatorId() {
        return allocatorId;
    }

    public void setAllocatorId(String allocatorId) {
        this.allocatorId = allocatorId == null ? null : allocatorId.trim();
    }
}