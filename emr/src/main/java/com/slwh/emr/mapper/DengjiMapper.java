package com.slwh.emr.mapper;

import com.slwh.emr.model.Dengji;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DengjiMapper {
    int deleteById(Integer djId);
/**rwrwr*/
    int insert(Dengji record);

    int insertSelective(Dengji record);

    Dengji selectById(Integer djId);

    int updateByIdSelective(Dengji record);

    int updateById(Dengji record);
}