package com.zhh.study.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountDao {


    @Update("update `money`  set amount = amount - #{transAmt} where name = #{name} ")
    void deleteAmount(@Param("name") String name, @Param("transAmt") double transAmt);

    @Update("update `money`  set amount = amount + #{transAmt} where name = #{name} ")
    void addAmount(@Param("name") String name, @Param("transAmt") double transAmt);
}
