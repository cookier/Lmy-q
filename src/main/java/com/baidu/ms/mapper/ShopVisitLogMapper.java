package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopVisitLog;
import com.baidu.ms.pojo.ShopVisitLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopVisitLogMapper {
    long countByExample(ShopVisitLogExample example);

    int deleteByExample(ShopVisitLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopVisitLog record);

    int insertSelective(ShopVisitLog record);

    List<ShopVisitLog> selectByExample(ShopVisitLogExample example);

    ShopVisitLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopVisitLog record, @Param("example") ShopVisitLogExample example);

    int updateByExample(@Param("record") ShopVisitLog record, @Param("example") ShopVisitLogExample example);

    int updateByPrimaryKeySelective(ShopVisitLog record);

    int updateByPrimaryKey(ShopVisitLog record);
}