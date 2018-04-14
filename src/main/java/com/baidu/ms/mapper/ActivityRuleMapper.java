package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityRule;
import com.baidu.ms.pojo.ActivityRuleExample;
import com.baidu.ms.pojo.ActivityRuleWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityRuleMapper {
    long countByExample(ActivityRuleExample example);

    int deleteByExample(ActivityRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityRuleWithBLOBs record);

    int insertSelective(ActivityRuleWithBLOBs record);

    List<ActivityRuleWithBLOBs> selectByExampleWithBLOBs(ActivityRuleExample example);

    List<ActivityRule> selectByExample(ActivityRuleExample example);

    ActivityRuleWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityRuleWithBLOBs record, @Param("example") ActivityRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityRuleWithBLOBs record, @Param("example") ActivityRuleExample example);

    int updateByExample(@Param("record") ActivityRule record, @Param("example") ActivityRuleExample example);

    int updateByPrimaryKeySelective(ActivityRuleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityRuleWithBLOBs record);

    int updateByPrimaryKey(ActivityRule record);
}