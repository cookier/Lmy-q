package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataFansIncreaseTrend;
import com.baidu.ms.pojo.DataFansIncreaseTrendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataFansIncreaseTrendMapper {
    long countByExample(DataFansIncreaseTrendExample example);

    int deleteByExample(DataFansIncreaseTrendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataFansIncreaseTrend record);

    int insertSelective(DataFansIncreaseTrend record);

    List<DataFansIncreaseTrend> selectByExample(DataFansIncreaseTrendExample example);

    DataFansIncreaseTrend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataFansIncreaseTrend record, @Param("example") DataFansIncreaseTrendExample example);

    int updateByExample(@Param("record") DataFansIncreaseTrend record, @Param("example") DataFansIncreaseTrendExample example);

    int updateByPrimaryKeySelective(DataFansIncreaseTrend record);

    int updateByPrimaryKey(DataFansIncreaseTrend record);
}