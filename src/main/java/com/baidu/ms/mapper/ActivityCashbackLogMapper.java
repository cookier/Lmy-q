package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityCashbackLog;
import com.baidu.ms.pojo.ActivityCashbackLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityCashbackLogMapper {
    long countByExample(ActivityCashbackLogExample example);

    int deleteByExample(ActivityCashbackLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityCashbackLog record);

    int insertSelective(ActivityCashbackLog record);

    List<ActivityCashbackLog> selectByExample(ActivityCashbackLogExample example);

    ActivityCashbackLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityCashbackLog record, @Param("example") ActivityCashbackLogExample example);

    int updateByExample(@Param("record") ActivityCashbackLog record, @Param("example") ActivityCashbackLogExample example);

    int updateByPrimaryKeySelective(ActivityCashbackLog record);

    int updateByPrimaryKey(ActivityCashbackLog record);
}