package com.baidu.ms.util;

import com.baidu.ms.pojo.*;
import com.baidu.ms.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class UrlKit {

    @Autowired(required = false)
    private static SystemConfigService systemConfigService;

    /**
     * 营销活动地址
     */
    public static String getMarketingActivityUrl(int activityId, Map<String, Object> parms) throws Exception {
        String url = systemConfigService.getSystemConfigValue("activity_root_url");
        if (!url.endsWith("/")) {
            url += "/";
        }
        url = url + "?id=" + activityId;
        StringBuffer sb = new StringBuffer();
        for (String key : parms.keySet()) {
            sb.append("&");
            sb.append(key).append("=").append(parms.get(key));
        }
        url = url + sb.toString();
        return url;
    }

    /**
     * 微页面地址
     */
    public static String getFeatureUrl(ShopPage page) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url2") + "/showcase/feature?sid=" + page.getShopId() + "&pid="
                + page.getId();
    }

    public static String getFeatureCategoryUrl(ShopPageCategory page) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url2") + "/showcase/category?sid=" + page.getShopId() + "&cid="
                + page.getId();
    }

    public static String getResurceUrl(String url) throws Exception {
        if (!url.toLowerCase().startsWith("http")) {
            url = systemConfigService.getSystemConfigValue("wap_root_url") + "/" + url;
        }
        return url;
    }

    public static String getWxNews(int id, int index) throws Exception {
        String url = systemConfigService.getSystemConfigValue("wap_root_url");
        if (!url.endsWith("/")) {
            url += "/";
        }
        url = url + "news?id=" + id + "&index=" + index;
        return url;
    }

    /**
     * 商品明细url
     *
     * @param goods
     * @return
     */
    public static String getGoodsUrl(Goods goods) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/goods/detail?sid=" + goods.getShopId() + "&id="
                + goods.getId();
    }

    public static String getAllGoodsList(Shop shop) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/list/list?sid=" + shop.getId();
    }

    /**
     * 商品标签url
     *
     * @param tag
     * @return
     */
    public static String getGoodsTagUrl(GoodsTags tag) throws Exception {
        String url = tag.getUrl();
        if (tag.getUrl() == null) {
            url = systemConfigService.getSystemConfigValue("wap_root_url") + "/goods/list?sid=" + tag.getShopId() + "&tagId="
                    + tag.getId();
        } else if (tag.getUrl() != null && !tag.getUrl().toLowerCase().startsWith("http")) {
            url = systemConfigService.getSystemConfigValue("wap_root_url") + "/" + tag.getUrl();
        }
        return url;
    }

    /**
     * 优惠券领取url
     *
     * @param c
     * @return
     */
    public static String getCouponUrl(Coupon c) throws Exception {
        String url = c.getUrl();
        if (c.getUrl() == null) {
            url = systemConfigService.getSystemConfigValue("wap_root_url") + "/coupon/" + c.getId();
        } else if (c.getUrl() != null && !c.getUrl().toLowerCase().startsWith("http")) {
            url = systemConfigService.getSystemConfigValue("wap_root_url") + "/" + c.getUrl();
        }
        return url;
    }

    /**
     * 优惠码领取url
     *
     * @param cc
     * @return
     */
    public static String getCouponCodeUrl(CouponCode cc) throws Exception {
        String url = cc.getCouponUrl();
        if (cc.getCouponUrl() == null) {
            url = systemConfigService.getSystemConfigValue("wap_root_url") + "/couponCode/" + cc.getId();
        } else if (cc.getCouponUrl() != null && !cc.getCouponUrl().toLowerCase().startsWith("http")) {
            url = systemConfigService.getSystemConfigValue("wap_root_url") + "/" + cc.getCouponUrl();
        }
        return url;
    }

    /**
     * 店铺主页url
     *
     * @param shop
     * @return
     */
    public static String getHomePageUrl(Shop shop) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/" + shop.getId();
    }

    /**
     * 用户中心url
     *
     * @param shop
     * @return
     */
    public static String getUserCenterUrl(Shop shop) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/usercenter/member?sid=" + shop.getId();
    }


    /**
     * 购物车地址
     *
     * @param shop
     * @return
     */
    public static String getShopCart(Shop shop) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/buy/cartList?sid=" + shop.getId();
    }


    /**
     * 得到当前请求的上下文url
     *
     * @param request
     * @return
     */
    public static String getServerUrl(HttpServletRequest request) {
        String path = request.getContextPath();
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    }

    public static String getRequestAllUrl(HttpServletRequest request) {
        Map<String, String[]> params = request.getParameterMap();
        StringBuffer queryString = new StringBuffer();
        for (String key : params.keySet()) {
            String[] values = params.get(key);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                if (queryString.length() > 0) {
                    queryString.append("&");
                }
                queryString.append(key).append("=").append(value);
            }
        }
        // String url = systemConfigService.getSystemConfigValue("wap_root_url2") +
        // request.getRequestURI();
        String url = request.getRequestURL().toString();
        if (queryString.length() > 0) {
            url = url + "?" + queryString.toString();
        }
        return url;
    }

    /**
     * 得到当前请求url
     *
     * @param request
     * @return
     */
    public static String getRequestUriWithQueryString(HttpServletRequest request) {
        Map<String, String[]> params = request.getParameterMap();
        StringBuffer queryString = new StringBuffer();
        for (String key : params.keySet()) {
            String[] values = params.get(key);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                if (queryString.length() > 0) {
                    queryString.append("&");
                }
                queryString.append(key).append("=").append(value);
            }
        }
        String url = request.getRequestURI();
        if (queryString.length() > 0) {
            url = url + "?" + queryString.toString();
        }
        return url;
    }

    /**
     * 得到上一个请求url
     *
     * @param request
     * @return
     */
    public static String getRefererUrl(HttpServletRequest request) {
        return request.getHeader("referer");
    }

    /**
     * 店铺自定义模板url
     *
     * @param shopTpl
     * @return
     */
    public static String getShopCustomeTemplateUrl(ShopCustomTemplate shopTpl) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/showcase/component?sid=" + shopTpl.getShopId() + "&id="
                + shopTpl.getId();
    }

    /**
     * 店铺页面分类url
     *
     * @param pageCategory
     * @return
     */
    public static String getShopPageCategoryUrl(ShopPageCategory pageCategory) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/showcase/category?sid=" + pageCategory.getShopId() + "&cid="
                + pageCategory.getId();
    }

    /**
     * 资源文件预览url
     *
     * @return
     */
    public static String getResourceFileUrl(ResourceFile file) throws Exception {
        return systemConfigService.getSystemConfigValue("file_root_url") + "/" + file.getId();
    }

    /**
     * 购物车url
     *
     * @param cart
     * @return
     */
    public static String getShopcartUrl(Cart cart) throws Exception {
        return systemConfigService.getSystemConfigValue("wap_root_url") + "/buy/cartList?sid=" + cart.getShopId();
    }

    /**
     * 二维码url
     *
     * @param type(goods or shop)
     * @param id
     * @return
     */
    public static String getQrCodeUrl(String type, int id) throws Exception {
        return systemConfigService.getSystemConfigValue("qr_root_url") + "/" + type + "-" + id;
    }

    public static String getWxPayNoticeUrl() throws Exception {
        String url = systemConfigService.getSystemConfigValue("ms_root_url");
        if (!url.endsWith("/")) {
            url = url + "/";
        }
        url = url + "wx/pay/notice";
        return url;
    }

    public static String getRemoteHost(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip != null && ip.indexOf(',') != -1) {
            ip = ip.split(",")[0];
        }
        return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
    }

    public static String checkShopUrl(String url) throws Exception {
        if (!url.toLowerCase().startsWith("http")) {
            String base = systemConfigService.getSystemConfigValue("wap_root_url");
            if (!base.toLowerCase().startsWith("http")) {
                base = systemConfigService.getSystemConfigValue("wap_root_url2");
            }
            if (!base.endsWith("/") && !url.startsWith("/")) {
                base = base + "/";
            }
            return base + url;
        }
        return url;
    }

    public static String checkGoodUrl(String url) throws Exception {
        if (!url.toLowerCase().startsWith("http")) {
            String base = systemConfigService.getSystemConfigValue("wap_root_url");
            if (!base.toLowerCase().startsWith("http")) {
                base = systemConfigService.getSystemConfigValue("wap_root_url2");
            }
            if (!base.endsWith("/") && !url.startsWith("/")) {
                base = base + "/";
            }
            return base + url;
        }
        return url;
    }

    public static String getShopRootPath() throws Exception {
        String base = systemConfigService.getSystemConfigValue("wap_root_url");
        if (!base.toLowerCase().startsWith("http")) {
            base = systemConfigService.getSystemConfigValue("wap_root_url2");
        }
        if (!base.endsWith("/")) {
            base = base + "/";
        }
        return base;
    }

    public static String getOrderUrl(Order order) throws Exception {
        return getShopRootPath() + "buy/toOrderDetail?sid=" + order.getShopId() + "&orderId=" + order.getId();
    }

}
