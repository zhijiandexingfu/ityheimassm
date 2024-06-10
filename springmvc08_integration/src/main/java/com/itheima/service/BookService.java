package com.itheima.service;

import com.itheima.entity.BookEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookService {

    boolean save(BookEntity book);

    List<BookEntity> getAll();

    BookEntity getByID(int id);

    boolean deleteByID(int id);

    boolean updateBook(BookEntity book);
}
