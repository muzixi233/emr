package com.slwh.emr.mapper;

import com.slwh.emr.model.Hospital;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HospitalMapper {
    int deleteById(Integer hId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectById(Integer hId);

    int updateByIdSelective(Hospital record);

    int updateById(Hospital record);
}