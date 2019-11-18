package com.jjkj.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 * @ClassName: DateUtil
 * @Description: 日期辅助类
 * @author bi.peng
 * @date 2016-6-15 上午10:29:14
 * 
 */
public class DateUtil
{
    @SuppressWarnings("unused")
    private static final Log logger = LogFactory.getLog(DateUtil.class);
    /**
     * /** 根据日期规则生成当前时间
     */
    public static final String dateRule = "yyyy-MM-dd HH:mm:ss";

    static int s = 0;
    static int ss = 0;

    public static Date stringToDate(String str) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(str);
        return date;
    }

    /**
     * 转换时间格式
     */
    public static String DateToString(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * @author: wuhaiming
     * @Title getCurrentDateString
     * @Time: 2010-7-21下午07:02:15
     * @Description: 获取当前时间以yyyy-MM-dd HH:mm:ss字符串的方式返回
     * @return: String
     * @throws:
     * @return
     */
    public static String getCurrentDateString()
    {
        return new SimpleDateFormat(dateRule, Locale.US).format(new Date());
    }

    /**
     * 格式化时�?
     * 
     * @param date
     * @param format
     * @return
     */
    public static String getFormatDateString(Date date, String format)
    {
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 
     * @author: Shmily
     * @Title getCurDateString
     * @Time: 2011-6-27下午05:33:42
     * @Description: 得到yyyy-MM-dd格式的当前时�?
     * @return: String
     * @throws:
     * @return
     */
    public static String getCurDateString()
    {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
    }

    /**
     * 
     * @author: max
     * @Title formatStringIntoDate
     * @Time: 2011-7-22下午05:33:42
     * @Description: 得到yyyy-MM-dd HH:mm:ss格式的日�?
     * @return: Date
     * @throws:
     * @return
     */
    public static Date formatStringIntoDate(String strDate)
    {
        try
        {
            Date d = null;
            if (!"".equals(strDate))
            {
                d = new SimpleDateFormat(dateRule).parse(strDate);
            }
            return d;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 
     * @author: Yolanda.qin
     * @Title getBeforeDate
     * @Time: 2011-7-27上午11:08:07
     * @Description: 获取前几天的日期和时�?
     * @return: String
     * @throws:
     * @param beforeDays
     * @return
     */
    public static String getBeforeDate(int beforeDays)
    {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, -1 * beforeDays);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        return sf.format(c.getTime());
    }

    /**
     * @author: Wangqian
     * @Title getBeforeDate
     * @Time: 2012-11-9下午03:04:20
     * @Description: 获取前几天的日期和时�?
     * @return: String
     * @throws:
     * @param beforeDays
     * @return
     */
    public static String getBeforeDate(int beforeDays, String formatDate)
    {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, -1 * beforeDays);
        SimpleDateFormat sf = new SimpleDateFormat(formatDate);
        return sf.format(c.getTime());
    }

    /**
     * 
     * @author: magan
     * @Title getDateStr
     * @Time: Jun 27, 20113:58:17 PM
     * @Description: 创建本地存储文件�?时间)
     * @return: String
     * @throws:
     * @return
     */
    public static String getFileStr()
    {
        Calendar CD = Calendar.getInstance();
        int YY = CD.get(Calendar.YEAR);
        int MM = CD.get(Calendar.MONTH) + 1;
        int DD = CD.get(Calendar.DATE);
        int HH = CD.get(Calendar.HOUR_OF_DAY);
        int NN = CD.get(Calendar.MINUTE);
        int SS = CD.get(Calendar.SECOND);
        int MI = CD.get(Calendar.MILLISECOND);
        StringBuffer dateName = new StringBuffer("");
        dateName.append(YY).append(MM).append(DD).append(HH).append(NN).append(SS).append(MI);
        return dateName.toString();
    }

    /**
     * 得到当前月的第一�?
     * 
     * @return
     */
    public static String getFristMonthDay()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
        Date beginTime = cal.getTime();
        return datef.format(beginTime);

    }

    /**
     * 得到当前月份
     * 
     * @author: guozb
     * @Title getCurMouthString
     * @Time: 2012-7-9下午03:27:16
     * @Description:
     * @return: String
     * @throws:
     * @return
     */
    public static String getCurMouthString()
    {
        return new SimpleDateFormat("yyyy-MM", Locale.US).format(new Date());
    }

    public static String getCurYearString()
    {
        return new SimpleDateFormat("yyyy", Locale.US).format(new Date());
    }

    /**
     * 获取到上个月
     * 
     * @author: guozb
     * @Title getCurMouthString
     * @Time: 2012-7-18下午05:26:22
     * @Description:
     * @return: String
     * @throws:
     * @return
     */
    public static String getBeforMouthString()
    {

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        String months = "";
        if (!(String.valueOf(month).length() > 1))
        {
            months = "0" + month;
        }
        else
        {
            months = String.valueOf(month);
        }

        String str = String.valueOf(year) + "-" + String.valueOf(months);
        return str;
    }

    /**
     * 将日期的时分秒去�?
     * 
     * @Title
     * @description
     * @author zhaomingming (赵明�?
     * @time 2012上午10:26:58
     * @param date
     * @return
     */

    public static Date dropHourDate(Date date)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            return df.parse(df.format(date));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @author: pinao
     * 
     * @Title: formatDate @Description: TODO(java.util.date 转成timestamp) @param @param date @param @return 设定文件 @return
     * Timestamp 返回类型 @date 2015-11-28 下午5:20:58 @throws
     */
    public static Timestamp formatDate(Date date)
    {
        return new Timestamp(date.getTime());
    }

    public static String formatTime(Long ms)
    {
        Integer ss = 1000;
        Integer mi = ss * 60;
        Integer hh = mi * 60;
        Integer dd = hh * 24;

        Long day = ms / dd;
        Long hour = (ms - day * dd) / hh;
        Long minute = (ms - day * dd - hour * hh) / mi;
        Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
        Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

        StringBuffer sb = new StringBuffer();
        if (day > 0)
        {
            // sb.append(day+"天");
            s = (int) (day * 24);
        }
        if (hour > 0)
        {
            ss = (int) (hour + s);
            sb.append(ss + "");
        }
        if (minute > 0)
        {
            sb.append(":" + minute);
        }
        if (second > 0)
        {
            // sb.append(second+"秒");
        }
        if (milliSecond > 0)
        {
            // sb.append(milliSecond+"毫秒");
        }
        return sb.toString();
    }

    public static String getCurrentDate()
    {

        Date current = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(current);

    }

    /**
     * @Title: isBeforeInMinutes @author mingming.shen @Description:判断时间date是否遭遇当前时间minutes分钟 @param @param
     * minutes @param @param date @param @return 设定文件 @return boolean 返回类型 @date 2016-8-30 上午10:41:02 @throws
     */
    public static boolean isBeforeInMinutes(int minutes, Date date)
    {

        if (null == date)
        {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -minutes);
        Date curTime = calendar.getTime();
        return curTime.after(date);
    }

    /**
     * @Title: isBeforeInDay @author mingming.shen @Description: 时间加减根据类:天 @param @param day @param @param
     * date @param @return 设定文件 @return Date 返回类型 @date 2016-11-15 下午3:22:19 @throws
     */
    public static Date beforeInDay(int day, Date date)
    {

        if (null == date)
        {
            return date;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, day);
        Date curTime = calendar.getTime();
        return curTime;
    }

    public static Date beforeInMonth(int month, Date date)
    {

        if (null == date)
        {
            return date;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, month);
        Date curTime = calendar.getTime();
        return curTime;
    }

    public static Date beforeInMonthOrDay(int month, int day, Date date)
    {

        if (null == date)
        {
            return date;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, month);
        calendar.add(Calendar.DATE, day);
        Date curTime = calendar.getTime();
        return curTime;
    }

    public static DateTime beforeInDay2(int day, DateTime date)
    {

        if (null == date)
        {
            return date;
        }
        return date.plusDays(day);
    }

    /**
     * @Title: increaseDate @author zhanweiwei @Description: 增加天数 @param @param optDate @param @param
     * days @param @return @return Date @throws
     */
    public static Date increaseDate(Date optDate, int days)
    {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(optDate);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    /**
     * @Title: increaseMonth @author ouzhihua @Description: 增加月份 @param @param optDate @param @param
     * days @param @return @return Date @throws
     */
    public static Date increaseMonth(Date optDate, int month)
    {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(optDate);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    /**
     * @Title: betweenDays @author zhanweiwei @Description: 计算日期之间相差的天数 @param @param pre @param @param
     * after @param @return @param @throws ParseException @return int @throws
     */
    public static int betweenDays(Date pre, Date after) throws ParseException
    {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        pre = sdf.parse(sdf.format(pre));
        after = sdf.parse(sdf.format(after));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(pre);
        long time1 = calendar.getTimeInMillis();
        calendar.setTime(after);
        long time2 = calendar.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    public static Date stringToDate2(String str)
    {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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

    // 获取某年某月的最大天数
    public static int someMonthMaxDay(Date strDate)
    {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(strDate); //放入你的日期 
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取月初及月末日期
     * @param dates 2019-08
     * @param isTime 是否带时分秒格式
     * @return
     */
    public static Map<String, String> getMonthFirstAndLast(String[] dates, String formats, boolean isTime){
        SimpleDateFormat format = new SimpleDateFormat(formats);
        //获取前月的第一天
        Calendar cal_1=Calendar.getInstance();//获取当前日期
        cal_1.set(Calendar.YEAR, Integer.valueOf(dates[0]));
        cal_1.set(Calendar.MONTH, Integer.valueOf(dates[1])-1);
        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String firstDay = format.format(cal_1.getTime());

        //获取前月的最后一天
        Calendar cale = Calendar.getInstance();
        cale.set(Calendar.YEAR, Integer.valueOf(dates[0]));
        cale.set(Calendar.MONTH, Integer.valueOf(dates[1]));
        cale.set(Calendar.DAY_OF_MONTH,0);
        String lastDay = format.format(cale.getTime());
        if(isTime) {
            firstDay += " 00:00:00";
            lastDay += " 23:59:59";
        }

        Map<String, String> firstAndLast = new HashMap<>();
        firstAndLast.put("firstDay",firstDay);
        firstAndLast.put("lastDay",lastDay);
        return firstAndLast;
    }

}
