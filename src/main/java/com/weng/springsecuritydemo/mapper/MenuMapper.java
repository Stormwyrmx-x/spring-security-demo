package com.weng.springsecuritydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.weng.springsecuritydemo.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
* @author weng
* @description 针对表【menu(基于菜单的权限表)】的数据库操作Mapper
* @createDate 2023-12-25 19:24:14
* @Entity generator.domain.Menu
*/
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    Set<Menu> selectMenuByRoleIds(Set<Long> roleIds);
}




