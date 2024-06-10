package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.entity.BookEntity;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    /**
     * 保存 book
     * @param book
     * @return
     */
    @Override
    public boolean save(BookEntity book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public List<BookEntity> getAll() {
        return bookDao.getAll();
    }

    @Override
    public BookEntity getByID(int id) {
        BookEntity bookEntity = bookDao.getByID(id);
        return bookEntity;
    }

    @Override
    public boolean deleteByID(int id) {
        return bookDao.deleteByID(id);
    }

    @Override
    public boolean updateBook(BookEntity book) {
        return bookDao.updateBook(book);
    }
}
