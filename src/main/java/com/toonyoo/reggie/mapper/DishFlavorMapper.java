package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.DishFlavor;
import org.springframework.stereotype.Repository;

@Repository
public interface DishFlavorMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(DishFlavor row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(DishFlavor row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    DishFlavor selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(DishFlavor row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(DishFlavor row);
}