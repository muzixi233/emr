package com.slwh.emr.controller;

import com.slwh.emr.model.Dept;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.service.DeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    @RequestMapping("/insert")
    public int insert(Dept dept){
        return deptService.insert(dept);

    }

    @RequestMapping("/selectById")
    public Dept selectById(Integer id){
        return deptService.selectById(id);
    }

    @RequestMapping("/update")
    public  int update(Dept dept){
        return deptService.update(dept);
    }

    @RequestMapping("/delete")
    public int delete(Integer dId){
        return deptService.delete(dId);
    }
}
