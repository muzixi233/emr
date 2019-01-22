package com.slwh.emr.controller;

import com.slwh.emr.model.Dengji;
import com.slwh.emr.service.DengjiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("dengji")
public class DengjiController {
    @Resource
    private DengjiService dengjiService;

    @RequestMapping("selectById")
    public Dengji selectById(Integer id){
        return dengjiService.selectById(id);
    }

    @RequestMapping("/insert")
    public int insert(Dengji dengji){
        return dengjiService.insert(dengji);

    }

    @RequestMapping("/update")
    public  int update(Dengji dengji){
        return dengjiService.update(dengji);
    }

    @RequestMapping("/delete")
    public int delete(Integer dId){
        return dengjiService.delete(dId);
    }
}
