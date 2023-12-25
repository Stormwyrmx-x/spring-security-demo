package com.weng.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.weng.springsecuritydemo.entity.Menu;
import com.weng.springsecuritydemo.entity.User;
import com.weng.springsecuritydemo.mapper.MenuMapper;
import com.weng.springsecuritydemo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService
{
    private final UserMapper userMapper;
    private final MenuMapper menuMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        //1.查询用户的角色信息
        User user = userMapper.selectUserByUsername(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("用户名不存在");
        }
        //2.查询用户的权限信息
        Set<Menu> menus = menuMapper.selectMenuByRoleIds(user.getRoleIds());
        Set<String> permissions = user.getPermissions();
        menus.forEach(menu -> permissions.add(menu.getPermission()));

        return user;
    }
}
