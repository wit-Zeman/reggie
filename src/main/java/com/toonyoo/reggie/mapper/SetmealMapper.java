package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.Setmeal;
import org.springframework.stereotype.Repository;

@Repository
public interface SetmealMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Setmeal row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Setmeal row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Setmeal selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Setmeal row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Setmeal row);
}