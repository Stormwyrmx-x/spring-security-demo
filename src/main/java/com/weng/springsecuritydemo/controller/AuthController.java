package com.weng.springsecuritydemo.controller;

import com.weng.springsecuritydemo.dto.LoginRequest;
import com.weng.springsecuritydemo.dto.RegisterRequest;
import com.weng.springsecuritydemo.entity.EnumUser;
import com.weng.springsecuritydemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController
{
    private final UserService userService;
    @PostMapping("/login")
    public String login(@RequestBody @Validated LoginRequest loginRequest)
    {
        String token = userService.login(loginRequest);
        return token;
    }

    @PostMapping("/register")
    public String register(@RequestBody @Validated RegisterRequest registerRequest)
    {
        String token=userService.register(registerRequest);
        return token;
    }



    @GetMapping("/user")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String testUser(@AuthenticationPrincipal UserDetails enumUser)
    {
        System.out.println(enumUser);
        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        return "testUser";
    }
    @GetMapping("/interface")
    @PreAuthorize("hasAuthority('USER')")
    public String testInterface()
    {
        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        return "testInterface";
    }
}
