package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataOrderCalcu;
import com.baidu.ms.pojo.DataOrderCalcuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataOrderCalcuMapper {
    long countByExample(DataOrderCalcuExample example);

    int deleteByExample(DataOrderCalcuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataOrderCalcu record);

    int insertSelective(DataOrderCalcu record);

    List<DataOrderCalcu> selectByExample(DataOrderCalcuExample example);

    DataOrderCalcu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataOrderCalcu record, @Param("example") DataOrderCalcuExample example);

    int updateByExample(@Param("record") DataOrderCalcu record, @Param("example") DataOrderCalcuExample example);

    int updateByPrimaryKeySelective(DataOrderCalcu record);

    int updateByPrimaryKey(DataOrderCalcu record);
}