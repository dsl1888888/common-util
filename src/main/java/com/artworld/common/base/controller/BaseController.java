package com.artworld.common.base.controller;


import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 控制器支持类
 */
public abstract class BaseController {

    protected Logger logger = LoggerFactory.getLogger(getClass());


    public Map<String,Object> obj2Map(Object obj) throws Exception{
        Map<String,Object> map=new HashMap<String, Object>();
        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            if (key.compareToIgnoreCase("class") == 0) {
                continue;
            }
            Method getter = property.getReadMethod();
            Object value = getter!=null ? getter.invoke(obj) : null;
            map.put(key, value);
        }
        return map;
    }


    //
    //
    //
    // /**
    // * 数据交互成功返回
    // *
    // * @param object json返回的数据
    // */
    // public static ResultObject newSYSTEM_SUCCESSResult(Object object,
    // RestfulRequest restfulRequest)
    // {
    // if ("1".equals(restfulRequest.getLanguage())){
    // return new ResultObject(RespEnum.SYSTEM_SUCCESS.getCode(),
    // RespEnum.SYSTEM_SUCCESS.getMsg(),
    // object, DateUtils.getCurrentDateStr());
    // }else if ( "2".equals(restfulRequest.getLanguage())){
    // return new ResultObject(ResultEnusEnum.SYSTEM_SUCCESS.getCode(),
    // ResultEnusEnum.SYSTEM_SUCCESS.getMsg(),
    // object, DateUtils.getCurrentDateStr());
    // }
    // return new ResultObject(RespEnum.SYSTEM_SUCCESS.getCode(),
    // RespEnum.SYSTEM_SUCCESS.getMsg(), object,
    // DateUtils.getCurrentDateStr());
    // }
    //
    // public static ResultObject newSYSTEM_SUCCESSResult(RestfulRequest
    // restfulRequest)
    // {
    // if ("1".equals(restfulRequest.getLanguage())){
    // return new ResultObject(RespEnum.SYSTEM_SUCCESS.getCode(),
    // RespEnum.SYSTEM_SUCCESS.getMsg(),
    // DateUtils.getCurrentDateStr());
    // }else if ( "2".equals(restfulRequest.getLanguage())){
    // return new ResultObject(ResultEnusEnum.SYSTEM_SUCCESS.getCode(),
    // ResultEnusEnum.SYSTEM_SUCCESS.getMsg(),
    // DateUtils.getCurrentDateStr());
    // }
    // return new ResultObject(RespEnum.SYSTEM_SUCCESS.getCode(),
    // RespEnum.SYSTEM_SUCCESS.getMsg(),
    // DateUtils.getCurrentDateStr());
    // }
    //
    //
    //
    // /**
    // * 系统异常
    // */
    // public static ResultObject newSystemSYSTEM_ERRORResult(RestfulRequest
    // restfulRequest)
    // {
    // if ("1".equals(restfulRequest.getLanguage())){
    // return new ResultObject(RespEnum.SYSTEM_ERROR.getCode(),
    // RespEnum.SYSTEM_ERROR.getMsg(),
    // DateUtils.getCurrentDateStr());
    // }else if ( "2".equals(restfulRequest.getLanguage())){
    // return new ResultObject(ResultEnusEnum.SYSTEM_ERROR.getCode(),
    // ResultEnusEnum.SYSTEM_ERROR.getMsg(),
    // DateUtils.getCurrentDateStr());
    // }
    // return new ResultObject(RespEnum.SYSTEM_ERROR.getCode(),
    // RespEnum.SYSTEM_ERROR.getMsg(),
    // DateUtils.getCurrentDateStr());
    // }
    //
    // /**
    // * 系统异常
    // */
    //
    //
    // public static ResultObject newSystemSYSTEM_ERRORResult(Object object,
    // RestfulRequest restfulRequest)
    // {
    // if ("1".equals(restfulRequest.getLanguage())){
    // return new ResultObject(RespEnum.SYSTEM_ERROR.getCode(),
    // RespEnum.SYSTEM_ERROR.getMsg(), object,
    // DateUtils.getCurrentDateStr());
    // }else if ( "2".equals(restfulRequest.getLanguage())){
    // return new ResultObject(ResultEnusEnum.SYSTEM_ERROR.getCode(),
    // ResultEnusEnum.SYSTEM_SUCCESS.getMsg(),
    // object, DateUtils.getCurrentDateStr());
    // }
    // return new ResultObject(RespEnum.SYSTEM_ERROR.getCode(),
    // RespEnum.SYSTEM_ERROR.getMsg(), object,
    // DateUtils.getCurrentDateStr());
    // }
    //
    // public static ResultObject v587(Object object, RestfulRequest
    // restfulRequest, String enumName) {
    //
    // if (null == enumName || "".equals(enumName)) {
    // if ("1".equals(restfulRequest.getLanguage())) {
    // return new ResultObject(RespEnum.SYSTEM_SUCCESS.getCode(),
    // RespEnum.SYSTEM_SUCCESS.getMsg(),
    // object,
    // null);
    // } else if ("2".equals(restfulRequest.getLanguage())) {
    // return new ResultObject(ResultEnusEnum.SYSTEM_SUCCESS.getCode(),
    // ResultEnusEnum.SYSTEM_SUCCESS.getMsg(),
    // object,
    // null);
    // }
    // return new ResultObject(RespEnum.SYSTEM_SUCCESS.getCode(),
    // RespEnum.SYSTEM_SUCCESS.getMsg(),
    // object,
    // null);
    // }
    //
    // // 如果有错误码的话
    //
    // if ("1".equals(restfulRequest.getLanguage())) {
    //
    // return new ResultObject(RespEnum.getByName(enumName).getCode(),
    // RespEnum.getByName(enumName).getMsg(), object, null);
    // } else if ("2".equals(restfulRequest.getLanguage())) {
    //
    // return new ResultObject(ResultEnusEnum.getByName(enumName).getCode(),
    // ResultEnusEnum.getByName(enumName).getMsg(), object, null);
    // }
    // return new ResultObject(RespEnum.getByName(enumName).getCode(),
    // RespEnum.getByName(enumName).getMsg(), object, null);
    // }


}
