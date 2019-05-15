package com.example.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tab_user")
public class user {
    public String id;
    public String userName;
    public String userPassword;


//    @Override
////    public String toString(){
////        return "user{" +
////                "id='" + id + '\'' +
////                ", userName='" + userName + '\'' +
////                ", userPassword='" + userPassword + '\'' +
////                "}";
////    }
}
