package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsSearchKeyWord;
import com.baidu.ms.pojo.GoodsSearchKeyWordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSearchKeyWordMapper {
    long countByExample(GoodsSearchKeyWordExample example);

    int deleteByExample(GoodsSearchKeyWordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSearchKeyWord record);

    int insertSelective(GoodsSearchKeyWord record);

    List<GoodsSearchKeyWord> selectByExample(GoodsSearchKeyWordExample example);

    GoodsSearchKeyWord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSearchKeyWord record, @Param("example") GoodsSearchKeyWordExample example);

    int updateByExample(@Param("record") GoodsSearchKeyWord record, @Param("example") GoodsSearchKeyWordExample example);

    int updateByPrimaryKeySelective(GoodsSearchKeyWord record);

    int updateByPrimaryKey(GoodsSearchKeyWord record);
}