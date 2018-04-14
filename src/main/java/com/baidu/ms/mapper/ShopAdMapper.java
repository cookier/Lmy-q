package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopAd;
import com.baidu.ms.pojo.ShopAdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopAdMapper {
    long countByExample(ShopAdExample example);

    int deleteByExample(ShopAdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopAd record);

    int insertSelective(ShopAd record);

    List<ShopAd> selectByExampleWithBLOBs(ShopAdExample example);

    List<ShopAd> selectByExample(ShopAdExample example);

    ShopAd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopAd record, @Param("example") ShopAdExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopAd record, @Param("example") ShopAdExample example);

    int updateByExample(@Param("record") ShopAd record, @Param("example") ShopAdExample example);

    int updateByPrimaryKeySelective(ShopAd record);

    int updateByPrimaryKeyWithBLOBs(ShopAd record);

    int updateByPrimaryKey(ShopAd record);
}