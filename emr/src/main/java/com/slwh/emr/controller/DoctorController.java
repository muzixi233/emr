package com.slwh.emr.controller;

import com.slwh.emr.cogfiger.Result;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.service.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author muzixi
 */
@Controller
@RequestMapping("doctor")
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    @RequestMapping("/hello")
    public String hello(){
        return "html/index";
    }

    @RequestMapping("/login")
    public Result login(String dNum, String dPassword){
        return Result.success(doctorService.login(dNum,dPassword));

    }
    @RequestMapping("/sign")
    public int sign(Doctor doctor){
        return doctorService.sign(doctor);

    }
    @RequestMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        return Result.success(doctorService.selectAll());
    }

    @RequestMapping("/selectByName")
    public Result selectByName(String dName){
        return Result.success(doctorService.selectByName(dName));
    }
    @RequestMapping("/update")
    public  int update(Doctor doctor){
        return doctorService.update(doctor);
    }
    @RequestMapping("/delete")
    public int delete(Integer dId){
        return doctorService.delete(dId);
    }
}
