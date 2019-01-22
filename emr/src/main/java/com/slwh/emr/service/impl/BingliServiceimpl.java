package com.slwh.emr.service.impl;


import com.slwh.emr.mapper.BingliMapper;
import com.slwh.emr.model.Bingli;
import com.slwh.emr.service.BingliService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BingliServiceimpl implements BingliService {

    @Resource
    private BingliMapper bingliMapper;
    @Override
    public Bingli selectById(Integer id) {
        return bingliMapper.selectById(id);
    }

    @Override
    public List<Bingli> selectAll() {
        return bingliMapper.selectAll();
    }

    @Override
    public int insert(Bingli bingli) {
        return bingliMapper.insert(bingli);
    }

    @Override
    public int update(Bingli bingli) {
        return bingliMapper.updateById(bingli);
    }

    @Override
    public int delete(Integer bId) {
        return bingliMapper.deleteById(bId);
    }
}
