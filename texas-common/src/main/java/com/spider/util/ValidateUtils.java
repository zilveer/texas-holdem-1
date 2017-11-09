package com.spider.util;



import com.spider.core.ACK;
import com.spider.exception.BusinessException;

import java.util.List;

/**
 * 参数校验工具类
 * @author lxx
 * @date 2016年2月4日
 */
public class ValidateUtils {
	
	
	/**
	 * 验证对象是否存在
	 * @param obj
	 * @param message
	 */
	public static void validateObj(Object obj,String message){
		if(obj == null){
			throw new BusinessException(ACK.PARAM_ERROR,message);
		}
	}
	
	/**
	 * 验证字符串是否为空
	 * @param str
	 * @param message
	 */
	public static void validateString(String str,String message){
		if(str == null || "".equals(str)){
			throw new BusinessException(ACK.PARAM_ERROR,message);
		}
	}
	
	/**
	 * 验证ID是否合法
	 * @param id
	 * @param message
	 */
	public static void validateNumber(Integer id,String message){
		if(id == null || id <= 0){
			throw new BusinessException(ACK.PARAM_ERROR,message);
		}
	}
	
	/**
	 * 验证集合是否为空或长度为0
	 * @param list
	 * @param message
	 */
	public static void validateList(List<?> list, String message) {
		if(list == null || list.isEmpty()){
			throw new BusinessException(ACK.PARAM_ERROR,message);
		}
	}
	
}
