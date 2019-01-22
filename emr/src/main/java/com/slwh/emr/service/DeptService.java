package com.slwh.emr.service;

import com.slwh.emr.model.Dept;


public interface DeptService {

    int insert(Dept dept);

    int update(Dept dept);

    int delete(Integer dId);

    Dept selectById(Integer dId);
}
