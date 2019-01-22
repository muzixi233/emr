package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.DoctorMapper;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DoctorServiceimpl implements DoctorService {
    @Resource
    private DoctorMapper doctorMapper;

    @Override
    public Doctor login(String dNum, String dPassword) {
        return doctorMapper.login(dNum,dPassword);
    }

    @Override
    public List<Doctor> selectAll() {
        List<Doctor> doctor =doctorMapper.selectAll();
        return doctor;
    }

    @Override
    public int sign(Doctor doctor){
        return doctorMapper.insert(doctor);
    }

    @Override
    public int update(Doctor doctor) {
        return doctorMapper.updateById(doctor);
    }

    @Override
    public int delete(Integer dId) {
        return doctorMapper.deleteById(dId);
    }

    @Override
    public Doctor selectByName(String dNname) {
        return doctorMapper.selectByName(dNname);
    }


}
