package com.slwh.emr.controller;

import com.slwh.emr.cogfiger.Result;
import com.slwh.emr.model.Bingli;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.service.BingliService;
import com.slwh.emr.service.DoctorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("bingli")
public class BingliController {
    @Resource
    private BingliService bingliService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello springboot";
    }


    @RequestMapping("/insert")
    public int insert(Bingli bingli){
        return bingliService.insert(bingli);

    }

    @RequestMapping("/selectById")
    public Bingli selectById(Integer bId){
        return bingliService.selectById(bId);

    }

    @RequestMapping("/selectAll")
    public Result selectAll(){
        return Result.success(bingliService.selectAll());

    }
    @RequestMapping("/update")
    public  int update(Bingli bingli){
        return bingliService.update(bingli);
    }

    @RequestMapping("/delete")
    public int delete(Integer bId){
        return bingliService.delete(bId);
    }
}
