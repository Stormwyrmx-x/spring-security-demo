package com.weng.springsecuritydemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weng.springsecuritydemo.dto.LoginParam;
import com.weng.springsecuritydemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController
{
    private final UserService userService;
    @PostMapping("/login")
    public String login(@RequestBody @Validated LoginParam loginParam)
    {
//        MappingJackson2HttpMessageConverter
        String token = userService.login(loginParam);
        return token;
    }
}
