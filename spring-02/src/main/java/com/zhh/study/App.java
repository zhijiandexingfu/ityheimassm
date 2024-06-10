package com.zhh.study;

import com.zhh.study.config.SpringConfig;
import com.zhh.study.dao.CategoryDao;
import com.zhh.study.entity.CategoryEntity;
import com.zhh.study.service.BookService;
import com.zhh.study.service.CarService;
import com.zhh.study.service.TransferService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        TransferService transferService = applicationContext.getBean(TransferService.class);
//        CategoryEntity categoryEntity = cat.findByID(1);
        transferService.transfer("tom","jerry",100d);
//        BookService bookService = (BookService) applicationContext.getBean("bookService");
//        CarService carService = (CarService) applicationContext.getBean("carService");
//        carService.save();
//        bookService.save();
//        System.out.println( "Hello World!" );
//        applicationContext.registerShutdownHook();
    }
}
