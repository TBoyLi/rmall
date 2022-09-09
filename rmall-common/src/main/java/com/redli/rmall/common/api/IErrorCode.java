package com.redli.rmall.common.api;

/**
 * 常用API返回对象接口
 *
 * @author redli
 * @date 2022/9/9
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
