package com.jjkj.common.model;

import java.io.Serializable;

public class GalaxyhcResultData<T> implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 5836111297574638497L;

    private String status;

    private String code;

    private String msg;

    private T data;

    public GalaxyhcResultData()
    {
        super();
    }

    public GalaxyhcResultData(String status, String code, String msg, T data)
    {
        super();
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
