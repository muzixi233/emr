package com.slwh.emr.service;

import com.slwh.emr.model.Hospital;

public interface HospitalService {
    Hospital selectById(Integer hId);

    int insert(Hospital hospital);

    int update(Hospital hospital);

    int delete(Integer hId);
}
