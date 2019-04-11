package com.example.blog.entity;

import lombok.Data;

@Data
public class user {
    public String id;
    public String userName;
    public String userPassword;


    @Override
    public String toString(){
        return "user{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                "}";
    }
}
