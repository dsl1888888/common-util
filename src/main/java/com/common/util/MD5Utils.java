package com.common.util;

//Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
//Jad home page: http://kpdus.tripod.com/jad.html
//Decompiler options: packimports(3) fieldsfirst ansi space 
//Source File Name:   MD5Utils.java


import org.apache.commons.codec.binary.Hex;
import org.springframework.util.Base64Utils;

import java.security.MessageDigest;

public class MD5Utils
{

 private static final String hexDigits[] = {
     "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
     "a", "b", "c", "d", "e", "f"
 };

 public MD5Utils()
 {
 }

 public static String MD5Encode(String origin)
 {
     String resultString = null;
     try
     {
         resultString = origin;
         MessageDigest md = MessageDigest.getInstance("MD5");
         resultString = Hex.encodeHexString(md.digest(resultString.getBytes("GBK")));
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
     return resultString;
 }

 public static String MD5EncodeBase64(String origin)
 {
     String resultString = null;
     try
     {
         resultString = origin;
         MessageDigest md = MessageDigest.getInstance("MD5");
         resultString = Base64Utils.encodeToString(md.digest(resultString.getBytes("utf-8")));
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
     return resultString;
 }

 public static String byteArrayToHexString(byte b[])
 {
     StringBuilder resultSb = new StringBuilder();
     byte abyte0[] = b;
     int i = abyte0.length;
     for (int j = 0; j < i; j++)
     {
         byte aB = abyte0[j];
         resultSb.append(byteToHexString(aB));
     }

     return resultSb.toString();
 }

 private static String byteToHexString(byte b)
 {
     int n = b;
     if (n < 0)
         n = 256 + n;
     int d1 = n / 16;
     int d2 = n % 16;
     return (new StringBuilder()).append(hexDigits[d1]).append(hexDigits[d2]).toString();
 }

    public final static String MD5(String s){
        return MD5Utils.MD5EncodeBase64(MD5Utils.MD5Encode(s));
    }
 
public static void main(String[] args)
{
  System.out.println(MD5("123456"));
}

}
