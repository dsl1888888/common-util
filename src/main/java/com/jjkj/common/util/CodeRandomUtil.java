package com.jjkj.common.util;

import java.util.Random;

public class CodeRandomUtil
{

    private CodeRandomUtil()
    {
    }

    public static String generatorRandomCode(int weishu)
    {
        if (weishu == 0)
        {
            weishu = 5;
        }

        char[] ch = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz23456789".toCharArray();
        int len = ch.length;
        String res = "";
        Random random = new Random();
        for (int i = 0; i < weishu; i++)
        {
            String rand = new Character(ch[random.nextInt(len)]).toString();
            res += rand;
        }

        return res;
    }

    public static void main(String[] args)
    {
        System.out.println(CodeRandomUtil.generatorRandomCode(5));
    }
}
