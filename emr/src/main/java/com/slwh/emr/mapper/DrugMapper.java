package com.slwh.emr.mapper;

import com.slwh.emr.model.Drug;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DrugMapper {
    int deleteById(Integer drId);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectById(Integer drId);

    int updateByIdSelective(Drug record);

    int updateById(Drug record);

    Drug selectByNum(@Param("dNum") String dNum);
}