package com.jjkj.common.tools;

import java.text.DecimalFormat;

/**
 * Generator Periods Tools
 * 
 * @author Administrator
 *
 */
public class GeneratorPeriodsTools
{

    public static Integer getRandomInteger(Integer integer)
    {

        Integer res = 000;

        if (null == integer)
        {
            return res;
        }

        return integer + 1;
    }

    public static String getRandomString(Integer integer)
    {

        String defaultString = "0000";
        Integer res = 000;

        if (null == integer)
        {
            return haoAddOne_2(defaultString);
        }

        return haoAddOne_2(String.valueOf(integer));
    }

    //流水号加1后返回，流水号长度为4  
    private static final String STR_FORMAT = "000";

    public static String haoAddOne_2(String liuShuiHao)
    {
        Integer intHao = Integer.parseInt(liuShuiHao);
        intHao++;
        DecimalFormat df = new DecimalFormat(STR_FORMAT);
        return df.format(intHao);
    }

    public static String formatNumber(Integer integer)
    {

        if (null == integer)
        {
            return "000";
        }
        DecimalFormat df = new DecimalFormat(STR_FORMAT);
        return df.format(integer);
    }

    public static void main(String[] args)
    {
        //		System.out.println(haoAddOne_2("10"));
        //		System.out.println(haoAddOne_2(null));

        System.out.println(getRandomString(19));
        System.out.println(getRandomString(null));
        System.out.println(formatNumber(23));
        System.out.println(formatNumber(null));
    }
}
