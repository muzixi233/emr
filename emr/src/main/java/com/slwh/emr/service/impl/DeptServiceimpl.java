package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.DeptMapper;
import com.slwh.emr.model.Dept;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class DeptServiceimpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public int insert(Dept dept) {
        return deptMapper.insert(dept);
    }

    @Override
    public int update(Dept dept) {
        return deptMapper.updateById(dept);
    }

    @Override
    public int delete(Integer dId) {
        return deptMapper.deleteById(dId);
    }

    @Override
    public Dept selectById(Integer dId) {
        return deptMapper.selectById(dId);
    }
}
