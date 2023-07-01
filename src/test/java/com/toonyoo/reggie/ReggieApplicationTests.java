package com.toonyoo.reggie;

import com.toonyoo.reggie.mapper.UserMapper;
import com.toonyoo.reggie.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ReggieApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectByPrimaryKey(1L);
        log.info(String.valueOf(user));
    }

}
