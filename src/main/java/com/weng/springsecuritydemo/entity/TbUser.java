package com.weng.springsecuritydemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.weng.springsecuritydemo.common.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 * @TableName user
 */
@TableName(value ="tb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TbUser implements Serializable, UserDetails
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

    private List<Long> roleIds=new ArrayList<>();

    //查询出来的permissions可能为null，所以要初始化
    private List<String> permissions=new ArrayList<>();

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        if (!permissions.isEmpty())
        {
            return permissions.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
        }
        return null;
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