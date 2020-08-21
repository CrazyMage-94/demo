package com.example.springsecurityjwtdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springsecurityjwtdemo.mapper.SuperMapper;
import com.example.springsecurityjwtdemo.service.SuperService;

public class SuperServiceImpl<M extends SuperMapper<T>,T> extends ServiceImpl<M, T> implements SuperService<T> {
}


