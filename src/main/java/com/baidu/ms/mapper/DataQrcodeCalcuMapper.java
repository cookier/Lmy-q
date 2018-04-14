package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataQrcodeCalcu;
import com.baidu.ms.pojo.DataQrcodeCalcuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataQrcodeCalcuMapper {
    long countByExample(DataQrcodeCalcuExample example);

    int deleteByExample(DataQrcodeCalcuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataQrcodeCalcu record);

    int insertSelective(DataQrcodeCalcu record);

    List<DataQrcodeCalcu> selectByExample(DataQrcodeCalcuExample example);

    DataQrcodeCalcu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataQrcodeCalcu record, @Param("example") DataQrcodeCalcuExample example);

    int updateByExample(@Param("record") DataQrcodeCalcu record, @Param("example") DataQrcodeCalcuExample example);

    int updateByPrimaryKeySelective(DataQrcodeCalcu record);

    int updateByPrimaryKey(DataQrcodeCalcu record);
}