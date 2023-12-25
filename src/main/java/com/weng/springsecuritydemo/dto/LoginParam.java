package com.weng.springsecuritydemo.dto;

import com.weng.springsecuritydemo.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;


public record LoginParam(@NotBlank(message = "用户名不能为空")String username,
                         @NotBlank(message = "密码不能为空")String password/*,
                         @NotNull @Validated User user*/)
{


}
