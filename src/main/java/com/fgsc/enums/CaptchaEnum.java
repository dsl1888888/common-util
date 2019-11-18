package com.fgsc.enums;

/**
 * @author marver
 * 2019/7/12 14:01
 * @description 验证码业务枚举
 */
public enum CaptchaEnum {

    USER_BIND_PHONE(1,"USER_BIND_PHONE","用户绑定手机号", "1012888"),
    USER_SETUP_PWD(2,"USER_SETUP_PWD","用户设置密码", "1012888"),
    CHANGE_PWD_CODE(3,"CHANGE_PWD_CODE","修改密码验证码", "1012888"),
    USER_WITHDRAW_CODE(4,"USER_WITHDRAW_CODE","用户提现验证码", "1012888"),
    REGISTER_CODE(5,"REGISTER_CODE","注册验证码", "1012888");

    private int id;
    private String code;
    private String text;
    private String smsType;

    CaptchaEnum(int id, String code, String text, String smsType) {
        this.id = id;
        this.code = code;
        this.text = text;
        this.smsType = smsType;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public String getSmsType() {
        return smsType;
    }

    public static String getByCode(String code) {
        for (CaptchaEnum c : CaptchaEnum.values()) {
            if (c.getCode() .equals(code)) {
                return c.code;
            }
        }
        return null;
    }

    public static Integer getById(String code) {
        for (CaptchaEnum c : CaptchaEnum.values()) {
            if (c.getCode() .equals(code)) {
                return c.id;
            }
        }
        return null;
    }


    /**
     * 获取短信行业类型
     * @param code
     * @return
     */
    public static String getSmsTypeByCode(String code) {
        for (CaptchaEnum c : CaptchaEnum.values()) {
            if (c.getCode() .equals(code)) {
                return c.smsType;
            }
        }
        return null;
    }
}
