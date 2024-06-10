package com.zhh.study.dao;

import com.zhh.study.entity.CategoryEntity;
import lombok.Data;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

/**
 * 品牌分类关联
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 15:38:36
 */
public interface CategoryDao{

    @Select("select * from pms_category where  cat_id = ${cat_id}")
    CategoryEntity findByID(int cat_id);

//    @Insert("insert into pms_category)]")
    void addCategory(CategoryEntity categoryEntity);

    int deleteCategory(CategoryEntity categoryEntity);

    int updateCategory(CategoryEntity categoryEntity);


}
