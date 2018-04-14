package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Qualification;
import com.baidu.ms.pojo.QualificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QualificationMapper {
    long countByExample(QualificationExample example);

    int deleteByExample(QualificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Qualification record);

    int insertSelective(Qualification record);

    List<Qualification> selectByExampleWithBLOBs(QualificationExample example);

    List<Qualification> selectByExample(QualificationExample example);

    Qualification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByExampleWithBLOBs(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByExample(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByPrimaryKeySelective(Qualification record);

    int updateByPrimaryKeyWithBLOBs(Qualification record);

    int updateByPrimaryKey(Qualification record);
}