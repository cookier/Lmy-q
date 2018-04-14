package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    /**
     * 使用指定字符补齐字符串
     */
    public static String polishingZeroBegin(int length, long num) {
        return String.format("%0" + length + "d", num);
    }

    public static List<String> toCombinations(String[] in) {
        if (in.length > 5) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < in.length; i++) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(in[i]);
            }
            List<String> l = new ArrayList<String>();
            l.add(sb.toString());
            return l;
        }
        return toCombinations(in, new StringBuffer(), 0);
    }

    /**
     * 排列指定数组的所有组合
     *
     * @param in
     * @param out
     * @param start
     * @return
     */
    private static List<String> toCombinations(String[] in, StringBuffer out, int start) {
        List<String> l = new ArrayList<String>();
        for (int i = start; i < in.length; i++) {
            String s = "";
            if (out.length() > 0) {
                s = ",";
            }
            s += in[i];
            out.append(s);
            l.add(out.toString());
            if (i < in.length - 1) {
                l.addAll(toCombinations(in, out, i + 1));
            }
            out.setLength(out.length() - s.length());
        }
        return l;
    }

    public static void main(String[] args) {
        String[] a = new String[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = String.valueOf(i + 1);
        }
        //StringBuffer sb = new StringBuffer();
        List<String> l = toCombinations(a);
        System.out.println("size:" + l.size());
        for (String s : l) {
            System.out.println(s);
        }

    }

}
