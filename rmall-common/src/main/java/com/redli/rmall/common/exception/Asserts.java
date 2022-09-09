package com.redli.rmall.common.exception;
import com.redli.rmall.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 *
 * @author redli
 * @date 2022/9/9
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
