package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Employee row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Employee row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Employee selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Employee row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Employee row);
}