package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataTrend;
import com.baidu.ms.pojo.DataTrendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataTrendMapper {
    long countByExample(DataTrendExample example);

    int deleteByExample(DataTrendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataTrend record);

    int insertSelective(DataTrend record);

    List<DataTrend> selectByExample(DataTrendExample example);

    DataTrend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataTrend record, @Param("example") DataTrendExample example);

    int updateByExample(@Param("record") DataTrend record, @Param("example") DataTrendExample example);

    int updateByPrimaryKeySelective(DataTrend record);

    int updateByPrimaryKey(DataTrend record);
}