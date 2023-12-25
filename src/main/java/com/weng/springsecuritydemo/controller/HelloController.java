//package com.weng.springsecuritydemo.controller;
//
//import com.weng.springsecuritydemo.dto.LoginParam;
//import com.weng.springsecuritydemo.dto.LogoutParam;
//import com.weng.springsecuritydemo.entity.TestUser;
//import com.weng.springsecuritydemo.entity.User;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
//import org.springframework.lang.NonNull;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Validated
//public class HelloController
//{
////     @GetMapping("/hello")
////     public String hello()
////     {
////         return "hello spring security";
////     }
//
//     @GetMapping("/index")
//     public String index(/*@Validated */LoginParam loginParam, User user)
//     {
//          System.out.println(loginParam);
//          System.out.println(user);
//          return "index";
//     }
//
//     @GetMapping("/index/test1")
//     public String test1(@Validated @RequestBody LogoutParam logoutParam)
//     {
//          System.out.println(logoutParam);
//          return "test";
//     }
//     @GetMapping("/index/test2")
//     public String test2(/*@Validated*/  LogoutParam logoutParam)
//     {
//          System.out.println(logoutParam);
//          return "test";
//     }
//
//     @GetMapping("/index/test3")
//     public String test3(@NotNull @Min(0) Integer integer)
//     {
//          System.out.println(integer);
//          return "test";
//     }
//
//     @GetMapping("/index/test4")
//     public String test4(/*@Validated*/ TestUser testUser)
//     {
//          System.out.println(testUser);
//          return "test";
//     }
//}
