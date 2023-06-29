package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(User row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(User row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    User selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(User row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(User row);
}