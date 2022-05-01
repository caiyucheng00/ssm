package com.cyc.ssm.exception;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-29 15:35
 */
public class NoNumberException extends RuntimeException{
    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
