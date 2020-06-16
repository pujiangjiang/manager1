package com.haiyu.manager.common.exceptions;

import com.haiyu.manager.common.IResponseEnum;

public class BussinessException extends BaseException {

    public BussinessException(IResponseEnum iResponseEnum, Object[] args, String message, Throwable cause) {
        super(iResponseEnum, args, message, cause);
    }

    public BussinessException(IResponseEnum iResponseEnum, Object[] args, String message) {
        super(iResponseEnum, args, message);
    }

}
