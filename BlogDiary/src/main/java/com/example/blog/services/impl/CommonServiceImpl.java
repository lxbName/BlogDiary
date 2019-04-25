package com.example.blog.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.entity.user;
import com.example.blog.mapper.CommonMapper;
import com.example.blog.services.CommonService;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl extends ServiceImpl<CommonMapper, user> implements CommonService {

//    @Autowired
//    public Common commonmapper;

    @Override
    public String login(String id,String userPassword){
        return baseMapper.login(id,userPassword);
    }
}
