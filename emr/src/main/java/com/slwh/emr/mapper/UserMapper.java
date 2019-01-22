package com.slwh.emr.mapper;

import com.slwh.emr.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteById(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer uId);

    int updateByIdSelective(User record);

    int updateById(User record);
}