package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.Orders;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Orders row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Orders row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Orders selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Orders row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Orders row);
}