package com.spider.exception;


import com.spider.core.ResultCode;

/**
 * 公用业务异常
 * Created by LZQ on 2016/10/12.
 */
public class BusinessException extends RuntimeException{
    private String status;
    private String msg;

    public BusinessException(ResultCode resultCode){
        this.status =  resultCode.getStatus();
        this.msg = resultCode.getMessage();
    }

    public BusinessException(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
