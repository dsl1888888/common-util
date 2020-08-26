package com.fgsc.enums;

public enum RespEnum
{

    // 请重试
    SYSTEM_ROUTE_ERROR("-666", "请求路径出错"),
    /** 访问成功返回 */
    SYSTEM_SUCCESS("1", "成功"),
    /** 访问失败返回 */
    SYSTEM_ERROR("0", "操作失败"),
    /** 服务升级维护中,请稍后 */
    SYSTEM_SERVER_UPGRADE_MAINTENANCE("-7", "服务升级维护中,请稍后"),
    /** 网关降级 */
    SYSTEM_GATEWAYDOWNGRADE("888885", "网关降级"),
    /** 请求超限 */
    SYSTEM_TPSTOHIP("-119", "系统繁忙"),//请求超限
 
    /** 恶意请求SQL攻击   恶意请求XSS攻击*/
    SYSTEM_MALICIOUS_REQUESTS_SQL_OR_XSS_GONGJI_ERROE("888816", "恶意请求SQL,XSS攻击"),
    
    /** 请重试 */
    SYSTEM_OCCURS_ERROR("-9", "系统内部出错"),
    SYSTEM_SIGN_FAIL("-8", "验签失败"),
    SYSTEM_SYSEXCEPTION("888883", "请重试"),
    SYSTEM_PARAM("888882", "参数有误"),
    SYSTEM_CAPTCHA_ERROR("888881", "图形验证码有误"),
    SYSTEM_SMS_CAPTCHA_ERROR("888880", "短信验证码有误"),

   /** 请重试 */
   SYSTEM_SYSEXCEPTION_REST_LOGIN("600001", "请重试"),

   /** 请重试 */ 
   SYSTEM_SYSEXCEPTION_SERVICE_USER("600002", "请重试"),


    /** 请重试 */
    SYSTEM_SYSEXCEPTION_SERVICE("600003", "请重试"),

       // 业务异常-->>用戶业务

    /** 后台用户登陆失败 */
    AMDINLOGINFAIL("7777777", "后台用户登陆失败"),


    // 业务异常-->>用戶业务
    /**请设置收货地址*/
    USER_MEM_SHIP_ADDRESS_ISEMPTY("12345", "暂没有默认收货地址,请设置收货地址"),
    /** 用户登陆失败 */
    USER_LOGIN_FAIL("100000", " 用户登陆失败"),
    /*用户未登录或已过期**/
    USER_NO_LOGIN("110", "用户未登录或已过期"),
    USER_PWD_ERROR("111", "用户密码有误"),
    USER_PWD_STATUS_ERROR("112", "请勿重复设置密码"),
    USER_NO_RISK_ERROR("113", "您没有该权限"),
    USER_IS_BIND_PHONE_ERROR("114", "您已绑定手机号，请勿重复绑定"),
    USER_PHONE_EXISTING_ERROR("115", "手机号已被其他账户绑定"),
    USER_PWD_NOT_SETUP_ERROR("116", "您还未设置密码"),
    USER_PWD_MUST_INPUT_ERROR("117", "请输入密码"),
    USER_SEND_PACKAGE_FAIL("118", "发货失败"),
    USER_SEND_PACKAGE_SUCCESS("119", "发货成功"),
    USER_SEND_PACKAGE_PIFA_FAIL("120", "批发区操作失败"),
    USER_SEND_PACKAGE_REPEATSEND_FAIL("121", "已发货订单"),
    USER_SEND_PACKAGE_REPEATSEND_WULIUBIANHAO_FAIL("122", "物流号已存在系统"),
    USER_INFO_ERROR("123", "用户信息有误"),
    USER_TYPE_SETUP_ERROR("124", "该用户已是经销商"),
    USER_PROCEDURE_ERROR("125", "该用户已是经销商"),
    SYSTEM_ERROR_RESET("126", "失败"),

    GOODS_IS_COMMENT_ERROR("220", "请勿重复评论"),
    GOODS_NO_RECEIVE_ERROR("221", "请先确认收货后进行评论"),
    GOODS_NO_INVENTOEY_ERROR("222", "商品卖完了"),
    GOODS_NOT_EXISTS_ERROR("223", "无此商品"),
    GOODS_NOT_EXISTS_OR_OFF_SHOP_ERROR("223", "无此商品或已下架"),
    GOODS_NUM_ERROR("225", "商品数量必须大于0"),
    
    /**请设置收货地址*/
    ORDER_SELECT_SHIP_ADDRESS_ISEMPTY("660004", "请选择收货地址"),
    PARAMLOSE("600004", "必要参数缺失"),
    SYSTEMBUSY("900005", "系统繁忙,请重试"),
    
    TPYEERROR("600010", "订单类型不存在"),
    STOCKSHORT("600005", "库存不足"),
    BEYONDLIMIT("600006", "已超过最大可购买数量"),
    TICKETSHORT("600007", "抵用劵不足"),
    ACCOUNTMONEYSHORT("600008", "账户余额不足"),
    COMMITFAIL("600009", "订单提交失败"),
    VOLUMECAP("700001", "购买数量已达到上限"),
    NOPERMISSIONS("700002", "无权限购买此商品"),
    CLOSETIME("700003", "商品还未开售"),
    ACCOUNT_EXCEPTION("900000", "请重试"),
    ACCOUNT_PAY_FAIL("900001", "订单支付失败"),
    ORDER_PAY_FAIL("900002", "订单已取消，无法支付"),
    ORDER_CANCEL_REPAET("900009", "订单已取消，请勿重复操作"),
    STATUSEXCEPTION("900002", "请勿重复支付！"),
    ACCOUNTNOTEXIST("900003", "账户信息不存在"),
    ACCOUN_WITHDRAW_MUST_GREATER_THAN_ZERO("900008", "提现金额必须大于0"),
    REPEATSEND("900004", "请勿重复操作发货！"),
    ORDER_SUBMIT_SPEED_TOHIGN("2000", "操作过于频繁"),
    ORDER_SUBMIT_COUNT_TOHIGN("2008", "您的提交次数已超限制,请明天再试！"),
    ORDER_PAY_REPEAT_ERROE("2001", "订单已受理"),
    ORDER_NOT_FOUND("2002", "未查到相应订单"),
    PAY_YS_MERHOD_OVERSTEP_MONEY("1000","[银盛]渠道超额,请换其他方式付款"),
    PAY_YS_MERHOD_PAY_FAIL("1001","[银盛]付款失败,详情请联系客服"),
    PAY_YS_MERHOD_NOT_BANDING_CARD("1002","[银盛]卡已未签约(绑卡),请签约(绑卡);如果显示签约(绑卡)状态,请先解约再签约"),//卡已未签约(绑卡),请签约(绑卡);如果显示签约(绑卡)状态,请先解约再签约
    PAY_YS_MERHOD_NOT_ALLOW_HACKER_USER_ACCOUNT("1003","[银盛]请用本人账号付款,务恶意付款"),
    PAY_YS_MERHOD_ORDER_TO_PAY_FAIL("1004","[银盛]订单快捷支付失败(准备支付失败)"),
    PAY_YS_MERHOD_WECHAT_ORDER_TO_PAY_FAIL("1005","[银盛]订单微信支付失败(准备支付失败)"),
    PAY_TYPE_ERROR("1006","支付方式有误"),
    
//    消费区
    XFQ_PLEASE_SELECT_A_GOODS_ERROR("900","请选择消费区商品"),
    XFQ_STOCK_NOT_ENOUGH_ERROR("901","消费区商品库存不足"),
    XFQ_PINGLUN_FAIL("902","消费区评论失败"),
    XFQ_CONFIRM_FAIL("903","请勿重复确认"),
    XFQ_ADD_CONSCART_NUM_MUST_LARGE_ZERO_ERROE("904","添加数量必须大于0"),
    
    HTTP_STATUS_NOT_FOUND("404", "Not Found");
   

       public static RespEnum getByName(String name) {
           RespEnum valueOf = RespEnum.valueOf(name);
           return valueOf;
       }


       private String code;

       private String msg;

       private RespEnum(String code, String msg) {
           this.code = code;
           this.msg = msg;
       }

       public String getCode() {
           return code;
       }
       
       public static String getCodeValue(String name) {
    	   RespEnum byName1 = RespEnum.getByName(name );
           return byName1.getCode();
       }

       public String getMsg() {
           return msg;
       }

       public static void main(String[] args)
       {

           RespEnum byName = RespEnum.getByName(RespEnum.SYSTEM_ERROR.name());
           System.out.println(byName.getMsg());
           
           RespEnum byName1 = RespEnum.getByName(RespEnum.SYSTEM_ERROR.name());
           System.out.println(byName1.getCode());
       }
}
