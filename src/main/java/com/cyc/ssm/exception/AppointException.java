package com.cyc.ssm.exception;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-29 15:35
 */
public class AppointException extends RuntimeException{
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }

}
