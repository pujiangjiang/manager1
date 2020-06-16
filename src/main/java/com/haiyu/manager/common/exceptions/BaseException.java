package com.haiyu.manager.common.exceptions;

import com.haiyu.manager.common.IResponseEnum;

public class BaseException extends RuntimeException {

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BaseException(IResponseEnum iResponseEnum, Object[] args, String message, Throwable cause) {

    }

    public BaseException(IResponseEnum iResponseEnum, Object[] args, String message) {

    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
