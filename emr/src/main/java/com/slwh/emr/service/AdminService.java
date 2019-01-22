package com.slwh.emr.service;

import com.slwh.emr.model.Admin;


public interface AdminService {
    Admin login(String aName, String aPassword);
    int sign(Admin admin);

    int update(Admin admin);
     int delete(Integer aId);
}
