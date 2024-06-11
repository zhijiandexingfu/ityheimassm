package com.itheima.controller;

import com.itheima.dao.BookDao;
import com.itheima.entity.BookEntity;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    /**
     * 保存 book
     * @param book
     * @return
     */
    @PostMapping
    public boolean save(@RequestBody BookEntity book) {
        bookService.save(book);
        return true;
    }
@GetMapping
    public List<BookEntity> getAll() {
    return bookService.getAll();
    }
    @GetMapping("/{id}")
    public BookEntity getByID(@PathVariable int id) {
        BookEntity bookEntity = bookService.getByID(id);
        return bookEntity;
    }
    @DeleteMapping("/{id}")
    public boolean deleteByID(@PathVariable int id) {
        return bookService.deleteByID(id);
    }
    @PutMapping
    public boolean updateBook(@RequestBody BookEntity book) {
        return bookService.updateBook(book);
    }
}
