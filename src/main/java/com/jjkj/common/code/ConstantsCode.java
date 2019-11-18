package com.jjkj.common.code;

import java.io.Serializable;

public class ConstantsCode implements Serializable
{

    
    
    /**
     * 
     */
    private static final long serialVersionUID = 7349668350462897257L;
    
    
    public static final String CODE_SUCCESS = "000000";
    public static final String MSG_SUCCESS = "操作成功";

    public static final String CODE_FAIL = "000000";
    public static final String MSG_FAIL = "操作失败";
    
    public static final String CONTROLLER_INPUT_PARAM_EMPTY_ORNULL_CODE_FAIL = "111111";
    public static final String CONTROLLER_INPUT_PARAM_EMPTY_ORNULL_MSG_FAIL = "服务层入参为空";
    
    public static final String SERVICE_INPUT_PARAM_EMPTY_ORNULL_CODE_FAIL = "222222";
    public static final String SERVICE_INPUT_PARAM_EMPTY_ORNULL_MSG_FAIL = "服务层入参为空";

    public static final String CUSTOM_REGISTER_CODE_SUCCESS = "700000";
    public static final String CUSTOM_REGISTER_MSG_SUCCESS = "用户注册成功";
    
     

    public static final String CUSTOM_REGISTER_CODE_FAIL = "700001";
    public static final String CUSTOM_REGISTER_MSG_FAIL = "用户注册失败";
    
    //用户相关6 打头
    public static final String USER_SYSTEM_MANAGER_LOGIN_CODE_FAIL = "600001";
    public static final String USER_SYSTEM_MANAGER_LOGIN_MSG_FAIL = "用户登录失败,请检查账户、密码是否正确";
    
    
    public static final String USER_RANDOM_CODE_INVALID_LOGIN_CODE_FAIL = "600002";
    public static final String USER_RANDOM_CODE_INVALID_LOGIN_MSG_FAIL = "用户登录失败,验证码无效";
            
    public static final String USER_REGISTER_PASSWD_NOT_EQUALS_PASSWD1_CODE_FAIL = "600003";
    public static final String USER_REGISTER_PASSWD_NOT_EQUALS_PASSWD1__MSG_FAIL = "用户注册失败,两次密码不一致";
    
    
    public static final String USER_UPLOADMERCHANTSAUDITDATA_CODE_FAIL = "600005";
    public static final String USER_UPLOADMERCHANTSAUDITDATA_MSG_FAIL = "用户上传商家审核资料失败";
    
    
    public static final String USER_IS_NOT_NORMAL_CODE_FAIL = "600004";
    public static final String USER_IS_NOT_NORMAL_MSG_FAIL = "不是正常用户";
    
    
    public static final String ADDROLEZ_CODE_FAIL = "700002";
    public static final String ADDROLEZ_MSG_FAIL = "角色失败";
    
    public static final String WORKERUPLOADRESUME_CODE_FAIL = "800002";
    public static final String WORKERUPLOADRESUME_MSG_FAIL = "用户上传简历";
    
    public static final String USER_LOGIN_CODE_FAIL = "800003";
    public static final String USER_LOGIN_MSG_FAIL = "用户登录失败";
    
    
}
