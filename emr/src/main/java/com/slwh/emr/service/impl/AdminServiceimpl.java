package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.AdminMapper;
import com.slwh.emr.mapper.DoctorMapper;
import com.slwh.emr.model.Admin;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.service.AdminService;
import com.slwh.emr.service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceimpl implements AdminService {
@Resource
private AdminMapper adminMapper;

    @Override
    public Admin login(String aName, String aPassword) {
        return adminMapper.login(aName,aPassword);
    }

    @Override
    public int sign(Admin admin) {
        return adminMapper.insert(admin);
    }

    @Override
    public int update(Admin admin) {
        return adminMapper.updateById(admin);
    }

    @Override
    public int delete(Integer aId) {
        return adminMapper.deleteById(aId);
    }
}
