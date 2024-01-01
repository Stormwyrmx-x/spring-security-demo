package com.weng.springsecuritydemo.mapper;

import com.weng.springsecuritydemo.entity.TbUser;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TbUserMapperTest
{
    @Resource
    private UserMapper userMapper;
    @Test
    void selectUserByUsername()
    {
        TbUser tbUser = userMapper.selectUserByUsername("weng");
        System.out.println(tbUser);
    }

}