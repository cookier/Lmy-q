package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataFansVisitLocal;
import com.baidu.ms.pojo.DataFansVisitLocalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataFansVisitLocalMapper {
    long countByExample(DataFansVisitLocalExample example);

    int deleteByExample(DataFansVisitLocalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataFansVisitLocal record);

    int insertSelective(DataFansVisitLocal record);

    List<DataFansVisitLocal> selectByExample(DataFansVisitLocalExample example);

    DataFansVisitLocal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataFansVisitLocal record, @Param("example") DataFansVisitLocalExample example);

    int updateByExample(@Param("record") DataFansVisitLocal record, @Param("example") DataFansVisitLocalExample example);

    int updateByPrimaryKeySelective(DataFansVisitLocal record);

    int updateByPrimaryKey(DataFansVisitLocal record);
}