package com.jjkj.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
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

    public static String getOrderIdByUUId() {
    	int machineId=new Random().nextInt(10);
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0     
        // 4 代表长度为4     
        // d 代表参数为正数型
        return machineId + String.format("%015d", hashCodeV);
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
        return num;
    }

    public static String getUUID1()
    {

        String prefix = "UUID";
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");

        return prefix + uuid;
    }
   

    public static void main(String[] args)
    {
        System.out.println(getOrderIdByUUId());
        System.out.println(new Random().nextInt(10));
        System.out.println(new Random().nextInt(10));
        System.out.println(new Random().nextInt(10));
        System.out.println(new Random().nextInt(10));
        System.out.println(new Random().nextInt(10));
        System.out.println(new Random().nextInt(10));
    }

}
