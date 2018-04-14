package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataVisitSource;
import com.baidu.ms.pojo.DataVisitSourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataVisitSourceMapper {
    long countByExample(DataVisitSourceExample example);

    int deleteByExample(DataVisitSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataVisitSource record);

    int insertSelective(DataVisitSource record);

    List<DataVisitSource> selectByExample(DataVisitSourceExample example);

    DataVisitSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataVisitSource record, @Param("example") DataVisitSourceExample example);

    int updateByExample(@Param("record") DataVisitSource record, @Param("example") DataVisitSourceExample example);

    int updateByPrimaryKeySelective(DataVisitSource record);

    int updateByPrimaryKey(DataVisitSource record);
}