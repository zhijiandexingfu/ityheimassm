package com.zhh.study.service.impl;

import com.zhh.study.dao.BookDao;
import com.zhh.study.dao.impl.BookDaoImpl;
import com.zhh.study.service.BookService;

public class BookServicempl implements BookService {

    BookDao bookDao;

//    private String dataBaseName;
//    private int  maxThreadNumber;

//    public BookServicempl(BookDao bookDao, String dataBaseName, int maxThreadNumber) {
//        this.bookDao = bookDao;
//        this.dataBaseName = dataBaseName;
//        this.maxThreadNumber = maxThreadNumber;
//    }


//    @Override
//    public void save() {
//        System.out.println("BookServiceImpl save" + "maxThreadNumber: " +maxThreadNumber
//                + "dataBaseName: " + dataBaseName);
//        bookDao.save();
//    }

    @Override
    public void save() {
        System.out.println("BookServiceImpl save");
        bookDao.save();
    }


    void init(){
        System.out.println("BookServicempl is initializing");
    }
    void destroy(){
        System.out.println("BookServicempl is destroying");
    }
    public void setBookDao(BookDaoImpl bookDao) {
        System.out.println("BookServicempl setter is running");
        this.bookDao = bookDao;
    }

//    public void setMaxThreadNumber(int maxThreadNumber) {
//        this.maxThreadNumber = maxThreadNumber;
//    }
//
//    public void setDataBaseName(String dataBaseName) {
//        this.dataBaseName = dataBaseName;
//    }
}
