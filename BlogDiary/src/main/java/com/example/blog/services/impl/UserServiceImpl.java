package com.example.blog.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.entity.user;
import com.example.blog.mapper.UserMapper;
import com.example.blog.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,user> implements UserService {

    @Override
    public List<user> userSelectAll(){
        return baseMapper.userSelAll();
    }

}
