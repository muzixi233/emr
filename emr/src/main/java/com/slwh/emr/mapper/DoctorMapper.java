package com.slwh.emr.mapper;

import com.slwh.emr.model.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DoctorMapper {
    int deleteById(Integer dId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectById(Integer dId);

    Doctor selectByName(@Param("dName") String dName);

    int updateByPIdSelective(Doctor record);

    int updateById(Doctor record);

    Doctor login(@Param("dNum") String dNum, @Param("dPassword") String dPassword);

    List<Doctor> selectAll();
}