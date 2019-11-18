package com.artworld.common.entity;

import com.artworld.common.base.model.response.RestfulResponse;
import com.artworld.common.utils.DateUtils;

public class ResultObject   <T> extends RestfulResponse {

    int      code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
 

    private String message;

    public ResultObject(T data) {
        this.data = data;
    }
 
    private T data;
 
	private String timestamp = DateUtils.getCurrentDateStr();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ResultObject( ) {

    }

    public ResultObject(int code, String message, T data, String timestamp) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
    }

    public ResultObject(int code, String message,   String timestamp) {
        this.code = code;
        this.message = message;

        this.timestamp = timestamp;
    }

}
