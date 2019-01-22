package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.LevelMapper;
import com.slwh.emr.model.Level;
import com.slwh.emr.service.LevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LevelServiceimpl implements LevelService {
    @Resource
    private LevelMapper levelMapper;
    @Override
    public Level selectById(Integer lId) {
        return levelMapper.selectById(lId);
    }

    @Override
    public Level selectAll() {
        return levelMapper.selectAll();
    }
}
