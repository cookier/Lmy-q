package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MobileUtils {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    public static final String APPKEY = "716d5291bd6cef288e627f96f9da96b9";
    public static final String SEND_URL = "http://apis.juhe.cn/mobile/get";
    public static final String DTYPE_JSON = "json";
    public static final String DTYPE_XML = "xml";

    /**
     * 手机号码归属地查询
     *
     * @param mobile
     * @param dtype
     * @return
     */
    public static String getMobileAttribution(String mobile, String dtype) {
        String result = null;
        Map params = new HashMap();// 请求参数
        params.put("phone", mobile);// 需要查询的手机号码或手机号码前7位
        params.put("key", APPKEY);// 应用APPKEY(应用详细页查询)
        params.put("dtype", DTYPE_JSON);// 返回数据的格式,xml或json，默认json

        try {
            result = net(SEND_URL, params, "GET");
        } catch (Exception e) {
        }
        return result;
    }

    /**
     * 网络连接调用
     *
     * @param url
     * @param params
     * @param method
     * @return
     * @throws Exception
     */
    private static String net(String url, Map<String, Object> params, String method) throws Exception {
        HttpUtils httpUtils = new HttpUtils();
        String result = null;
        if (method != null && method.toLowerCase().equals("post")) {
            result = httpUtils.invorkHttpClientPostRequest(url, params);
        } else {
            result = httpUtils.invorkHttpClientGetRequest(url, params);
        }
        return result;
    }

    public static void main(String[] args) {
        String result = getMobileAttribution("13762368336", "json");
        System.out.println(result);
    }
}
