package com.weng.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weng.springsecuritydemo.entity.Menu;
import com.weng.springsecuritydemo.mapper.MenuMapper;
import com.weng.springsecuritydemo.service.MenuService;
import org.springframework.stereotype.Service;

/**
* @author weng
* @description 针对表【menu(基于菜单的权限表)】的数据库操作Service实现
* @createDate 2023-12-25 19:24:14
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService
{

}




