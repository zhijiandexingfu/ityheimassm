package com.itheima.controller;

import lombok.Data;

@Data
public class BusinessException extends RuntimeException {

    private int code;


    public BusinessException(String message, int code) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }
}
