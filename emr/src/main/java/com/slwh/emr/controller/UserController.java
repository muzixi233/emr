package com.slwh.emr.controller;

import com.slwh.emr.model.Doctor;
import com.slwh.emr.model.User;
import com.slwh.emr.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello springboot";
    }


    @RequestMapping("/selectById")
    public User SelectById(Integer uId){
        return userService.selectById(uId);
    }
    @RequestMapping("/insert")
    public int insert(User user){
        return userService.insert(user);

    }

    @RequestMapping("/update")
    public  int update(User user){
        return userService.update(user);
    }
    @RequestMapping("/delete")
    public int delete(Integer uId){
        return userService.delete(uId);
    }
}
