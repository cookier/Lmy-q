package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsReferences;
import com.baidu.ms.pojo.GoodsReferencesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsReferencesMapper {
    long countByExample(GoodsReferencesExample example);

    int deleteByExample(GoodsReferencesExample example);

    int insert(GoodsReferences record);

    int insertSelective(GoodsReferences record);

    List<GoodsReferences> selectByExample(GoodsReferencesExample example);

    int updateByExampleSelective(@Param("record") GoodsReferences record, @Param("example") GoodsReferencesExample example);

    int updateByExample(@Param("record") GoodsReferences record, @Param("example") GoodsReferencesExample example);
}