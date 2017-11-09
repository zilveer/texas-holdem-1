package com.spider.core;

/**
 * 返回状态码
 * 定义公用的返回状态码，具体应用业务如需自行定义
 * Created by LZQ on 2016/10/12.
 */
public enum ResultCode {
    SUCCESS(ACK.COMMEN_SUCCESS,"成功"),
    PARAM_ERROR(ACK.PARAM_ERROR,"缺少必要参数或参数无效"),
    TIME_OUT(ACK.TIME_OUT,"请求超时"),
    SIFNATURE_ERROR(ACK.SIFNATURE_ERROR,"签名有误"),
    LOGIN_ERROR(ACK.LOGIN_ERROR,"用户信息有误，请重新登录"),
    FILE_UPLOAD_ERROR(ACK.FILE_UPLOAD_ERROR,"图片上传出错"),
    COMMEN_BUSINESS_EXCEPTION(ACK.BUSINESS_ERROR,"业务异常"),
    COMMON_SYSTEM_RPC_EXCEPTION(ACK.SYSTEM_RPC_EXCEPTION,"系统RPC异常"),
    COMMEN_SYSTEM_EXCEPTION(ACK.SYSTEM_EXCEPTION,"系统异常"),
    OTHER_EXCEPTION(ACK.SYSTEM_ERROR,"其他错误");


    /**
     * 状态码
     */
    private String status;

    /**
     * 状态码描述
     */
    private String message;

    private ResultCode(String status, String message){
        this.message = message;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
