package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopMemberPointLog;
import com.baidu.ms.pojo.ShopMemberPointLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMemberPointLogMapper {
    long countByExample(ShopMemberPointLogExample example);

    int deleteByExample(ShopMemberPointLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopMemberPointLog record);

    int insertSelective(ShopMemberPointLog record);

    List<ShopMemberPointLog> selectByExample(ShopMemberPointLogExample example);

    ShopMemberPointLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopMemberPointLog record, @Param("example") ShopMemberPointLogExample example);

    int updateByExample(@Param("record") ShopMemberPointLog record, @Param("example") ShopMemberPointLogExample example);

    int updateByPrimaryKeySelective(ShopMemberPointLog record);

    int updateByPrimaryKey(ShopMemberPointLog record);
}