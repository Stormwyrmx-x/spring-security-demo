package com.weng.springsecuritydemo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class HelloController
{
//     @GetMapping("/hello")
//     public String hello()
//     {
//         return "hello spring security";
//     }

     @GetMapping("/index")
     public String index()
     {
          System.out.println(SecurityContextHolder.getContext().getAuthentication());
          return "index";
     }
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
}
