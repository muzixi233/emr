package com.slwh.emr.service;

import com.slwh.emr.model.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor login(String dNum,String dPassword);

    List<Doctor> selectAll();

    int sign(Doctor doctor);

    int update(Doctor doctor);

    int delete(Integer dId);

    Doctor selectByName(String dNname);
}
