package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface EmployeeMapper {

    Employee selectOneByNameEmployee(Map condition);

}