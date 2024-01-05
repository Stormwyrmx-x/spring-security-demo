package com.weng.springsecuritydemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weng.springsecuritydemo.dto.LoginRequest;
import com.weng.springsecuritydemo.dto.RegisterRequest;
import com.weng.springsecuritydemo.entity.EnumUser;
import com.weng.springsecuritydemo.entity.TbUser;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.userdetails.UserDetails;

/**
* @author weng
* @description 针对表【user】的数据库操作Service
* @createDate 2023-12-21 15:59:46
*/
public interface UserService extends IService<TbUser>
{

//    String login(LoginRequest loginRequest);

    String login(LoginRequest loginRequest, HttpServletRequest request);

    String register(RegisterRequest registerRequest);

}
