package com.slwh.emr.service;

import com.slwh.emr.model.Bingli;
import com.slwh.emr.model.Doctor;

import java.util.List;

public interface BingliService {
    Bingli selectById(Integer id);

    List<Bingli>  selectAll();

    int insert(Bingli bingli);

    int update(Bingli bingli);

    int delete(Integer bId);
}
