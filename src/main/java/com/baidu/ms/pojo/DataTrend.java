package com.baidu.ms.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataTrend implements Serializable {
    private Integer id;

    private String pageName;

    private String pageUrl;

    private Integer browserUv;

    private Integer browserPv;

    private Integer shareUv;

    private Integer sharePv;

    private Integer exportUv;

    private Integer exportPv;

    private Integer meanTime;

    private Integer meanDepth;

    private Integer shopId;

    private Date calcuDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
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

    public Integer getShareUv() {
        return shareUv;
    }

    public void setShareUv(Integer shareUv) {
        this.shareUv = shareUv;
    }

    public Integer getSharePv() {
        return sharePv;
    }

    public void setSharePv(Integer sharePv) {
        this.sharePv = sharePv;
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

    public Integer getMeanTime() {
        return meanTime;
    }

    public void setMeanTime(Integer meanTime) {
        this.meanTime = meanTime;
    }

    public Integer getMeanDepth() {
        return meanDepth;
    }

    public void setMeanDepth(Integer meanDepth) {
        this.meanDepth = meanDepth;
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