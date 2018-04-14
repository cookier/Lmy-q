package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopMemberCardLog;
import com.baidu.ms.pojo.ShopMemberCardLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMemberCardLogMapper {
    long countByExample(ShopMemberCardLogExample example);

    int deleteByExample(ShopMemberCardLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopMemberCardLog record);

    int insertSelective(ShopMemberCardLog record);

    List<ShopMemberCardLog> selectByExample(ShopMemberCardLogExample example);

    ShopMemberCardLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopMemberCardLog record, @Param("example") ShopMemberCardLogExample example);

    int updateByExample(@Param("record") ShopMemberCardLog record, @Param("example") ShopMemberCardLogExample example);

    int updateByPrimaryKeySelective(ShopMemberCardLog record);

    int updateByPrimaryKey(ShopMemberCardLog record);
}