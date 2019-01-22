package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.MenuMapper;
import com.slwh.emr.model.Doctor;
import com.slwh.emr.model.Menu;
import com.slwh.emr.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MenuServiceimpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public Menu selectById(Integer mId) {
        return menuMapper.selectById(mId);
    }

    @Override
    public int insert(Menu menu) {
        return menuMapper.insert(menu);
    }

    @Override
    public int update(Menu menu) {
        return menuMapper.updateById(menu);
    }

    @Override
    public int delete(Integer mId) {
        return menuMapper.deleteById(mId);
    }
}
