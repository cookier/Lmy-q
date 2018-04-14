package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GiftLog;
import com.baidu.ms.pojo.GiftLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftLogMapper {
    long countByExample(GiftLogExample example);

    int deleteByExample(GiftLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GiftLog record);

    int insertSelective(GiftLog record);

    List<GiftLog> selectByExample(GiftLogExample example);

    GiftLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GiftLog record, @Param("example") GiftLogExample example);

    int updateByExample(@Param("record") GiftLog record, @Param("example") GiftLogExample example);

    int updateByPrimaryKeySelective(GiftLog record);

    int updateByPrimaryKey(GiftLog record);
}