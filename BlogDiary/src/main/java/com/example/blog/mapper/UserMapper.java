package com.example.blog.mapper;

import com.example.blog.common.ParentMapper;
import com.example.blog.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper extends ParentMapper<user> {

    List<user> userSelAll();

}
