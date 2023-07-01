package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.OrderDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(OrderDetail row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(OrderDetail row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    OrderDetail selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(OrderDetail row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(OrderDetail row);
}