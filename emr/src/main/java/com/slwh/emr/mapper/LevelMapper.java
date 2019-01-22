package com.slwh.emr.mapper;

import com.slwh.emr.model.Level;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LevelMapper {
    int deleteById(Integer lId);

    int insert(Level record);

    int insertSelective(Level record);

    Level selectById(Integer lId);

    int updateByIdSelective(Level record);

    int updateById(Level record);

    Level selectAll();
}