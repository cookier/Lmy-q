package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsTagsRef;
import com.baidu.ms.pojo.GoodsTagsRefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsTagsRefMapper {
    long countByExample(GoodsTagsRefExample example);

    int deleteByExample(GoodsTagsRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsTagsRef record);

    int insertSelective(GoodsTagsRef record);

    List<GoodsTagsRef> selectByExample(GoodsTagsRefExample example);

    GoodsTagsRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsTagsRef record, @Param("example") GoodsTagsRefExample example);

    int updateByExample(@Param("record") GoodsTagsRef record, @Param("example") GoodsTagsRefExample example);

    int updateByPrimaryKeySelective(GoodsTagsRef record);

    int updateByPrimaryKey(GoodsTagsRef record);
}