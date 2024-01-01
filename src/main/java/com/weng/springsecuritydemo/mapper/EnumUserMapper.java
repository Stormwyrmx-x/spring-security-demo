package com.weng.springsecuritydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.weng.springsecuritydemo.entity.EnumUser;
import com.weng.springsecuritydemo.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

/**
* @author weng
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-12-21 15:59:46
* @Entity generator.domain.User
*/
@Mapper
public interface EnumUserMapper extends BaseMapper<EnumUser> {


}




