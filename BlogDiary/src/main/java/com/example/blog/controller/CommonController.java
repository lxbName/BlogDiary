package com.example.blog.controller;

import com.example.blog.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CommonController {

    @Autowired
    public CommonService commonService;

    @RequestMapping(value = "/", method = {RequestMethod.POST,RequestMethod.GET})
    public String login(){
        return "/login/login";
    }

    @RequestMapping(value = "/loginPage",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(HttpServletRequest request, HttpSession session){
        String id = request.getParameter("id");
        String userPassword = request.getParameter("userPassword");
        System.out.println("你输入的用户名为："+ id);
        System.out.println("你输入的密码为："+ userPassword);
        String userName = commonService.login(id,userPassword);
        session.setAttribute("userName",userName);
        if(userName == null){
            return "redirect:/";
        } else {
            return "redirect:/index";
        }
    }

    @RequestMapping(value = "/index",method = {RequestMethod.POST,RequestMethod.GET})
    public String loginIndex(){
        return "/login/test";
    }
}
