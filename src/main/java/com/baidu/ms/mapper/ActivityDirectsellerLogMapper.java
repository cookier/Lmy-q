package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityDirectsellerLog;
import com.baidu.ms.pojo.ActivityDirectsellerLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityDirectsellerLogMapper {
    long countByExample(ActivityDirectsellerLogExample example);

    int deleteByExample(ActivityDirectsellerLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDirectsellerLog record);

    int insertSelective(ActivityDirectsellerLog record);

    List<ActivityDirectsellerLog> selectByExample(ActivityDirectsellerLogExample example);

    ActivityDirectsellerLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDirectsellerLog record, @Param("example") ActivityDirectsellerLogExample example);

    int updateByExample(@Param("record") ActivityDirectsellerLog record, @Param("example") ActivityDirectsellerLogExample example);

    int updateByPrimaryKeySelective(ActivityDirectsellerLog record);

    int updateByPrimaryKey(ActivityDirectsellerLog record);
}