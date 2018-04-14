package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataVisitPagetype;
import com.baidu.ms.pojo.DataVisitPagetypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataVisitPagetypeMapper {
    long countByExample(DataVisitPagetypeExample example);

    int deleteByExample(DataVisitPagetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataVisitPagetype record);

    int insertSelective(DataVisitPagetype record);

    List<DataVisitPagetype> selectByExample(DataVisitPagetypeExample example);

    DataVisitPagetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataVisitPagetype record, @Param("example") DataVisitPagetypeExample example);

    int updateByExample(@Param("record") DataVisitPagetype record, @Param("example") DataVisitPagetypeExample example);

    int updateByPrimaryKeySelective(DataVisitPagetype record);

    int updateByPrimaryKey(DataVisitPagetype record);
}