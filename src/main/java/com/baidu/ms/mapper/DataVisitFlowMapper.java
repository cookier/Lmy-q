package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataVisitFlow;
import com.baidu.ms.pojo.DataVisitFlowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataVisitFlowMapper {
    long countByExample(DataVisitFlowExample example);

    int deleteByExample(DataVisitFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataVisitFlow record);

    int insertSelective(DataVisitFlow record);

    List<DataVisitFlow> selectByExample(DataVisitFlowExample example);

    DataVisitFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataVisitFlow record, @Param("example") DataVisitFlowExample example);

    int updateByExample(@Param("record") DataVisitFlow record, @Param("example") DataVisitFlowExample example);

    int updateByPrimaryKeySelective(DataVisitFlow record);

    int updateByPrimaryKey(DataVisitFlow record);
}