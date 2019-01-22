package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.HospitalMapper;
import com.slwh.emr.model.Hospital;
import com.slwh.emr.service.HospitalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HospitalServiceimpl implements HospitalService {
    @Resource
    private HospitalMapper hospitalMapper;

    @Override
    public Hospital selectById(Integer hId) {
        return hospitalMapper.selectById(hId);
    }

    @Override
    public int insert(Hospital hospital) {
        return hospitalMapper.insert(hospital);
    }

    @Override
    public int update(Hospital hospital) {
        return hospitalMapper.updateById(hospital);
    }

    @Override
    public int delete(Integer hId) {
        return hospitalMapper.deleteById(hId);
    }
}
