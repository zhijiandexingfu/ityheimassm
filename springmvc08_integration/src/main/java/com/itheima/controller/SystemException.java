package com.itheima.controller;

import lombok.Data;

@Data
public class SystemException extends RuntimeException {

    private int code;


    public SystemException(String message, int code) {
        super(message);
        this.code = code;
    }

    public SystemException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }
}
