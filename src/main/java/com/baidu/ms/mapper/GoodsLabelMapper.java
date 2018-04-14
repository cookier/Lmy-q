package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsLabel;
import com.baidu.ms.pojo.GoodsLabelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsLabelMapper {
    long countByExample(GoodsLabelExample example);

    int deleteByExample(GoodsLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsLabel record);

    int insertSelective(GoodsLabel record);

    List<GoodsLabel> selectByExample(GoodsLabelExample example);

    GoodsLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsLabel record, @Param("example") GoodsLabelExample example);

    int updateByExample(@Param("record") GoodsLabel record, @Param("example") GoodsLabelExample example);

    int updateByPrimaryKeySelective(GoodsLabel record);

    int updateByPrimaryKey(GoodsLabel record);
}