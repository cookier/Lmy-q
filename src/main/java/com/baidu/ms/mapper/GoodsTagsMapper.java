package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsTags;
import com.baidu.ms.pojo.GoodsTagsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsTagsMapper {
    long countByExample(GoodsTagsExample example);

    int deleteByExample(GoodsTagsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsTags record);

    int insertSelective(GoodsTags record);

    List<GoodsTags> selectByExampleWithBLOBs(GoodsTagsExample example);

    List<GoodsTags> selectByExample(GoodsTagsExample example);

    GoodsTags selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsTags record, @Param("example") GoodsTagsExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsTags record, @Param("example") GoodsTagsExample example);

    int updateByExample(@Param("record") GoodsTags record, @Param("example") GoodsTagsExample example);

    int updateByPrimaryKeySelective(GoodsTags record);

    int updateByPrimaryKeyWithBLOBs(GoodsTags record);

    int updateByPrimaryKey(GoodsTags record);
}