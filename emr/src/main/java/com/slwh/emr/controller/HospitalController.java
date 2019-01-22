package com.slwh.emr.controller;

import com.slwh.emr.model.Doctor;
import com.slwh.emr.model.Hospital;
import com.slwh.emr.service.DoctorService;
import com.slwh.emr.service.HospitalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("hospital")
public class HospitalController {
    @Resource
    private HospitalService hospitalService;

    @RequestMapping("/insert")
    public int insert(Hospital hospital){
        return hospitalService.insert(hospital);

    }

    @RequestMapping("/selectById")
    public Hospital selectById(Integer hId){
        return hospitalService.selectById(hId);
    }

    @RequestMapping("/update")
    public  int update(Hospital hospital){
        return hospitalService.update(hospital);
    }

    @RequestMapping("/delete")
    public int delete(Integer hId){
        return hospitalService.delete(hId);
    }
}
