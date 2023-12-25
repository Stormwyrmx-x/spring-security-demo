package com.weng.springsecuritydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.weng.springsecuritydemo.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
* @author weng
* @description 针对表【role】的数据库操作Mapper
* @createDate 2023-12-25 19:24:14
* @Entity generator.domain.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}




