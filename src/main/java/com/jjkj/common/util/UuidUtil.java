package com.jjkj.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;

public class UuidUtil
{

    private UuidUtil()
    {
    }

    /** 获取id 雪花算法， 碎甲 机器 工作线程 */
    public static String getUUIDSnowflake()
    {
        Snowflake snowflake = IdUtil.createSnowflake(RandomUtil.randomLong(0, 32), RandomUtil.randomLong(0, 32));
        // System.out.println(snowflake.nextId());
        return "" + snowflake.nextId();
    }
    public static String getUUIDString()
    {
        Lock myLock = new ReentrantLock();
        myLock.lock();

        String finOrderNum = "";
        try
        {
            long nowLong = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));

            finOrderNum = "" + nowLong + getUUIDInt();

            while (finOrderNum.length() < 24)
            {
                finOrderNum = finOrderNum + "0";
            }
        }
        catch (Exception e)
        {
            finOrderNum = "";
            long nowLong = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));

            finOrderNum = "" + nowLong + getUUIDInt();

            while (finOrderNum.length() < 24)
            {
                finOrderNum = finOrderNum + "0";
            }
        }
        finally
        {
            myLock.unlock();
        }

        return finOrderNum;
    }

    public static int getUUIDInt()
    {
        String ssssString = UUID.randomUUID().toString().replace("-", "");
        int num = Math.abs(ssssString.hashCode());// 取绝对值
        // System.out.println(num);

        return num;
    }

    public static String getUUID1()
    {

        String prefix = "UUID";
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");

        return prefix + uuid;
    }
    // public static String getUUID()
    // {
    //
    // String prefix = "UUID";
    // String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    //
    // return prefix +DateUtil.getCurrentDate().replaceAll("-", "")+ uuid;
    // }

    // /**
    // * 锁对象，可以为任意对象
    // */
    // private static Object lockObj = "lockerOrder";
    // /**
    // * 订单号生成计数器
    // */
    // private static long orderNumCount = 0L;
    // /**
    // * 每毫秒生成订单号数量最大值
    // */
    // private static int maxPerMSECSize = 1000;

    // /**
    // * 生成非重复订单号，理论上限1毫秒1000个
    // *
    // * @author marver
    // * @return
    // */
    // public static String makeOrderNum()
    // {
    // // 最终生成的订单号
    // String finOrderNum = "";
    // try
    // {
    // synchronized (lockObj)
    // {
    // // 取系统当前时间作为订单号变量前半部分，精确到毫秒
    // long nowLong = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));
    // // 计数器到最大值归零，可扩展更大，目前1毫秒处理峰值1000个，1秒100万
    // if (orderNumCount >= maxPerMSECSize)
    // {
    // orderNumCount = 0L;
    // }
    // // 组装订单号
    // String countStr = maxPerMSECSize + orderNumCount + "";
    // finOrderNum = nowLong + countStr.substring(1);
    // orderNumCount++;
    // }
    // }
    // catch (Exception e)
    // {
    // e.printStackTrace();
    // }
    // return finOrderNum;
    // }

    // /**
    // * 生成非重复订单号，理论上限1毫秒1000个
    // *
    // * @author marver
    // * @return
    // */
    // public static String makeOrderNum()
    // {
    // return getUUIDString();
    // }

    // public static void main(String[] args)
    // {
    // // for (int i = 0; i < 10; i++)
    // // {
    // // String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    // // System.out.println(uuid);
    // // }
    // // Integer[] workerIdLong = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
    // //
    // // Integer[] datacenterIdLong = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
    // //
    // // // Snowflake snowflake = IdUtil.createSnowflake(Long.valueOf("31"), Long.valueOf("31"));
    // //
    // // Snowflake snowflake = IdUtil.createSnowflake(RandomUtil.randomLong(0, 32), RandomUtil.randomLong(0, 32));
    // // System.out.println(snowflake.nextId());
    //
    // // System.out.println(RandomUtil.randomLong(0, 1));
    //
    // // System.out.println(UuidUtil.makeOrderNum());
    // // long nowLong = Long.parseLong(new SimpleDateFormat("yyMMddHHmmss").format(new Date()));
    // // System.out.println(nowLong);
    //
    // // for (int i = 0; i < 1000000; i++)
    // // {
    // // System.out.println(UuidUtil.getUUIDString());
    // // }
    //
    // // 创建 一百万个个 看有重复的没， linux 指令 ：sort sssssssss.txt | uniq -d
    // for (int i = 0; i < 50; i++)
    // {
    // new Thread(new Runnable()
    // {
    //
    // @Override
    // public void run()
    // {
    // // TODO Auto-generated method stub
    // // System.out.println(111);
    //
    // for (int i = 0; i < 10000; i++)
    // {
    // System.out.println(UuidUtil.getUUIDString());
    // }
    // }
    // }).start();
    // ;
    // }
    // // System.out.println("1910120952431921262092".length());
    // }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5000; i++)
        {
            Snowflake snowflake = IdUtil.createSnowflake(RandomUtil.randomLong(0, 32), RandomUtil.randomLong(0, 32));
            System.out.println(snowflake.nextId());
        }
    }

}
