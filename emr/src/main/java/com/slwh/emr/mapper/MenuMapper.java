package com.slwh.emr.mapper;

import com.slwh.emr.model.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
    int deleteById(Integer mId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectById(Integer mId);

    int updateByIdSelective(Menu record);

    int updateById(Menu record);
}