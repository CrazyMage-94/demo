package com.example.springsecurityjwtdemo.mapper;

import com.example.springsecurityjwtdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends SuperMapper<User>{
}
