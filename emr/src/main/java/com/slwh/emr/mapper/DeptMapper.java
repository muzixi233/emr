package com.slwh.emr.mapper;

import com.slwh.emr.model.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
    int deleteById(Integer deId);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectById(Integer deId);

    int updateByIdSelective(Dept record);

    int updateById(Dept record);

}