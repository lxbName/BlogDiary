package com.example.blog.controller;

import com.example.blog.common.ResultUtil;
import com.example.blog.entity.user;
import com.example.blog.services.UserService;
import com.example.blog.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    //@RequestMapping(value = "/userAdd",method = {RequestMethod.POST,RequestMethod.GET}) //第一种写法
    @PostMapping("/userAdd")
    @ResponseBody
    public Object userAdd(@RequestBody user userEx){
        userService.save(userEx);
        System.out.println("useradd----------------");
        return ResultUtil.getResult(200,"人员保存成功",true);
    }

}
