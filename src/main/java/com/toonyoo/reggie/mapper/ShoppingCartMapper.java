package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.ShoppingCart;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShoppingCart row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShoppingCart row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShoppingCart selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShoppingCart row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShoppingCart row);
}