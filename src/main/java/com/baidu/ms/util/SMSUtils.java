package com.baidu.ms.util;

import net.sf.json.JSONObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 短信服务类
 *
 * @author Administrator
 */
@Component
public class SMSUtils {

    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    public static final String APPKEY = "962318627a052da877b5fc700e2a8eb5";
    public static final String SEND_URL = "http://v.juhe.cn/asdfasdfewrqwer/send";

    /**
     * 短信发送返回结果类型
     */
    public static final String DTYPE_JSON = "json";
    public static final String DTYPE_XML = "xml";

    // 短信模板的id和变量
    public static Map smsTplMap = new HashMap();

    static {
        smsTplMap.put("8938", "code");//【云中邦】感谢您注册云中邦，您的验证码是#code#
        smsTplMap.put("8939", "code");//#code#(云中邦手机动态码，请完成验证)，如非本人操作，请忽略本短信
        smsTplMap.put("8951", "code,name");//【云中邦】亲爱的#name#，您的验证码是#code#。有效期为10分钟，请尽快验证
        smsTplMap.put("9566", "orderNo,orderMoney,url");//【云中邦】您的订单#orderNo#付款成功，付款金额为￥#orderMoney#,点击#url#查看详情
        smsTplMap.put("9721", "orderNo,orderMoney");//【云中邦】您的订单 #orderNo# ，买家已付款 ￥#orderMoney# ，请及时发货！
        smsTplMap.put("9722", "orderNo,url");//【云中邦】您的订单 #orderNo# 已发货，点此 #url# 查看物流!
        smsTplMap.put("12957", "couponName,url");//【云中邦】#couponName# 已成功发放到您的账户中，点击 #url# 查看
        smsTplMap.put("13001", "orderNo,url");//【云中邦】您有新的订单#orderNo#,点击 #url# 查看详情
        smsTplMap.put("13820", "orderNo,content,url");//【云中邦】您的订单 #orderNo#,#content#,点击 #url# 查看
        smsTplMap.put("18067", "userName,money,code");//【云中邦】平台正在转账给#userName##money#元，请核实好信息后再转账，验证码为#code#
        smsTplMap.put("18190", "money");//【云中邦】您的云中邦账号刚刚收到了一笔平台转账，金额为#money#。请尽快登录平台，确认这笔转账！
    }

    /**
     * 短信发送
     *
     * @param mobile   接收短信的手机号码
     * @param tplId    短信模板id
     * @param tplValue 短信模板值
     * @param dtype    返回数据类型
     * @return
     */
    public static String send(String mobile, String tplId, String tplValue, String dtype) {
        String result = null;
        Map<String, Object> params = new HashMap<String, Object>();// 请求参数
        params.put("mobile", mobile);// 接收短信的手机号码
        params.put("tpl_id", tplId);// 短信模板ID，请参考个人中心短信模板设置
        params.put("tpl_value", tplValue);// 变量名和变量值对。如果你的变量名或者变量值中带有#&amp;=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，&lt;a
        // href=&quot;http://www.juhe.cn/news/index/id/50&quot;
        // target=&quot;_blank&quot;&gt;详细说明&gt;&lt;/a&gt;
        params.put("key", APPKEY);// 应用APPKEY(应用详细页查询)
        params.put("dtype", dtype);// 返回数据的格式,xml或json，默认json

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

    /**
     * 随机数字作为短信验证码
     *
     * @return
     */
    public static String getRandom() {
        return RandomStringUtils.randomNumeric(6).toUpperCase();
    }

    public static void main(String[] args) {
        String mobile = "13762368336";
        String tplId = "8938";
        String code = getRandom();
        System.out.println(code);
        String tplValue = "#code#=" + code;
        String dtype = "json";
        String result = send(mobile, tplId, tplValue, dtype);
        System.out.println(result);
        JSONObject object = JSONObject.fromObject(result);
        if (object.getInt("error_code") == 0) {
            System.out.println(object.get("result"));
        } else {
            System.out.println(object.get("error_code") + ":" + object.get("reason"));
        }
    }

}
