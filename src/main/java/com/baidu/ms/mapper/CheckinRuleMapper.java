package com.baidu.ms.mapper;

import com.baidu.ms.pojo.CheckinRule;
import com.baidu.ms.pojo.CheckinRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckinRuleMapper {
    long countByExample(CheckinRuleExample example);

    int deleteByExample(CheckinRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckinRule record);

    int insertSelective(CheckinRule record);

    List<CheckinRule> selectByExample(CheckinRuleExample example);

    CheckinRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckinRule record, @Param("example") CheckinRuleExample example);

    int updateByExample(@Param("record") CheckinRule record, @Param("example") CheckinRuleExample example);

    int updateByPrimaryKeySelective(CheckinRule record);

    int updateByPrimaryKey(CheckinRule record);
}