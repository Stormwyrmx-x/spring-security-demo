package com.weng.springsecuritydemo.mapper;

import com.weng.springsecuritydemo.entity.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest
{
    @Resource
    private UserMapper userMapper;
    @Test
    void selectUserByUsername()
    {
        User user = userMapper.selectUserByUsername("weng");
        System.out.println(user);
    }

}