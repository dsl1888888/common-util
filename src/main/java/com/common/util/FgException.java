package com.common.util;


import lombok.Data;

/**
 * @description: 自定义异常
 * @Author: Marver
 * @date: 2019-07-05 13:19
 **/
@Data
public class FgException extends RuntimeException {

    private String msg;
    private String code;

    public FgException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public FgException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public FgException(String code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public FgException(String msg, String code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
