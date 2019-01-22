package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.DengjiMapper;
import com.slwh.emr.model.Dengji;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.service.DengjiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DengjiServiceimpl implements DengjiService {
    @Resource
    private DengjiMapper dengjiMapper;
    @Override
    public Dengji selectById(Integer id) {
        return dengjiMapper.selectById(id);
    }

    @Override
    public int insert(Dengji dengji) {
        return dengjiMapper.insert(dengji);
    }

    @Override
    public int update(Dengji dengji) {
        return dengjiMapper.updateById(dengji);
    }

    @Override
    public int delete(Integer dId) {
        return dengjiMapper.deleteById(dId);
    }
}
