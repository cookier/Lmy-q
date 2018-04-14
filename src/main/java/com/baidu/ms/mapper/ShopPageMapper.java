package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopPage;
import com.baidu.ms.pojo.ShopPageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopPageMapper {
    long countByExample(ShopPageExample example);

    int deleteByExample(ShopPageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopPage record);

    int insertSelective(ShopPage record);

    List<ShopPage> selectByExampleWithBLOBs(ShopPageExample example);

    List<ShopPage> selectByExample(ShopPageExample example);

    ShopPage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopPage record, @Param("example") ShopPageExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopPage record, @Param("example") ShopPageExample example);

    int updateByExample(@Param("record") ShopPage record, @Param("example") ShopPageExample example);

    int updateByPrimaryKeySelective(ShopPage record);

    int updateByPrimaryKeyWithBLOBs(ShopPage record);

    int updateByPrimaryKey(ShopPage record);
}