package com.toonyoo.reggie.service.Impl;

import com.toonyoo.reggie.mapper.EmployeeMapper;
import com.toonyoo.reggie.pojo.Employee;
import com.toonyoo.reggie.pojo.EmployeeDTO;
import com.toonyoo.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Employee selectOneByName(EmployeeDTO employeeDto) {
        Map<String, Object> condition = new HashMap<>();
        condition.put("username",employeeDto.getUsername());
        // MD5加密
        String password = DigestUtils.md5DigestAsHex(employeeDto.getPassword().getBytes());
        Employee employee = employeeMapper.selectOneByNameEmployee(condition);
        // 对比密码是否正确
        if (employee != null){
            if (employee.getPassword().equals(password)){
                if (employee.getStatus() == 1){
                    return employee;
                }
            }
        }
        return null;
    }
}
