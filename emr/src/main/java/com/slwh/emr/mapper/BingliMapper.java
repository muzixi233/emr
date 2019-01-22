package com.slwh.emr.mapper;

import com.slwh.emr.model.Bingli;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BingliMapper {
    int deleteById(Integer blId);

    int insert(Bingli record);

    int insertSelective(Bingli record);

    Bingli selectById(Integer blId);

    int updateByIdSelective(Bingli record);

    int updateById(Bingli record);

    List<Bingli> selectAll();
}