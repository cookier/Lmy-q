package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityRewardsLog;
import com.baidu.ms.pojo.ActivityRewardsLogExample;
import com.baidu.ms.pojo.ActivityRewardsLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityRewardsLogMapper {
    long countByExample(ActivityRewardsLogExample example);

    int deleteByExample(ActivityRewardsLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityRewardsLogWithBLOBs record);

    int insertSelective(ActivityRewardsLogWithBLOBs record);

    List<ActivityRewardsLogWithBLOBs> selectByExampleWithBLOBs(ActivityRewardsLogExample example);

    List<ActivityRewardsLog> selectByExample(ActivityRewardsLogExample example);

    ActivityRewardsLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityRewardsLogWithBLOBs record, @Param("example") ActivityRewardsLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityRewardsLogWithBLOBs record, @Param("example") ActivityRewardsLogExample example);

    int updateByExample(@Param("record") ActivityRewardsLog record, @Param("example") ActivityRewardsLogExample example);

    int updateByPrimaryKeySelective(ActivityRewardsLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityRewardsLogWithBLOBs record);

    int updateByPrimaryKey(ActivityRewardsLog record);
}