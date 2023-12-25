package com.weng.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weng.springsecuritydemo.dto.LoginParam;
import com.weng.springsecuritydemo.entity.User;
import com.weng.springsecuritydemo.mapper.UserMapper;
import com.weng.springsecuritydemo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/**
* @author weng
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-12-21 15:59:46
*/
@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService/*, UserDetailsService*/
{
//    private final UserMapper userMapper;
    private final AuthenticationManager authenticationManager;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
//    {
//        LambdaQueryWrapper<User>userLambdaQueryWrapper=new LambdaQueryWrapper<>();
//        userLambdaQueryWrapper.eq(User::getUsername,username);
//        User user = userMapper.selectOne(userLambdaQueryWrapper);
//        return user;
//    }

    @Override
    public String login(LoginParam loginParam)
    {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
                = new UsernamePasswordAuthenticationToken(loginParam.username(), loginParam.password());
        Authentication authenticationResponse = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        return authenticationResponse.getPrincipal().toString();
    }
}




