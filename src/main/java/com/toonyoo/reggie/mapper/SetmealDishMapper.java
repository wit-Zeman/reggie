package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.SetmealDish;
import org.springframework.stereotype.Repository;

@Repository
public interface SetmealDishMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(SetmealDish row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(SetmealDish row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    SetmealDish selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(SetmealDish row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(SetmealDish row);
}