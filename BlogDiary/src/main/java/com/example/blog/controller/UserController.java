package com.example.blog.controller;

import com.example.blog.common.ResultUtil;
import com.example.blog.entity.user;
import com.example.blog.services.UserService;
import com.example.blog.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/userSelect")
    public Object userSelect(){
        List<user> userList = userService.userSelectAll();
        return ResultUtil.getResult(200,"人员查询成功",true,userList);
    }

    //@RequestMapping(value = "/userAdd",method = {RequestMethod.POST,RequestMethod.GET}) //第一种写法
    @PostMapping("/userAdd")
    public Object userAdd(@RequestBody user userEx){
        userService.save(userEx);
        return ResultUtil.getResult(200,"人员保存成功",true,"userAdd");
    }

    @PostMapping("/userUpdate")
    public Object userUpdate(@RequestBody user userEx){
        userService.updateById(userEx);
        return ResultUtil.getResult(200,"人员更新成功",true,"userUpdate");
    }

    @PostMapping("/userDelect")
    public Object userDelect(@RequestBody List<user> userDelList){
        for (user userFor: userDelList) {
            userService.removeById(userFor.id);
        }
        return ResultUtil.getResult(200,"人员删除成功",true,"userDelect");
    }

}
