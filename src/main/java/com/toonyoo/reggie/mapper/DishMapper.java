package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.Dish;
import org.springframework.stereotype.Repository;

@Repository
public interface DishMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Dish row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Dish row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Dish selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Dish row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Dish row);
}