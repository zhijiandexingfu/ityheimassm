package com.itheima.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception){
        System.out.println("出现异常了，铁子");
        Result result = new Result(4000,null,"出现异常了，请稍后再试");
        return result;
    }

}
