package com.cad.carlink.data.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author zzc
 */
public class DateUtils {

    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 字符串 转换为 时间
     *
     * @param strDate
     * @return
     * @throws ParseException
     */
    public static Date parseTime(String strDate) throws ParseException {
        return new SimpleDateFormat ( DATE_TIME_FORMAT ).parse ( strDate );
    }

    /**
     * 时间   转换为 字符串
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static String FormatTime(Date date) {
        return new SimpleDateFormat ( DATE_TIME_FORMAT ).format ( date );
    }

    /**
     * 字符串 转换为 日期
     *
     * @param strDate
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String strDate) throws ParseException {
        return new SimpleDateFormat ( DATE_FORMAT ).parse ( strDate );
    }

    /**
     * 日期 转换为  字符串
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static String FormatDate(Date date) {
        return new SimpleDateFormat ( DATE_FORMAT ).format ( date );
    }


    /**
     * 获取某个时间点，day 天以后的日期
     *
     * @param time time
     * @param day  days
     * @return date
     */
    public static String addDay(String time, Integer day) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat ( DATE_TIME_FORMAT );
            Date date = sdf.parse ( time );
            Calendar calendar = Calendar.getInstance ();
            calendar.setTime ( date );
            calendar.add ( Calendar.DATE, day );
            return sdf.format ( calendar.getTime () );
        } catch (ParseException e) {
            e.printStackTrace ();
            return null;
        }

    }

    /**
     * 获取某个时间点， second 秒 以后的日期
     *
     * @param time   time
     * @param second second
     * @return date
     */
    public static String addSecond(String time, Integer second) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss" );
            Date date = sdf.parse ( time );
            Calendar calendar = Calendar.getInstance ();
            calendar.setTime ( date );
            calendar.add ( Calendar.SECOND, second );
            return sdf.format ( calendar.getTime () );

        } catch (ParseException e) {
            e.printStackTrace ();
            return null;
        }
    }
}

