package com.slwh.emr.controller;

import com.slwh.emr.cogfiger.Result;
import com.slwh.emr.model.Admin;
import com.slwh.emr.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello springboot";
    }

    @RequestMapping("/login")
    public Result login(String aName, String aPassword){
        return Result.success(adminService.login(aName,aPassword));
    }
    @RequestMapping("/sign")
    public int sign(Admin admin){
        return adminService.sign(admin);

    }

    @RequestMapping("/update")
    public  int update(Admin admin){
        return adminService.update(admin);
    }
    @RequestMapping("/delete")
    public int delete(Integer aId){
        return adminService.delete(aId);
    }
}
