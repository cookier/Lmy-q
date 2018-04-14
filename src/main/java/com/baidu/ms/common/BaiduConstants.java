package com.baidu.ms.common;

/**
 * Created by lmy on 2017/2/19.
 */
public class BaiduConstants {
    public static final int PAGESIZE = 10;

    // 通用返回结果码
    public static final String result_success = "0";
    public static final String result_fail = "1";
    public static final String result_error = "2";

    //收货地址不满足
    public static final String address_satisfied = "-1";


    // 定义用户返回结果码
    // 用户名或密码错误
    public static final String result_user_invalid = "3";
    // 旧密码错误
    public static final String result_pwd_invalid = "4";
    // 用户不存在
    public static final String result_user_not_exist = "5";
    // 验证码错误
    public static final String result_ramdoncode_invalid = "6";

    // 验证码key
    public static final String RANDOM_CODE_KEY = "1";

    public static final String CURRENT_ACTIVITY = "currentActivity";
    public static final String CURRENT_AGENT = "currentAgent";
    public static final String CURRENT_USER = "currentUser";
    public static final String CURRENT_SHOP = "currentShop";
    public static final String CURRENT_MEMBER = "currentMember";
    public static final String CURRENT_MOBILE = "currentMobile";
    public static final String CURRENT_MOBILE_CODE = "currentMobileCode";

    public static final String ORDER_BY = "order_by";
    public static final String ORDER = "order";
    public static final String ORDER_ASC = "asc";
    public static final String ORDER_DESC = "desc";

    // mysql查询语句比较运算符
    public static final String OPERATOR_EQ = "=";
    public static final String OPERATOR_NOTEQ = "!=";
    public static final String OPERATOR_GT = ">";
    public static final String OPERATOR_GTEQ = ">=";
    public static final String OPERATOR_LT = "<";
    public static final String OPERATOR_LTEQ = "<=";
    public static final String OPERATOR_IN = "in";
    public static final String OPERATOR_NOTIN = "not in";
    public static final String OPERATOR_BETWEEN_AND = "between";
    public static final String OPERATOR_ISNULL = "is null";
    public static final String OPERATOR_NOTNULL = "is not null";
    public static final String OPERATOR_LIKE = "like";
    public static final String OPERATOR_NOTLIKE = "not like";
    public static final String OPERATOR_FINDINSET = "find_in_set";

    // 数据库赋值正反面标识
    public static final String POSITIVE_FLAG = "1";
    public static final String NEGATIVE_FLAG = "0";

    public static final int POSITIVE_FLAG_INT = 1;
    public static final int NEGATIVE_FLAG_INT = 0;

    // public static final String CURRENT_PROCESS = "process";// 当前流程
    // public static final String PROCESS_BUYIMMEDIATELY = "1";// 立即购买
    // public static final String PROCESS_INTOCART = "2";// 加入购物车
    public static final String CURRENT_BUYMSG = "buyMsg";// 购买信息

    public static final String STATUS_NOTBEGINNING = "0";// 未开始
    public static final String STATUS_USING = "1";// 进行中
    public static final String STATUS_FINISHED = "3";// 已结束
}
