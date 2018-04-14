package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityRecommendLog;
import com.baidu.ms.pojo.ActivityRecommendLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityRecommendLogMapper {
    long countByExample(ActivityRecommendLogExample example);

    int deleteByExample(ActivityRecommendLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityRecommendLog record);

    int insertSelective(ActivityRecommendLog record);

    List<ActivityRecommendLog> selectByExample(ActivityRecommendLogExample example);

    ActivityRecommendLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityRecommendLog record, @Param("example") ActivityRecommendLogExample example);

    int updateByExample(@Param("record") ActivityRecommendLog record, @Param("example") ActivityRecommendLogExample example);

    int updateByPrimaryKeySelective(ActivityRecommendLog record);

    int updateByPrimaryKey(ActivityRecommendLog record);
}