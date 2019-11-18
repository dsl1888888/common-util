package com.jjkj.common.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class RandomChineseUtil
{
    
    private RandomChineseUtil() {}
    
    public static void main(String args[]) {
//        HashSet<String> set = new HashSet<String>();
//        for (int i = 0; i < 100; i++) {
//            String chineseName = getRandomJianHan(3);
//            if (!set.contains(chineseName)) {
//                set.add(chineseName);
//            }
//        }
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + "\n");
//        }
        
//        String chineseName = RandomChineseUtil.getRandomJianHan(3);
//        System.out.println(chineseName);
    }
    public static String getRandomJianHan(int len) {
        String ret = "";
        for (int i = 0; i < len; i++) {
            String str = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(hightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try {
                str = new String(b, "GBK"); // 转成中文
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            ret += str;
        }
        return ret;
    }
}
