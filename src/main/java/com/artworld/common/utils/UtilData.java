package com.artworld.common.utils;

import java.util.Random;

public class UtilData {
    /**
     * 随机生成六位数验证码
     *
     * @return
     */
    public static int getRandomNum() {
        Random r = new Random();
        return r.nextInt(900000) + 100000;// (Math.random()*(999999-100000)+100000)
    }
}
