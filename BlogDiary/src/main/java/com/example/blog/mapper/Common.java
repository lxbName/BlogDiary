package com.example.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component
public interface Common{

    //登录查询
    @Select("select userName from user where id=#{id} and userPassword=#{userPassword}")
    public String login(@Param("id") String id,@Param("userPassword") String userPassword);

}