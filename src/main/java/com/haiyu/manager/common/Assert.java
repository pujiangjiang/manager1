package com.haiyu.manager.common;


import com.haiyu.manager.common.exceptions.BaseException;

public interface Assert {

    /**
     * @param args
     * @return
     */
    BaseException newException(Object... args);

    /**
     * @param t
     * @param args
     * @return
     */
    BaseException newException(Throwable t, Object... args);

    /**
     * @param obj
     */
    default void assertNotNull(Object obj) {
        if (obj == null) {
            throw newException();
        }
    }

    /**
     * @param obj
     * @param args
     */
    default void assertNotNull(Object obj, Object... args) {
        if (obj == null) {
            throw newException(args);
        }
    }
}
