package com.slwh.emr.service;

import com.slwh.emr.model.Doctor;
import com.slwh.emr.model.Drug;

public interface DrugService {

    Drug selectByNum(String dNum);

    int insert(Drug drug);

    int update(Drug drug);

    int delete(Integer dId);
}
