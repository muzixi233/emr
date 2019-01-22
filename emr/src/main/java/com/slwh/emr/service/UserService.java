package com.slwh.emr.service;

import com.slwh.emr.model.User;

public interface UserService {

    User selectById(Integer uId);

    int insert(User user);

    int update(User user);

    int delete(Integer uId);
}
