package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityLuckyTurntableLog;
import com.baidu.ms.pojo.ActivityLuckyTurntableLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityLuckyTurntableLogMapper {
    long countByExample(ActivityLuckyTurntableLogExample example);

    int deleteByExample(ActivityLuckyTurntableLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityLuckyTurntableLog record);

    int insertSelective(ActivityLuckyTurntableLog record);

    List<ActivityLuckyTurntableLog> selectByExample(ActivityLuckyTurntableLogExample example);

    ActivityLuckyTurntableLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityLuckyTurntableLog record, @Param("example") ActivityLuckyTurntableLogExample example);

    int updateByExample(@Param("record") ActivityLuckyTurntableLog record, @Param("example") ActivityLuckyTurntableLogExample example);

    int updateByPrimaryKeySelective(ActivityLuckyTurntableLog record);

    int updateByPrimaryKey(ActivityLuckyTurntableLog record);
}