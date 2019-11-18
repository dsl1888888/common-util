package com.fgsc.enums;
/**
 * 用户权限枚举
 * @author Administrator
 *
 */
public enum UserPermissionEnum {
	LOGIN(1, "登录"),
	RETAIL(2,"体验"),
	WHSALE(3,"批发"),
	DRAW(4,"提现");
	
	public static UserPermissionEnum getByName(String name) {
    	UserPermissionEnum valueOf = UserPermissionEnum.valueOf(name);
        return valueOf;
    }


    private Integer code;

    private String msg;

    private UserPermissionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

 
}
