package com.spider.core;

import java.io.Serializable;

/**
 * @ClassName: Result
 * @author: SuperZemo
 * @email: chenzeming@fanqie.com
 * @Date 22/05/2017 19:33
 * @Description 统一返回结果
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -2742391645138232450L;
    /**
     * 结果状态码
     */
    private String status;

    /**
     * 成功标志
     */
    protected boolean success;

    /**
     * 业务处理返回数据
     */
    protected Object data;

    /**
     * 返回消息
     */
    protected String message;

    private transient String dateFormat = "yyyy-MM-dd HH:mm:ss";

    private transient boolean enableDateFormat =false;

    public Result() {

    }

    public Result(ResultCodeEnum resultCode) {
        this.status = resultCode.getStatus();
        this.message = resultCode.getMessage();
        this.success = true;
    }

    public Result(ResultCodeEnum resultCode, Object data) {
        this.status = resultCode.getStatus();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    /**
     * 附加返回错误信息
     *
     * @param resultCode
     * @param extraRrrorMsg
     */
    public Result(ResultCodeEnum resultCode, String extraRrrorMsg) {
        this.status = resultCode.getStatus();
        this.message = resultCode.getMessage() + ":" + (null != extraRrrorMsg ? extraRrrorMsg : "");
        this.success = false;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean isSuccess) {
        this.success = isSuccess;
    }
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public boolean isEnableDateFormat() {
        return enableDateFormat;
    }

    public void setEnableDateFormat(boolean enableDateFormat) {
        this.enableDateFormat = enableDateFormat;
    }
}
