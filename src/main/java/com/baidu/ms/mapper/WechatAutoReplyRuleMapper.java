package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatAutoReplyRule;
import com.baidu.ms.pojo.WechatAutoReplyRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatAutoReplyRuleMapper {
    long countByExample(WechatAutoReplyRuleExample example);

    int deleteByExample(WechatAutoReplyRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(WechatAutoReplyRule record);

    int insertSelective(WechatAutoReplyRule record);

    List<WechatAutoReplyRule> selectByExampleWithBLOBs(WechatAutoReplyRuleExample example);

    List<WechatAutoReplyRule> selectByExample(WechatAutoReplyRuleExample example);

    WechatAutoReplyRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") WechatAutoReplyRule record, @Param("example") WechatAutoReplyRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatAutoReplyRule record, @Param("example") WechatAutoReplyRuleExample example);

    int updateByExample(@Param("record") WechatAutoReplyRule record, @Param("example") WechatAutoReplyRuleExample example);

    int updateByPrimaryKeySelective(WechatAutoReplyRule record);

    int updateByPrimaryKeyWithBLOBs(WechatAutoReplyRule record);

    int updateByPrimaryKey(WechatAutoReplyRule record);
}