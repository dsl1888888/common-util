package com.fgsc.tools;

import com.fgsc.enums.RespEnum;

public class ResultData<T>  
{
 
    private String code=RespEnum.SYSTEM_SUCCESS.getCode();

    private String msg=RespEnum.SYSTEM_SUCCESS.getMsg();

    private String tip;

    private T data;

    public ResultData()
    {
        super();
    }

    /** 操作成功的 */
    public ResultData(T data)
    {
        super();
        this.data = data;
    }

    /** 操作失败的 */
    public ResultData(String code)
    {
        super();

        RespEnum respEnum = RespEnum.getByName(code);

        this.code = respEnum.getCode();
        this.msg =  respEnum.getMsg();
    }

    
    /**
     * 自定义返回信息
     * @param code
     * @param msg
     */
    public ResultData(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    /**
     * 全局异常信息返回
     * @param code
     * @param msg
     * @param tip
     */
    public ResultData(String code, String msg, String tip){
        this.code = code;
        this.msg = msg;
        this.tip = tip;
    }
    
    
    

    public ResultData(String code, String msg, String tip, T data)
    {
        super();
        this.code = code;
        this.msg = msg;
        this.tip = tip;
        this.data = data;
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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
