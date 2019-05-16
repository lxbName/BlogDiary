package com.example.blog.services;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.blog.entity.user;

import java.util.List;

public interface UserService extends IService<user> {

    List<user> userSelectAll();
}
