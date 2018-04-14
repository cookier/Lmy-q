package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * url解析类
 *
 * @author Administrator
 */

@Component
public class URLUtils {

    /**
     * 获得不包含参数的请求网址
     *
     * @param url
     * @return
     * @throws Exception
     */
    public static String getUrlWithoutParam(String url) throws Exception {
        if (StringUtils.isBlank(url))
            return null;

        url = URLDecoder.decode(url, "UTF-8");
        return StringUtils.split(url, "?")[0];
    }

    /**
     * 获得请求网址参数
     *
     * @param url
     * @return
     */
    public static Map getUrlParam(String url) throws Exception {
        if (StringUtils.isBlank(url))
            return null;

        Map paramMap = null;
        try {
            url = URLDecoder.decode(url, "UTF-8");

            if (url.indexOf("?") > 0) {
                String paramStr = url.substring(url.indexOf("?") + 1);
                String[] paramArr = StringUtils.split(paramStr, "&");
                if (paramArr.length > 0) {
                    paramMap = new HashMap();
                    for (String p : paramArr) {
                        if (StringUtils.isNotBlank(p)) {
                            String pName = p.substring(0, p.indexOf("="));
                            String pValue = "";
                            if (pName.length() + 1 < p.length()) {
                                pValue = p.substring(p.indexOf("=") + 1);
                            }
                            paramMap.put(pName, pValue);
                        }
                    }
                }
            }
            return paramMap;
        } catch (Exception e) {
            throw new Exception("无效的url地址，解析错误!");
        }
    }

    /**
     * 组装url
     *
     * @param url
     * @param map
     * @return
     */
    public static String contactUrl(String url, Map paramMap) {
        String finalUrl = url;
        if (!finalUrl.endsWith("?")) {
            finalUrl = finalUrl + "?";
        }
        if (!paramMap.isEmpty()) {
            for (Object key : paramMap.keySet()) {
                finalUrl = finalUrl + key.toString() + "=" + paramMap.get(key) + "&";
            }
        }
        if (finalUrl.endsWith("&")) {
            finalUrl = finalUrl.substring(0, finalUrl.length() - 1);
        }

        return finalUrl;
    }

}
