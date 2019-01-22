package com.slwh.emr.mapper;

import com.slwh.emr.model.Doctorlv;

public interface DoctorlvMapper {
    int deleteByPrimaryKey(Integer dlid);

    int insert(Doctorlv record);

    int insertSelective(Doctorlv record);

    Doctorlv selectByPrimaryKey(Integer dlid);

    int updateByPrimaryKeySelective(Doctorlv record);

    int updateByPrimaryKey(Doctorlv record);
}