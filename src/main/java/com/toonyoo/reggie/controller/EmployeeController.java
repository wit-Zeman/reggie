package com.toonyoo.reggie.controller;

import com.toonyoo.reggie.pojo.Employee;
import com.toonyoo.reggie.pojo.EmployeeDTO;
import com.toonyoo.reggie.service.EmployeeService;
import com.toonyoo.reggie.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @PostMapping("/login")
    public Result<Employee> login(HttpServletRequest request, @RequestBody EmployeeDTO employeeDto) {
        Employee employee = employeeService.selectOneByName(employeeDto);
        if (employee != null){
            HttpSession session = request.getSession();
            session.setAttribute("id",employee.getId());
        }
        return employee == null ? Result.error("员工不存在或员工状态被禁用") : Result.success(employee);
    };




}
