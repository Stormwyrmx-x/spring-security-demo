//package com.weng.springsecuritydemo.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.weng.springsecuritydemo.entity.EnumUser;
//import com.weng.springsecuritydemo.entity.TbUser;
//import com.weng.springsecuritydemo.entity.Menu;
//import com.weng.springsecuritydemo.mapper.EnumUserMapper;
//import com.weng.springsecuritydemo.mapper.MenuMapper;
//import com.weng.springsecuritydemo.mapper.UserMapper;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class UserDetailsServiceImpl implements UserDetailsService
//{
//    private final EnumUserMapper enumUserMapper;
////    private final MenuMapper menuMapper;
////
////    @Override
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
////    {
////        //1.查询用户的角色信息
////        TbUser tbUser = userMapper.selectUserByUsername(username);
////        if (tbUser == null)
////        {
////            throw new UsernameNotFoundException("用户名不存在");
////        }
////        //2.查询用户的权限信息
////        List<Menu> menus = menuMapper.selectMenuByRoleIds(tbUser.getRoleIds());
////        List<String> permissions = tbUser.getPermissions();
////        menus.forEach(menu -> permissions.add(menu.getPermission()));
////
////        return tbUser;
////    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
//    {
//        LambdaQueryWrapper<EnumUser>enumUserLambdaQueryWrapper=new LambdaQueryWrapper<>();
//        enumUserLambdaQueryWrapper.eq(EnumUser::getUsername,username);
//        EnumUser enumUser = enumUserMapper.selectOne(enumUserLambdaQueryWrapper);
//        return enumUser;
//    }
//}
