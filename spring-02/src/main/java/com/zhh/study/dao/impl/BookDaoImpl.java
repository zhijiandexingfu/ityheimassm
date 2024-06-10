package com.zhh.study.dao.impl;

import com.zhh.study.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {


//    void init(){
//        System.out.println("BookDaoImpl is initializing");
//    }
//    void destroy(){
//        System.out.println("BookDaoImpl is destroying");
//    }

    @Override
    public void save() {
        System.out.println("book dao save");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BookDaoImpl is destroying");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BookDaoImpl is initializing");
    }
}
