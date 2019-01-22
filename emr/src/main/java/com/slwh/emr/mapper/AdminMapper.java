package com.slwh.emr.mapper;

import com.slwh.emr.model.Admin;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    int deleteById(Integer aId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectById(Integer aId);

    int updateByIdSelective(Admin record);

    int updateById(Admin record);

    Admin login(@Param("aName") String aName, @Param("aPassword") String aPassword);

}