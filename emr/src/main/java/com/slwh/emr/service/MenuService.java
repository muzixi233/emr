package com.slwh.emr.service;

import com.slwh.emr.model.Menu;

public interface MenuService {
    Menu selectById(Integer mId);

    int insert(Menu menu);

    int update(Menu menu);

    int delete(Integer mId);
}
