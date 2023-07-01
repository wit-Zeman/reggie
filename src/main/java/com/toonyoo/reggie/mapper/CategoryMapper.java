package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Category row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Category row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Category selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Category row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Category row);
}