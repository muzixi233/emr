package com.slwh.emr.controller;

import com.slwh.emr.model.Drug;
import com.slwh.emr.service.DoctorService;
import com.slwh.emr.service.DrugService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("drug")
public class DrugController {
    @Resource
    private DrugService drugService;

    @RequestMapping("/selectByNum")
    public Drug selectByNum(String dNum){
        return drugService.selectByNum(dNum);
    }

    @RequestMapping("/insert")
    public int insert(Drug drug){
        return drugService.insert(drug);

    }

    @RequestMapping("/update")
    public  int update(Drug drug){
        return drugService.update(drug);
    }
    @RequestMapping("/delete")
    public int delete(Integer dId){
        return drugService.delete(dId);
    }
}
