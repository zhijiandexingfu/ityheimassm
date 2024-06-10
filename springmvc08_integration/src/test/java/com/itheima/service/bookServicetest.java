package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.entity.BookEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class bookServicetest {
    @Autowired
    BookService bookService;

    @Test
    public void testGetBuID(){
        BookEntity book = bookService.getByID(1);
        System.out.println(book);
    }

    @Test
    public void testgetALl(){
        List<BookEntity> all = bookService.getAll();
        System.out.println(all);
    }
}
