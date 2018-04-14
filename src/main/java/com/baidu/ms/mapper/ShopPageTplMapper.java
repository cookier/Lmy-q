package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopPageTpl;
import com.baidu.ms.pojo.ShopPageTplExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopPageTplMapper {
    long countByExample(ShopPageTplExample example);

    int deleteByExample(ShopPageTplExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopPageTpl record);

    int insertSelective(ShopPageTpl record);

    List<ShopPageTpl> selectByExampleWithBLOBs(ShopPageTplExample example);

    List<ShopPageTpl> selectByExample(ShopPageTplExample example);

    ShopPageTpl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopPageTpl record, @Param("example") ShopPageTplExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopPageTpl record, @Param("example") ShopPageTplExample example);

    int updateByExample(@Param("record") ShopPageTpl record, @Param("example") ShopPageTplExample example);

    int updateByPrimaryKeySelective(ShopPageTpl record);

    int updateByPrimaryKeyWithBLOBs(ShopPageTpl record);

    int updateByPrimaryKey(ShopPageTpl record);
}