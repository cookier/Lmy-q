package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataFansVisitDepth;
import com.baidu.ms.pojo.DataFansVisitDepthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataFansVisitDepthMapper {
    long countByExample(DataFansVisitDepthExample example);

    int deleteByExample(DataFansVisitDepthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataFansVisitDepth record);

    int insertSelective(DataFansVisitDepth record);

    List<DataFansVisitDepth> selectByExample(DataFansVisitDepthExample example);

    DataFansVisitDepth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataFansVisitDepth record, @Param("example") DataFansVisitDepthExample example);

    int updateByExample(@Param("record") DataFansVisitDepth record, @Param("example") DataFansVisitDepthExample example);

    int updateByPrimaryKeySelective(DataFansVisitDepth record);

    int updateByPrimaryKey(DataFansVisitDepth record);
}