package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopNavigateMenu;
import com.baidu.ms.pojo.ShopNavigateMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopNavigateMenuMapper {
    long countByExample(ShopNavigateMenuExample example);

    int deleteByExample(ShopNavigateMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopNavigateMenu record);

    int insertSelective(ShopNavigateMenu record);

    List<ShopNavigateMenu> selectByExampleWithBLOBs(ShopNavigateMenuExample example);

    List<ShopNavigateMenu> selectByExample(ShopNavigateMenuExample example);

    ShopNavigateMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopNavigateMenu record, @Param("example") ShopNavigateMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopNavigateMenu record, @Param("example") ShopNavigateMenuExample example);

    int updateByExample(@Param("record") ShopNavigateMenu record, @Param("example") ShopNavigateMenuExample example);

    int updateByPrimaryKeySelective(ShopNavigateMenu record);

    int updateByPrimaryKeyWithBLOBs(ShopNavigateMenu record);

    int updateByPrimaryKey(ShopNavigateMenu record);
}