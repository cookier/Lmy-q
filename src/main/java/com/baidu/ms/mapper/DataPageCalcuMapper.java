package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataPageCalcu;
import com.baidu.ms.pojo.DataPageCalcuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataPageCalcuMapper {
    long countByExample(DataPageCalcuExample example);

    int deleteByExample(DataPageCalcuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataPageCalcu record);

    int insertSelective(DataPageCalcu record);

    List<DataPageCalcu> selectByExample(DataPageCalcuExample example);

    DataPageCalcu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataPageCalcu record, @Param("example") DataPageCalcuExample example);

    int updateByExample(@Param("record") DataPageCalcu record, @Param("example") DataPageCalcuExample example);

    int updateByPrimaryKeySelective(DataPageCalcu record);

    int updateByPrimaryKey(DataPageCalcu record);
}