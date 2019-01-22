package com.slwh.emr.service;

import com.slwh.emr.model.Level;

public interface LevelService {
    Level selectById(Integer lId);

    Level selectAll();
}
