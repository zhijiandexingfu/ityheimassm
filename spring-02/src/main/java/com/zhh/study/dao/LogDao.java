package com.zhh.study.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {


    @Insert("insert into `t_log` (info,time) values(#{info},CURRENT_TIMESTAMP)")
    void record(@Param("info") String info);

}
