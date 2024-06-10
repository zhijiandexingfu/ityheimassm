package com.zhh.study.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 品牌分类关联
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 15:38:36
 */
@Data
public class CategoryBrandRelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 分类id
     */
    private Long catelogId;
    /**
     *
     */
    private String brandName;
    /**
     *
     */
    private String catelogName;

}
