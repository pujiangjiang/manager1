package com.haiyu.manager.common;

import com.haiyu.manager.common.exceptions.BaseException;
import com.haiyu.manager.common.exceptions.BussinessException;

import java.text.MessageFormat;

public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BussinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable throwable, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BussinessException(this, args, msg, throwable);
    }
}
