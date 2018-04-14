package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Gift;
import com.baidu.ms.pojo.GiftExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftMapper {
    long countByExample(GiftExample example);

    int deleteByExample(GiftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gift record);

    int insertSelective(Gift record);

    List<Gift> selectByExampleWithBLOBs(GiftExample example);

    List<Gift> selectByExample(GiftExample example);

    Gift selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByExampleWithBLOBs(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByExample(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKeyWithBLOBs(Gift record);

    int updateByPrimaryKey(Gift record);
}