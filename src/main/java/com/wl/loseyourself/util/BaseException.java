package com.wl.loseyourself.util;

/**
 * @author: wl
 * @Date: 2020/4/26 14:51
 * @Description: 异常处理
 */
public class BaseException extends RuntimeException {

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }
}
