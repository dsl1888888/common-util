package com.jjkj.common.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStringTools
{

    public static String getRandomString(int length)
    { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++)
        {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 
     * @param length
     *            length
     * @param num
     *            num record
     * @return
     */
    public static List<String> getRandomStringBatch(int length, int num)
    { // length表示生成字符串的长度
        synchronized (RandomStringTools.class)
        {
            List<String> resList = new ArrayList<>();
            String base = "abcdefghijklmnopqrstuvwxyz0123456789";
            Random random = new Random();
            StringBuffer sb = new StringBuffer();

            while (num > 0)
            {
                sb = new StringBuffer();

                for (int i = 0; i < length; i++)
                {
                    int number = random.nextInt(base.length());
                    sb.append(base.charAt(number));
                }

                resList.add(sb.toString());

                num--;
            }

            return resList;
        }
    }

    public static String getRandomCodeExtraction(List<String> randomStringBatch)
    { //length表示生成字符串的长度
        String string = null;

        if (null != randomStringBatch && randomStringBatch.size() > 0)
        {

            int randomm = new Random().nextInt(randomStringBatch.size());

            string = randomStringBatch.get(randomm);
        }

        return string;
    }

    public static void main(String[] args)
    {
        //		System.out.println(getRandomString(6));

        List<String> randomStringBatch = RandomStringTools.getRandomStringBatch(6, 6);

        for (String string : randomStringBatch)
        {
            if (null != string)
            {
                System.out.println(string);
            }
        }

        System.out.println("中奖记录" + RandomStringTools.getRandomCodeExtraction(randomStringBatch));
    }
}
