package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataGoodsCalcu;
import com.baidu.ms.pojo.DataGoodsCalcuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataGoodsCalcuMapper {
    long countByExample(DataGoodsCalcuExample example);

    int deleteByExample(DataGoodsCalcuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataGoodsCalcu record);

    int insertSelective(DataGoodsCalcu record);

    List<DataGoodsCalcu> selectByExample(DataGoodsCalcuExample example);

    DataGoodsCalcu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataGoodsCalcu record, @Param("example") DataGoodsCalcuExample example);

    int updateByExample(@Param("record") DataGoodsCalcu record, @Param("example") DataGoodsCalcuExample example);

    int updateByPrimaryKeySelective(DataGoodsCalcu record);

    int updateByPrimaryKey(DataGoodsCalcu record);
}