package com.weng.springsecuritydemo.dto;

import com.weng.springsecuritydemo.common.RoleEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record LoginRequest(@NotBlank(message = "用户名不能为空")String username,
                           @NotBlank(message = "密码不能为空")String password)
{


}
