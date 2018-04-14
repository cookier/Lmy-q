package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class OrderUtil {

    static Date today = new Date();
    static int orderIndex = 0;

    @SuppressWarnings("deprecation")
    private static String getIndex() {

        Date n = new Date();
        SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String currTime = outFormat.format(n);

        if (orderIndex > 0) {
            if (n.getYear() == today.getYear() && n.getMonth() == today.getMonth() && n.getDay() == today.getDay()) {
                orderIndex += 1;
            } else {
                today = n;
                orderIndex = 1;
            }
        } else {
            today = n;
            orderIndex = 1;
        }
        if (orderIndex > 999999) {
            orderIndex = 1;
        }
        String indexString = String.format("%s%06d", currTime, orderIndex);
        return indexString;
    }

    /**
     * 生成订单号
     *
     * @param preFixString
     * @return
     */
    public static String GetOrderNumber(String preFixString) {
        String orderNumberString = preFixString + getIndex();
        return orderNumberString;
    }

    /**
     * 获取时间戳
     *
     * @return
     */
    public static String GetTimestamp() {
        return Long.toString(new Date().getTime() / 1000);
    }

    public static double formatdot(double d) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(d));
    }

    public static void main(String[] args) {
        System.out.println(formatdot(7898.33634233d));
    }
}
