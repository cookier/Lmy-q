package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataVisitFlow implements Serializable {
    private Integer id;

    private Integer browserUv;

    private Integer browserPv;

    private Integer insideUv;

    private Integer insidePv;

    private Integer sharePv;

    private Integer shareUv;

    private Integer exportUv;

    private Integer exportPv;

    private Integer reachPv;

    private Integer reachUv;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrowserUv() {
        return browserUv;
    }

    public void setBrowserUv(Integer browserUv) {
        this.browserUv = browserUv;
    }

    public Integer getBrowserPv() {
        return browserPv;
    }

    public void setBrowserPv(Integer browserPv) {
        this.browserPv = browserPv;
    }

    public Integer getInsideUv() {
        return insideUv;
    }

    public void setInsideUv(Integer insideUv) {
        this.insideUv = insideUv;
    }

    public Integer getInsidePv() {
        return insidePv;
    }

    public void setInsidePv(Integer insidePv) {
        this.insidePv = insidePv;
    }

    public Integer getSharePv() {
        return sharePv;
    }

    public void setSharePv(Integer sharePv) {
        this.sharePv = sharePv;
    }

    public Integer getShareUv() {
        return shareUv;
    }

    public void setShareUv(Integer shareUv) {
        this.shareUv = shareUv;
    }

    public Integer getExportUv() {
        return exportUv;
    }

    public void setExportUv(Integer exportUv) {
        this.exportUv = exportUv;
    }

    public Integer getExportPv() {
        return exportPv;
    }

    public void setExportPv(Integer exportPv) {
        this.exportPv = exportPv;
    }

    public Integer getReachPv() {
        return reachPv;
    }

    public void setReachPv(Integer reachPv) {
        this.reachPv = reachPv;
    }

    public Integer getReachUv() {
        return reachUv;
    }

    public void setReachUv(Integer reachUv) {
        this.reachUv = reachUv;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getCalcuDate() {
        return calcuDate;
    }

    public void setCalcuDate(Date calcuDate) {
        this.calcuDate = calcuDate;
    }
}