package com.itheima.dao;

import com.itheima.entity.BookEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BookDao{

    @Insert("insert into  t_book values(null,#{name},#{type},#{description})")
    boolean save(BookEntity book);

    @Select("select * from t_book")
    List<BookEntity> getAll();

    @Select("select * from t_book where id = #{id}")
    BookEntity getByID(int id);

    @Delete("delete from t_book where id = #{id}")
    boolean deleteByID(int id);

    @Update("update t_book set  name = #{name} type = #{type} description = #{description}")
    boolean updateBook(BookEntity book);
}
