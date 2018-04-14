package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopCustomTemplateLog;
import com.baidu.ms.pojo.ShopCustomTemplateLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCustomTemplateLogMapper {
    long countByExample(ShopCustomTemplateLogExample example);

    int deleteByExample(ShopCustomTemplateLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopCustomTemplateLog record);

    int insertSelective(ShopCustomTemplateLog record);

    List<ShopCustomTemplateLog> selectByExample(ShopCustomTemplateLogExample example);

    ShopCustomTemplateLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopCustomTemplateLog record, @Param("example") ShopCustomTemplateLogExample example);

    int updateByExample(@Param("record") ShopCustomTemplateLog record, @Param("example") ShopCustomTemplateLogExample example);

    int updateByPrimaryKeySelective(ShopCustomTemplateLog record);

    int updateByPrimaryKey(ShopCustomTemplateLog record);
}