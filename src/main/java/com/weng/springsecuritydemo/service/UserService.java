package com.weng.springsecuritydemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weng.springsecuritydemo.dto.LoginParam;
import com.weng.springsecuritydemo.entity.User;

/**
* @author weng
* @description 针对表【user】的数据库操作Service
* @createDate 2023-12-21 15:59:46
*/
public interface UserService extends IService<User>
{

    String login(LoginParam loginParam);
}
