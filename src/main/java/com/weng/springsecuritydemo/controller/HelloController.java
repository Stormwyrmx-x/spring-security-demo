package com.weng.springsecuritydemo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
//在默认配置下，Spring MVC并不会自动验证简单类型的方法参数（如`String`、`int`等）
//若要让这些约束注解生效，需要在控制器方法参数前使用`@Valid`或`@Validated`注解来触发验证
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
