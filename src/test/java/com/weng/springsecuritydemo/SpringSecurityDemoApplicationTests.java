package com.weng.springsecuritydemo;

import com.weng.springsecuritydemo.dto.LoginParam;
import com.weng.springsecuritydemo.entity.User;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.AssertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;

import java.util.Arrays;

@SpringBootTest
class SpringSecurityDemoApplicationTests
{

    @Resource
    private PasswordEncoder passwordEncoder;
    @Test
    void contextLoads()
    {
        String encode = passwordEncoder.encode("wengyehao123");
        System.out.println(encode);
//        System.out.println(passwordEncoder.matches("ilovehusiqi", encode));

    }

//    @Test
//    public void testRecord()
//    {
//        LoginParam loginParam = new LoginParam(null,null,null);
//        User user=new User(null,null,null,null,null,null,null);
//        System.out.println(loginParam);
//        System.out.println(user);
//    }




}
