package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsLabelRef;
import com.baidu.ms.pojo.GoodsLabelRefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsLabelRefMapper {
    long countByExample(GoodsLabelRefExample example);

    int deleteByExample(GoodsLabelRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsLabelRef record);

    int insertSelective(GoodsLabelRef record);

    List<GoodsLabelRef> selectByExample(GoodsLabelRefExample example);

    GoodsLabelRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsLabelRef record, @Param("example") GoodsLabelRefExample example);

    int updateByExample(@Param("record") GoodsLabelRef record, @Param("example") GoodsLabelRefExample example);

    int updateByPrimaryKeySelective(GoodsLabelRef record);

    int updateByPrimaryKey(GoodsLabelRef record);
}