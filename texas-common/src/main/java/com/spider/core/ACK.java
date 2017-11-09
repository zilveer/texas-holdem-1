package com.spider.core;
/**
 * 系统ACK 统一规定
 * 系统ACK统一为6位  000000 表示成功 和   99开头表示系统级别错误 都表示所以公用     
 * 建议 前两位表示应用编号00表示公用   后四位表示错误编号根据业务自己制定  
 * @author lzq
 * created on 2015年10月10日 下午4:10:03
 *
 */
public class ACK {
	/**
	 * 成功
	 */
	public static final String COMMEN_SUCCESS = "200";

	/**
	 * 业务异常
	 */
	public static final String BUSINESS_ERROR = "500";

	/**
	 * 系统远程调用异常
	 */
	public static final String SYSTEM_RPC_EXCEPTION = "501";

	/**
	 * 系统异常
	 */
	public static final String SYSTEM_EXCEPTION = "502";

	/**
	 * 系统错误,其他异常
	 */
	public static final String SYSTEM_ERROR = "503";



	/**
	 * 参数错误
	 */
	public static final String PARAM_ERROR = "400";
	/**
	 * 请求超时
	 */
	public static final String TIME_OUT = "401";
	/**
	 * 验签失败
	 */
	public static final String SIFNATURE_ERROR = "402";
	/**
	 * 登录错误
	 */
	public static final String LOGIN_ERROR = "403";

	/**
	 * 图片上传错误
	 */
	public static final String FILE_UPLOAD_ERROR ="510";
}
