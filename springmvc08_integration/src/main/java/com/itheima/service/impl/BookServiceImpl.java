package com.itheima.service.impl;

import com.itheima.controller.BusinessException;
import com.itheima.controller.ErrorCode;
import com.itheima.controller.SystemException;
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
//            if(id == 1){
//                throw new BusinessException("请不要用你的技术挑战我的耐心",ErrorCode.BUEINESS_ERROR);
//            }
//            try{
//                int i = 100/0;
//            }
//            catch (ArithmeticException e){
//                throw new SystemException("系统正在重试，请稍等",e,ErrorCode.SYSTEM_ERROR);
//            }

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
