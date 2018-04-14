package com.baidu.ms.mapper;

import com.baidu.ms.pojo.SpecValue;
import com.baidu.ms.pojo.SpecValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecValueMapper {
    long countByExample(SpecValueExample example);

    int deleteByExample(SpecValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpecValue record);

    int insertSelective(SpecValue record);

    List<SpecValue> selectByExample(SpecValueExample example);

    SpecValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    int updateByExample(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    int updateByPrimaryKeySelective(SpecValue record);

    int updateByPrimaryKey(SpecValue record);
}