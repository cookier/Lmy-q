package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Spec;
import com.baidu.ms.pojo.SpecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecMapper {
    long countByExample(SpecExample example);

    int deleteByExample(SpecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Spec record);

    int insertSelective(Spec record);

    List<Spec> selectByExample(SpecExample example);

    Spec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Spec record, @Param("example") SpecExample example);

    int updateByExample(@Param("record") Spec record, @Param("example") SpecExample example);

    int updateByPrimaryKeySelective(Spec record);

    int updateByPrimaryKey(Spec record);
}