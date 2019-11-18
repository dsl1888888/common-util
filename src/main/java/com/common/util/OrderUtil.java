package com.common.util;

public class OrderUtil
{
	
//	private static SnowFlakeGenerator snowFlakeGenerator;
//	private static Lock _lock = new ReentrantLock();
//	private static boolean isInited = false;
//
//	public static void _init(long ip, long port) {
//		snowFlakeGenerator = new SnowFlakeGenerator(ip, port);
//		isInited = true;
//	}
//	
//	/**
//	   *  是否初始化完成
//	 * @return
//	 */
//	public static boolean isInited() {
//		return isInited;
//	}
//
//
//    public static String getDistributeId()
//    {
//        // check();
//        return "" + snowFlakeGenerator.nextId();
//	}
//
//    public static String getPayNoByTime()
//    {
//        // check();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//		String newDate = sdf.format(new Date());
//		return newDate + snowFlakeGenerator.nextId();
//	}
//
//    // private static void check()
//    // {
//    // if (null == snowFlakeGenerator){
//    // _lock.lock();
//    // try {
//    // if(null == snowFlakeGenerator) {
//    // snowFlakeGenerator = new SnowFlakeGenerator(00, 00);
//    // }
//    // }finally {
//    // _lock.unlock();
//    // }
//    // }
//    // }
//    
////    public static Long getWorkIp()
////    {
////        try
////        {
////            String hostAddress = IPUtils.getMyIp();
////            int[] ints = StringUtils.toCodePoints(hostAddress);
////            int sums = 0;
////            for (int b : ints)
////            {
////                sums += b;
////            }
////            return (long) (sums % 32);
////        }
////        catch (Exception e)
////        {
////            // 如果获取失败，则使用随机数备用
////            return RandomUtils.nextLong(0, 31);
////        }
////    }
//
//
//	 
//    public static void main(String[] args)
//    {
    // // String portStatic = "4655";
//        // // 65535
//        // while (portStatic.length() < 5)
//        // {
//        // portStatic = portStatic + "0";// 取每个服务的端口
//        // }
//        //
//        // System.out.println(portStatic);
//        //
//        // System.out.println(OrderUtil.getWorkIp());
//
//        String ssssString = UUID.randomUUID().toString().replace("-", "");
//        int num = Math.abs(ssssString.hashCode());// 取绝对值
//
//        System.out.println(num);
//    }
//		
//    
}

