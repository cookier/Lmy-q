package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataVisitLocal;
import com.baidu.ms.pojo.DataVisitLocalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataVisitLocalMapper {
    long countByExample(DataVisitLocalExample example);

    int deleteByExample(DataVisitLocalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataVisitLocal record);

    int insertSelective(DataVisitLocal record);

    List<DataVisitLocal> selectByExample(DataVisitLocalExample example);

    DataVisitLocal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataVisitLocal record, @Param("example") DataVisitLocalExample example);

    int updateByExample(@Param("record") DataVisitLocal record, @Param("example") DataVisitLocalExample example);

    int updateByPrimaryKeySelective(DataVisitLocal record);

    int updateByPrimaryKey(DataVisitLocal record);
}