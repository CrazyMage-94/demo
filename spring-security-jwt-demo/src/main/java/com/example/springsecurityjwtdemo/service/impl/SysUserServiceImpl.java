package com.example.springsecurityjwtdemo.service.impl;

import com.example.springsecurityjwtdemo.mapper.SysUserMapper;
import com.example.springsecurityjwtdemo.entity.User;
import com.example.springsecurityjwtdemo.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends SuperServiceImpl<SysUserMapper,User> implements SysUserService {

}
