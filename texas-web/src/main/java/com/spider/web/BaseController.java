package com.spider.web;



import com.spider.core.Result;
import com.spider.core.ResultCodeEnum;


/**
 * @ClassName: BaseController
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 26/05/2017 17:00
 * @Description controller包下基类，全局定义接口返回结构体
 */
public class BaseController {




    /**
     * 返回成功结果（单个数据对象）
     *
     * @param object 返回数据
     * @return 接口数据
     */
    protected Result successResponse(Object object) {
        Result result = new Result(ResultCodeEnum.SUCCESS);
        result.setData(object);
        return result;
    }

    /**
     * 返回成功结果（不需返回数据）
     *
     * @return 接口数据
     */
    protected Result successResponse() {
        return successResponse(null);
    }

    /**
     * 返回错误信息
     *
     * @param code 状态码
     * @param msg  消息
     * @return 接口数据
     */
    protected Result errorResponse(String code, String msg) {
        return errorResponse(code, msg, null);
    }

    /**
     * 返回错误信息
     *
     * @param code   状态码
     * @param msg    消息
     * @param object 错误信息数据
     * @return 接口数据
     */
    protected Result errorResponse(String code, String msg, Object object) {
        Result result = new Result();
        result.setStatus(code);
        result.setSuccess(false);
        result.setMessage(msg);
        result.setData(object);
        return result;
    }
}
