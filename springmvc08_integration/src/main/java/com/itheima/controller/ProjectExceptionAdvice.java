package com.itheima.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.itheima.controller.ErrorCode.UNKNOWNK_ERROR;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result doException(BusinessException exception){
        System.out.println("出现BusinessException异常了，铁子");
        Result result = new Result(exception.getCode(),null, exception.getMessage());
        return result;
    }

    @ExceptionHandler(SystemException.class)
    public Result doException(SystemException exception){
        System.out.println("出现SystemException异常了，铁子");
        Result result = new Result(exception.getCode(),null, exception.getMessage());
        return result;
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception){
        System.out.println("难顶，出现Exception异常了，铁子");
        Result result = new Result(UNKNOWNK_ERROR,null, "系统异常，请稍后再试");
        return result;
    }

}
