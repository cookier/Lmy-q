package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsRqcode;
import com.baidu.ms.pojo.GoodsRqcodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsRqcodeMapper {
    long countByExample(GoodsRqcodeExample example);

    int deleteByExample(GoodsRqcodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsRqcode record);

    int insertSelective(GoodsRqcode record);

    List<GoodsRqcode> selectByExample(GoodsRqcodeExample example);

    GoodsRqcode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsRqcode record, @Param("example") GoodsRqcodeExample example);

    int updateByExample(@Param("record") GoodsRqcode record, @Param("example") GoodsRqcodeExample example);

    int updateByPrimaryKeySelective(GoodsRqcode record);

    int updateByPrimaryKey(GoodsRqcode record);
}