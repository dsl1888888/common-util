package com.jjkj.common.code;

import java.io.Serializable;

public class ProcedureCode implements Serializable{
     
	    private static final long serialVersionUID = 1L;
	    
		/**参考表bus_define**/
	    public static final String ORDER_CHECKS="P1001";    
	    public static final String ORDER_CREATED="P1002";   
	    public static final String ORDER_TO_PAY="P1003"; 
	    public static final String PAY_NOTIFY="P1004"; 
	    public static final String ORDER_ALONE_CANCEL = "P1005";
	    public static final String ORDER_BATCH_CANCEL = "P1006";
	    public static final String ORDER_ALONE_ACCOUNTS = "P1007";
	    public static final String ACCOUNT_PAY = "P1009";
	    public static final String PAY_BATCH_CANCEL = "P1014";
	    public static final String  GOODS_NEW = "P2021";
	    
	    public static final String CONSORDCHK="P1201";
	    public static final String CONSORDCRT="P1202";
	    public static final String CONSORDOFF="P1203";
	    public static final String CONSORDCAL="P1205";
	    
	    public static final String CONSORDPRE="P1211";
	    public static final String CONSORDNTF="P1212";
	    public static final String CONSORDACC="P1215";
	    
	    
	    
	    /**每日初始商品*/
	    public static final String  GOODS_CACHE_EVERYDAY = "P1000";
	    
	    public static final String AUTO="0";   //系统自动取消
	    public static final String HANDLES="1"; //用户手动取消
	 
}
