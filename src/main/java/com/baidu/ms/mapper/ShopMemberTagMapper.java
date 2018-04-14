package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopMemberTag;
import com.baidu.ms.pojo.ShopMemberTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMemberTagMapper {
    long countByExample(ShopMemberTagExample example);

    int deleteByExample(ShopMemberTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopMemberTag record);

    int insertSelective(ShopMemberTag record);

    List<ShopMemberTag> selectByExample(ShopMemberTagExample example);

    ShopMemberTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopMemberTag record, @Param("example") ShopMemberTagExample example);

    int updateByExample(@Param("record") ShopMemberTag record, @Param("example") ShopMemberTagExample example);

    int updateByPrimaryKeySelective(ShopMemberTag record);

    int updateByPrimaryKey(ShopMemberTag record);
}