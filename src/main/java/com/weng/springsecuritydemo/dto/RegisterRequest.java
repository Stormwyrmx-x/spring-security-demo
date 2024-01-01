package com.weng.springsecuritydemo.dto;

import com.weng.springsecuritydemo.common.RoleEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterRequest(@NotBlank String username,
                              @NotBlank String password,
                              @NotNull RoleEnum role)
{
}
