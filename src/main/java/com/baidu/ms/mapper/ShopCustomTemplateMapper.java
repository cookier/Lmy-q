package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopCustomTemplate;
import com.baidu.ms.pojo.ShopCustomTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCustomTemplateMapper {
    long countByExample(ShopCustomTemplateExample example);

    int deleteByExample(ShopCustomTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopCustomTemplate record);

    int insertSelective(ShopCustomTemplate record);

    List<ShopCustomTemplate> selectByExampleWithBLOBs(ShopCustomTemplateExample example);

    List<ShopCustomTemplate> selectByExample(ShopCustomTemplateExample example);

    ShopCustomTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopCustomTemplate record, @Param("example") ShopCustomTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopCustomTemplate record, @Param("example") ShopCustomTemplateExample example);

    int updateByExample(@Param("record") ShopCustomTemplate record, @Param("example") ShopCustomTemplateExample example);

    int updateByPrimaryKeySelective(ShopCustomTemplate record);

    int updateByPrimaryKeyWithBLOBs(ShopCustomTemplate record);

    int updateByPrimaryKey(ShopCustomTemplate record);
}