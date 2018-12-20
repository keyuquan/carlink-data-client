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

    public static SimpleDateFormat TIME_FORMAT = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss" );
    public static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat ( "yyyy-MM-dd" );
    public static SimpleDateFormat MARK_ID_FORMAT = new SimpleDateFormat ( "yyyyMMddHHmmssSSS" );

    /**
     * Get today's date
     *
     * @return
     */
    public static String getTodayDate() {
        return DATE_FORMAT.format ( new Date () );
    }


    /**
     * Get today's date
     *
     * @return
     */
    public static String getTodayTime() {
        return TIME_FORMAT.format ( new Date () );
    }

    /**
     * Get today's date
     *
     * @return
     */
    public static String getDaTeMarkIdTime(String dateTime) throws ParseException {
        return MARK_ID_FORMAT.format ( DATE_FORMAT.parse ( dateTime ) );
    }


    /**
     * 字符串 转换为 时间
     *
     * @param strDate
     * @return
     * @throws ParseException
     */
    public static Date parseTime(String strDate) throws ParseException {
        return TIME_FORMAT.parse ( strDate );
    }

    /**
     * 时间   转换为 字符串
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static String FormatTime(Date date) {
        return TIME_FORMAT.format ( date );
    }

    /**
     * 字符串 转换为 日期
     *
     * @param strDate
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String strDate) throws ParseException {
        return DATE_FORMAT.parse ( strDate );
    }

    /**
     * 日期 转换为  字符串
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static String FormatDate(Date date) {
        return DATE_FORMAT.format ( date );
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
            Date date = TIME_FORMAT.parse ( time );
            Calendar calendar = Calendar.getInstance ();
            calendar.setTime ( date );
            calendar.add ( Calendar.DATE, day );
            return TIME_FORMAT.format ( calendar.getTime () );
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

