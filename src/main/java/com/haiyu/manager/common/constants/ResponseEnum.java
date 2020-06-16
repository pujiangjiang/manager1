package com.haiyu.manager.common.constants;

import com.haiyu.manager.common.BusinessExceptionAssert;
import com.haiyu.manager.common.exceptions.BaseException;

public enum ResponseEnum implements BusinessExceptionAssert {

    BAD_LICENCE_FAILED(7001, "Bad licence type!"),
    LICENCE_NOT_FOUND(7002, "Licence not found!");


    int code;
    String message;


    ResponseEnum() {
    }

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public BaseException newException(Object... args) {
        return null;
    }

    @Override
    public BaseException newException(Throwable throwable, Object... args) {
        return null;
    }

}
