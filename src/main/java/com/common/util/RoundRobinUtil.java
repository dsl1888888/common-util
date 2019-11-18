package com.common.util;

/**
 * @author marver
 * 2019/8/29 14:59
 * @description 轮询工具类
 */
public class RoundRobinUtil {
    private static int index = 0;

    /**
     *  简单轮询算法
     *  简介: 1. 将目标放置一容器内.
     *       2. 定义一标识, 记录上次访问的该目标对象(标识应该是索引等, 需要有规律性)
     *       3. (该标识 + 1) 取模, 然后获取到该目标对象. 同时更新该目标标识
     * @param arr
     * @return
     */
    public static int roundRobin(int[] arr){
        int nextIndex = (index+1) % arr.length;
        index = nextIndex;
        return arr[index];
    }
}
