package com.slwh.emr.service;

import com.slwh.emr.model.Dengji;
import com.slwh.emr.model.Doctor;

public interface DengjiService {

    Dengji selectById(Integer id);

    int insert(Dengji dengji);

    int update(Dengji dengji);

    int delete(Integer dId);
}
