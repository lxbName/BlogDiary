package com.example.blog.services;

import com.example.blog.mapper.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommonService {

    @Autowired
    public Common commonmapper;

    public String login(String id,String userPassword){
        return commonmapper.login(id,userPassword);
    }
}
