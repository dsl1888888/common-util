package com.jjkj.common.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IdCardTools
{

    public static void main(String[] args)
    {
        String pid = "434444199410232816";
        String pid1 = "130503670401001";

        //		System.out.println(pid.length());
        //		System.out.println(IdCardTools.checkCustomAdultDigit(pid));
        //		System.out.println(IdCardTools.checkCustomAdultDigit(pid1));
        System.out.println(IdCardTools.checkCustomAdultDigit("431025200094102328"));

        // System.out.println(transIDCard15to18("130503670401001"));
    }

    /**
     * 
     * @param pid
     * @return
     */
    public static boolean checkCustomAdultDigit(String pid)
    {
        // String pid = "130503670401001";
        // String pid = "434444199410232816";

        // if not 18 Digit , convert 18 Digit to calcute

        if (pid.length() != 18)
        {
            pid = transIDCard15to18(pid);
        }

        //  sumapay  test environment idCard lenth is 16 ， we don't check     
        if (pid.length() == 16)
        {
            return true;
        }

        String dateStr = pid.substring(6, 10);
        System.out.println(dateStr);
        Integer customInteger = Integer.valueOf(dateStr);

        SimpleDateFormat ymdSdf = new SimpleDateFormat("yyyy");
        String todayString = ymdSdf.format(new Date());
        // String notifyIsShow = "notifyIsShow"+user_userunid+todayString ;

        Integer todayInteger = Integer.valueOf(todayString);

        Integer resp = todayInteger - customInteger;
        System.out.println(resp);

        if (resp < 18)
        {
            return false;
        }

        return true;
    }

    /**
     * 
     * @param IdCardNO
     * 
     * @return 18位标准身份证号
     * 
     *         方法用途：15位身份证转化为18位标准证件号
     * 
     * @return String
     * 
     * @author 我心自在
     * 
     */

    private static String transIDCard15to18(String IdCardNO)
    {

        String cardNo = null;

        if (null != IdCardNO && IdCardNO.trim().length() == 15)
        {

            IdCardNO = IdCardNO.trim();

            StringBuffer sb = new StringBuffer(IdCardNO);

            sb.insert(6, "19");

            sb.append(transCardLastNo(sb.toString()));

            cardNo = sb.toString();

        }

        return cardNo;

    }

    /**
     * 
     * 方法用途：15位补全‘19'位后的身份证号码
     * 
     * @param newCardId
     * 
     * @return
     * 
     * @return String
     * 
     * @author 我心自在
     * 
     */

    private static String transCardLastNo(String newCardId)
    {

        char[] ch = newCardId.toCharArray();

        int m = 0;

        int[] co = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };

        char[] verCode = new char[] { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };

        for (int i = 0; i < newCardId.length(); i++)
        {

            m += (ch[i] - '0') * co[i];

        }

        int residue = m % 11;

        return String.valueOf(verCode[residue]);

    }
}
