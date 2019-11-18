package com.jjkj.common.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsGalaxyhcUtil
{

    public static String dateToStringyyyyMMhhmm(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String time = sdf.format(date);
        return time;
    }

    public static String dateToStringyyyyMMhhmmss(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = sdf.format(date);
        return time;
    }

    public static String dateToStringyyyyMMdd(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(date);
        return time;
    }

    /**
     * 2 *
     * <li>功能描述：时间相减得到天数 3 * @param beginDateStr 4 * @param endDateStr 5 * @return 6 * long 7 * @author Administrator 8
     */
    public static long getDaySub(String beginDateStr, String endDateStr)
    {
        long day = 0;
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date beginDate;
        java.util.Date endDate;
        try
        {
            beginDate = format.parse(beginDateStr);
            endDate = format.parse(endDateStr);
            day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
            // System.out.println("相隔的天数="+day);
        }
        catch (ParseException e)
        {
            // TODO 自动生成 catch 块
            e.printStackTrace();
        }
        return day;
    }

    public static String dateToString(Date date, String type)
    {
        String str = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (type.equals("SHORT"))
        {
            // 07-1-18  
            format = DateFormat.getDateInstance(DateFormat.SHORT);
            str = format.format(date);
        }
        else if (type.equals("MEDIUM"))
        {
            // 2007-1-18  
            format = DateFormat.getDateInstance(DateFormat.MEDIUM);
            str = format.format(date);
        }
        else if (type.equals("FULL"))
        {
            // 2007年1月18日 星期四  
            format = DateFormat.getDateInstance(DateFormat.FULL);
            str = format.format(date);
        }
        return str;
    }

    public static Date stringToDateBiuBiuBiu(String str)
    {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try
        {
            // Fri Feb 24 00:00:00 CST 2012  
            date = format.parse(str);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        // 2012-02-24  
        date = java.sql.Date.valueOf(str);

        return date;
    }

    //    public static void main(String[] args) {  
    //        Date date = new Date();  
    //        System.out.println(StringOrDate.dateToString(date, "MEDIUM"));  
    //        String str = "2012-2-24";  
    //        System.out.println(StringOrDate.stringToDate(str));  
    //    }  
    public static void main(String[] dfd) throws ParseException
    {

        //    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
        //    	Date de = sdf.parse("2016-04-05") ;
        //    	System.out.println( betweenMonth(de) ); ;

        /*Date yesterday = new Date("2016-06-25") ;
        
        System.out.println( betweenDays( new Date(),yesterday) );*/

        //System.out.println(getCurDateString(new Date()));

        Date date = new Date();
        //        System.out.println(DateUtilsGalaxyhcUtil.dateToString(date, "MEDIUM"));
        //        System.out.println(DateUtilsGalaxyhcUtil.dateToStringyyyyMMdd(date));
        System.out.println(DateUtilsGalaxyhcUtil.dateToStringyyyyMMhhmm(date));
        System.out.println(DateUtilsGalaxyhcUtil.dateToStringyyyyMMhhmmss(date));
        //      String str = "2012-2-24";  
        //      System.out.println(DateUtil.stringToDateBiuBiuBiu(str));  
    }
}
