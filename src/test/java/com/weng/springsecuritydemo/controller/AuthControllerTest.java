package com.weng.springsecuritydemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthControllerTest
{
    @Test
    public void testUser()
    {
        UserDetails userDetails = User.withUsername("weng")
                .password("123")
                .roles("admin")
                .authorities("test:read")
                .build();
        System.out.println(userDetails);
    }

}