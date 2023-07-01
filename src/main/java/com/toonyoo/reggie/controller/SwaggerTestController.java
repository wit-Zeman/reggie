package com.toonyoo.reggie.controller;

import com.toonyoo.reggie.mapper.UserMapper;
import com.toonyoo.reggie.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SwaggerTestController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/get/{userID}",method = RequestMethod.GET)
    @ApiOperation(value = "根据Id查询用户")
    public String getUser(@PathVariable("userID") Long id){
        User user = userMapper.selectByPrimaryKey(id);
        return user.toString();
    }
}
