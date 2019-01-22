package com.slwh.emr.service.impl;

import com.slwh.emr.mapper.UserMapper;
import com.slwh.emr.model.User;
import com.slwh.emr.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceimpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User selectById(Integer uId) {
        return userMapper.selectById(uId);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int delete(Integer uId) {
        return userMapper.deleteById(uId);
    }
}
