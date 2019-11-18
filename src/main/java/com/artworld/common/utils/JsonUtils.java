/*
package com.artworld.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

*/
/**
 * 自定义响应结构
 *//*

public class JsonUtils {
	private static ObjectMapper mapper = null;
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    */
/**
     * 将对象转换成json字符串。
     * <p>Title: pojoToJson</p>
     * <p>Description: </p>
     * @param data
     * @return
     *//*

    public static String objectToJson(Object data) {
    	try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			SystemLog.system("objectToJson:",e);
		}
    	return null;
    }
    
    */
/**
     * 将json结果集转化为对象
     * 
     * @param jsonData json数据
     * @param clazz 对象中的object类型
     * @return
     *//*

    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
        	SystemLog.system("jsonToPojo:",e);
        }
        return null;
    }
    
    */
/**
     * 将json数据转换成pojo对象list
     * <p>Title: jsonToList</p>
     * <p>Description: </p>
     * @param jsonData
     * @param beanType
     * @return
     *//*

    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {
    	JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
    	try {
    		List<T> list = MAPPER.readValue(jsonData, javaType);
    		return list;
		} catch (Exception e) {
			SystemLog.system("jsonToList:",e);
		}
    	
    	return null;
    }
    
    
	*/
/**
	 * 返回json数据
	 * 
	 * @param response
	 *//*

	public static void returnJson(HttpServletResponse response,Map<String,Object> result) {
		try {
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(JsonUtils.toJson(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public static String toJson(Object obj) {
		if (mapper == null) {
			mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Include.NON_NULL);
		}
		try {
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			mapper.setDateFormat(fmt);
			return mapper.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
*/
