package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopMember;
import com.baidu.ms.pojo.ShopMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMemberMapper {
    long countByExample(ShopMemberExample example);

    int deleteByExample(ShopMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopMember record);

    int insertSelective(ShopMember record);

    List<ShopMember> selectByExample(ShopMemberExample example);

    ShopMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopMember record, @Param("example") ShopMemberExample example);

    int updateByExample(@Param("record") ShopMember record, @Param("example") ShopMemberExample example);

    int updateByPrimaryKeySelective(ShopMember record);

    int updateByPrimaryKey(ShopMember record);
}