package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.DrugMapper;
import com.slwh.emr.model.Drug;
import com.slwh.emr.service.DrugService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class DrugServiceimpl implements DrugService {
    @Resource
    private DrugMapper drugMapper;
    @Override
    public Drug selectByNum(String dNum) {
        return drugMapper.selectByNum(dNum);
    }

    @Override
    public int insert(Drug drug) {
        return drugMapper.insert(drug);
    }

    @Override
    public int update(Drug drug) {
        return drugMapper.updateById(drug);
    }

    @Override
    public int delete(Integer dId) {
        return drugMapper.deleteById(dId);
    }
}
