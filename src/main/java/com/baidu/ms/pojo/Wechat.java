package com.baidu.ms.pojo;

import java.io.Serializable;

public class Wechat implements Serializable {
    private Integer id;

    private Integer shopId;

    private String wechat;

    private String interfaceUrl;

    private String headfaceUrl;

    private Integer type;

    private String appid;

    private String appsecret;

    private String encodingaeskey;

    private String accessToken;

    private Integer accessTokenExpiresIn;

    private String ticket;

    private Integer ticketExpiresIn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getInterfaceUrl() {
        return interfaceUrl;
    }

    public void setInterfaceUrl(String interfaceUrl) {
        this.interfaceUrl = interfaceUrl == null ? null : interfaceUrl.trim();
    }

    public String getHeadfaceUrl() {
        return headfaceUrl;
    }

    public void setHeadfaceUrl(String headfaceUrl) {
        this.headfaceUrl = headfaceUrl == null ? null : headfaceUrl.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getEncodingaeskey() {
        return encodingaeskey;
    }

    public void setEncodingaeskey(String encodingaeskey) {
        this.encodingaeskey = encodingaeskey == null ? null : encodingaeskey.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public Integer getAccessTokenExpiresIn() {
        return accessTokenExpiresIn;
    }

    public void setAccessTokenExpiresIn(Integer accessTokenExpiresIn) {
        this.accessTokenExpiresIn = accessTokenExpiresIn;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    public Integer getTicketExpiresIn() {
        return ticketExpiresIn;
    }

    public void setTicketExpiresIn(Integer ticketExpiresIn) {
        this.ticketExpiresIn = ticketExpiresIn;
    }
}