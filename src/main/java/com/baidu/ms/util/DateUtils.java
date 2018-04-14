package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取指定日期所属星期几所属的日期(周一至周日为一周)
     *
     * @param date    日期
     * @param weekday 星期 取Calendar中的
     * @return
     */
    public static Date getWeekDate(Date date, int weekday) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // 因为日期是从星期天开始的，所以 如果当前日期是星期天 应该往前推一天
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SUNDAY && weekday != Calendar.SUNDAY)
            calendar.add(Calendar.DAY_OF_WEEK, -dayOfWeek);
        else if (dayOfWeek != Calendar.SUNDAY && weekday == Calendar.SUNDAY)
            calendar.add(Calendar.DAY_OF_WEEK, 7);

        calendar.set(Calendar.DAY_OF_WEEK, weekday);
        return calendar.getTime();
    }

    /**
     * 获取当前日期所属星期几所属的日期(周一至周日为一周)
     */
    public static Date getWeekDate(int weekday) {
        Date date = new Date();
        return getWeekDate(date, weekday);
    }

    /**
     * 获取当前日期所属星期几所属的日期(周一至周日为一周)
     *
     * @param weekday
     * @return
     */
    public static String getWeekDateString(int weekday) {
        Date date = new Date();
        return getWeekDateString(date, weekday);
    }

    /**
     * 获取指定日期所属星期几所属的日期(周一至周日为一周)
     *
     * @param weekday
     * @return
     */
    public static String getWeekDateString(Date date, int weekday) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date resultDate = getWeekDate(date, weekday);
        return format.format(resultDate);
    }

    /**
     * 获得当前日期字符串，格式为yyyyMMdd
     *
     * @return
     */
    public static String getCurDateStr() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String dateStr = sf.format(date);
        dateStr = dateStr.replaceAll("-", "");
        return dateStr;
    }

    /**
     * 获得当前时间字符串，格式为HHmmss
     *
     * @return
     */
    public static String getTimeStr() {
        Calendar c = Calendar.getInstance();
        String hour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));
        if (hour.length() == 1)
            hour = "0" + hour;
        String minute = String.valueOf(c.get(Calendar.MINUTE));
        if (minute.length() == 1)
            minute = "0" + minute;
        String second = String.valueOf(c.get(Calendar.SECOND));
        if (second.length() == 1)
            second = "0" + second;
        String timeStr = hour + minute + second;
        return timeStr;
    }

    /**
     * 获取当前时间戳,返回TimeStamp
     *
     * @return
     */
    public static Timestamp getCurTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    /**
     * 获取当前日期,返回Date
     *
     * @return
     */
    public static Date getCurDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    /**
     * 获取当前年份.
     *
     * @return
     */
    public static int getCurYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取当前月份.
     *
     * @return 当前月份
     */
    public static int getCurMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取当前日期.
     *
     * @return
     */
    public static int getCurDAY() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DATE);
    }

    /**
     * 获取当前年份和月份.
     *
     * @return 当前年份和月份
     */
    public static String getCurYearMonth() {
        Calendar calendar = Calendar.getInstance();
        String yearStr = String.valueOf(calendar.get(Calendar.YEAR));
        int month = calendar.get(Calendar.MONTH) + 1;
        String monthStr = month < 10 ? "0" + month : String.valueOf(month);
        return yearStr + monthStr;
    }

    /**
     * 将当前日期转换成某种格式的字符串
     */
    public static String getCurDateString(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(getCurDate());
    }

    /**
     * 获取当前日期字符串,格式为yyyy-MM-dd
     *
     * @return 当前日期字符串
     */
    public static String getCurDateString() {
        return getCurDateString(DATE_PATTERN);
    }

    /**
     * 获取当前时间字符串,格式为yyyy-MM-dd HH:mm:ss
     *
     * @return 当前时间字符串
     */
    public static String getCurDatetimeString() {
        return getCurDateString(DATETIME_PATTERN);
    }

    /**
     * 返回没有分隔符的日期字符串yyyyMMddHHmmss
     *
     * @param date
     * @return
     */
    public static String getDateStrWithoutSeparator(Date date) {
        String dateStr = dateToString(date, DateUtils.DATETIME_PATTERN);
        return dateStr.replaceAll("-", "").replaceAll(" ", "").replaceAll(":", "");
    }

    /**
     * 日期字符串格式转变
     *
     * @param dateString 日期字符串，如“2000-10-01”
     * @param pattern    字符串格式
     * @return 时间戳字符串
     */
    public static String changeDateStringFormat(String dateString, String pattern) {
        String[] dates = dateString.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(dates[0]), Integer.parseInt(dates[1]) - 1, Integer.parseInt(dates[2]));
        return dateToString(calendar.getTime(), pattern);

    }

    /**
     * 时间毫秒数转日期
     *
     * @param date
     * @return
     */
    public static Date longToDate(long date) {
        if (date > 0) {
            Calendar cal = Calendar.getInstance();
            String dateStr = "" + date;
            String year = dateStr.substring(0, 4);
            String month = dateStr.substring(4, 6);
            String day = dateStr.substring(6, 8);
            String hour = dateStr.substring(8, 10);
            String minute = dateStr.substring(10, 12);
            String second = dateStr.substring(12, dateStr.length());

            cal.set(Calendar.YEAR, Integer.parseInt(year));
            cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
            cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
            cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hour));
            cal.set(Calendar.MINUTE, Integer.parseInt(minute));
            cal.set(Calendar.SECOND, Integer.parseInt(second));
            return cal.getTime();
        } else {
            return null;
        }
    }

    /**
     * 日期转时间毫秒数
     *
     * @param date
     * @return
     */
    public static Long dateToLong(Date date) {
        if (date != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            String year = "" + cal.get(Calendar.YEAR);
            String month = "" + (1 + cal.get(Calendar.MONTH));
            String day = "" + cal.get(Calendar.DAY_OF_MONTH);
            String hour = "" + cal.get(Calendar.HOUR_OF_DAY);
            String minute = "" + cal.get(Calendar.MINUTE);
            String second = "" + cal.get(Calendar.SECOND);

            if (month.trim().length() == 1) {
                month = "0" + month;
            }

            if (day.trim().length() == 1) {
                day = "0" + day;
            }

            if (hour.trim().length() == 1) {
                hour = "0" + hour;
            }

            if (minute.trim().length() == 1) {
                minute = "0" + minute;
            }

            if (second.trim().length() == 1) {
                second = "0" + second;
            }
            String longDate = year + month + day + hour + minute + second;
            return Long.parseLong(longDate);
        } else {
            return null;
        }
    }

    /**
     * 时间戳类型转化为字符串
     */
    public static String dateToString(Timestamp timestamp, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String result = (timestamp == null) ? "" : sdf.format(timestamp);
        return result;
    }

    /**
     * 按照指定格式将日期转为字符串
     *
     * @param date    原日期
     * @param pattern 字符串格式
     * @return 日期字符串
     */
    public static String dateToString(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String result = (date == null) ? "" : sdf.format(date);
        return result;
    }

    /**
     * 将日期转为yyyy-mm-dd格式的字符串
     *
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
        String result = (date == null) ? "" : sdf.format(date);
        return result;
    }

    /**
     * 将yyyy-mm-dd或者yyyyMMdd格式的字符串转换为日期
     *
     * @param dateString
     * @return
     */
    public static Date stringToDate(String dateString) {
        try {
            if (dateString.indexOf("-") > -1) {
                dateString = dateString.replaceAll("-", "");
            }
            String year = dateString.substring(0, 4);
            String month = dateString.substring(4, 6);
            String day = dateString.substring(6, 8);
            Calendar calendar = Calendar.getInstance();
            calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day), 0, 0, 0);
            return calendar.getTime();
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 日期相加
     *
     * @param date
     * @param day
     * @return
     */
    public static Date addDay(Date date, int day) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, day);
        return c.getTime();
    }

    /**
     * 在原有日期上进行时间相加减
     *
     * @param date
     * @param value
     * @param calendarPart,取值来源于Calendar类的常量(例如Calendar,day)
     * @return
     */
    public static Date addDay(Date date, int value, int calendarPart) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(calendarPart, value);
        return c.getTime();
    }

    /**
     * 计算两个日期相差天数
     *
     * @param date1
     * @param date2
     * @return 天数
     */
    public static int substractDate(Date date1, Date date2) {
        long subTime = Math.abs(date1.getTime() - date2.getTime());
        return (int) (subTime / (1000 * 60 * 60 * 24));
    }

    /**
     * 计算两个日期相差时间毫秒数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static long substractDateTime(Date date1, Date date2) {
        return Math.abs(date1.getTime() - date2.getTime());
    }
}
