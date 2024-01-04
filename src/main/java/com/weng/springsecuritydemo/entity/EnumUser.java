package com.weng.springsecuritydemo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.weng.springsecuritydemo.common.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@TableName(value ="enum_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnumUser implements Serializable, UserDetails
{
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     *
     */
//    @NotBlank
    private String username;

    /**
     *
     */
//    @NotBlank
    private String password;



    private String role;

    /**
     * 用户状态(0-正常启用，1-禁用)
     */
    private Integer status;

    /**
     *
     */
    private LocalDateTime createTime;

    /**
     *
     */
    private LocalDateTime updateTime;

    /**
     * 0-正常，1-被删除
     */
    private Integer deleted;


    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return List.of(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getPassword()
    {
        return password;
    }

    @Override
    public String getUsername()
    {
        return username;
    }
    @Override
    public boolean isAccountNonExpired()
    {
        return status==0;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return status==0;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return status==0;
    }

    @Override
    public boolean isEnabled()
    {
        return status==0;
    }
}
