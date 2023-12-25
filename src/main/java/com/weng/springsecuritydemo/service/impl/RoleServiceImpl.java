package com.weng.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weng.springsecuritydemo.entity.Role;
import com.weng.springsecuritydemo.mapper.RoleMapper;
import com.weng.springsecuritydemo.service.RoleService;
import org.springframework.stereotype.Service;

/**
* @author weng
* @description 针对表【role】的数据库操作Service实现
* @createDate 2023-12-25 19:24:14
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService
{

}




