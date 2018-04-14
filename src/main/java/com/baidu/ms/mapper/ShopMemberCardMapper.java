package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopMemberCard;
import com.baidu.ms.pojo.ShopMemberCardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMemberCardMapper {
    long countByExample(ShopMemberCardExample example);

    int deleteByExample(ShopMemberCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopMemberCard record);

    int insertSelective(ShopMemberCard record);

    List<ShopMemberCard> selectByExampleWithBLOBs(ShopMemberCardExample example);

    List<ShopMemberCard> selectByExample(ShopMemberCardExample example);

    ShopMemberCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopMemberCard record, @Param("example") ShopMemberCardExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopMemberCard record, @Param("example") ShopMemberCardExample example);

    int updateByExample(@Param("record") ShopMemberCard record, @Param("example") ShopMemberCardExample example);

    int updateByPrimaryKeySelective(ShopMemberCard record);

    int updateByPrimaryKeyWithBLOBs(ShopMemberCard record);

    int updateByPrimaryKey(ShopMemberCard record);
}