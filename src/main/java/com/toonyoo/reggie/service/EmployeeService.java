package com.toonyoo.reggie.service;


import com.toonyoo.reggie.pojo.Employee;
import com.toonyoo.reggie.pojo.EmployeeDTO;

public interface EmployeeService {

    Employee selectOneByName(EmployeeDTO employeeDto);
}
