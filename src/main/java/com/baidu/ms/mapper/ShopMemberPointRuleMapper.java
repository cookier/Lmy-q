package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopMemberPointRule;
import com.baidu.ms.pojo.ShopMemberPointRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMemberPointRuleMapper {
    long countByExample(ShopMemberPointRuleExample example);

    int deleteByExample(ShopMemberPointRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopMemberPointRule record);

    int insertSelective(ShopMemberPointRule record);

    List<ShopMemberPointRule> selectByExample(ShopMemberPointRuleExample example);

    ShopMemberPointRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopMemberPointRule record, @Param("example") ShopMemberPointRuleExample example);

    int updateByExample(@Param("record") ShopMemberPointRule record, @Param("example") ShopMemberPointRuleExample example);

    int updateByPrimaryKeySelective(ShopMemberPointRule record);

    int updateByPrimaryKey(ShopMemberPointRule record);
}