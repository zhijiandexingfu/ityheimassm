package com.itheima.controller;

import com.itheima.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println(book);
        String res = ("save book success");
        return res;
    }

    @GetMapping
    public List<Book> getAll(){
        List<Book> res = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("JAVA入门到精通");
        book1.setType("计算机");
        book1.setDescription("入门经典教程");
        Book book2 = new Book();
        book1.setId(1);
        book2.setName("JVM精讲");
        book2.setType("计算机");
        book2.setDescription("晋级经典教程");
        System.out.println("get book success");
        res.add(book1);
        res.add(book2);
        return  res;
    }
}
