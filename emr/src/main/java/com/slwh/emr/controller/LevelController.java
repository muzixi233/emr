package com.slwh.emr.controller;

import com.slwh.emr.model.Doctor;
import com.slwh.emr.model.Level;
import com.slwh.emr.service.DoctorService;
import com.slwh.emr.service.LevelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("level")
public class LevelController {
    @Resource
    private LevelService levelService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello springboot";
    }

    @RequestMapping("/selectById")
    public Level selectById(Integer lId){
        return levelService.selectById(lId);
    }
    @RequestMapping("/selectAll")
    public Level selectAll(){
        return levelService.selectAll();
    }
}
