package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopPageCategory;
import com.baidu.ms.pojo.ShopPageCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopPageCategoryMapper {
    long countByExample(ShopPageCategoryExample example);

    int deleteByExample(ShopPageCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopPageCategory record);

    int insertSelective(ShopPageCategory record);

    List<ShopPageCategory> selectByExampleWithBLOBs(ShopPageCategoryExample example);

    List<ShopPageCategory> selectByExample(ShopPageCategoryExample example);

    ShopPageCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopPageCategory record, @Param("example") ShopPageCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopPageCategory record, @Param("example") ShopPageCategoryExample example);

    int updateByExample(@Param("record") ShopPageCategory record, @Param("example") ShopPageCategoryExample example);

    int updateByPrimaryKeySelective(ShopPageCategory record);

    int updateByPrimaryKeyWithBLOBs(ShopPageCategory record);

    int updateByPrimaryKey(ShopPageCategory record);
}