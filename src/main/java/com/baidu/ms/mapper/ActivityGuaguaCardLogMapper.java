package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityGuaguaCardLog;
import com.baidu.ms.pojo.ActivityGuaguaCardLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityGuaguaCardLogMapper {
    long countByExample(ActivityGuaguaCardLogExample example);

    int deleteByExample(ActivityGuaguaCardLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityGuaguaCardLog record);

    int insertSelective(ActivityGuaguaCardLog record);

    List<ActivityGuaguaCardLog> selectByExample(ActivityGuaguaCardLogExample example);

    ActivityGuaguaCardLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityGuaguaCardLog record, @Param("example") ActivityGuaguaCardLogExample example);

    int updateByExample(@Param("record") ActivityGuaguaCardLog record, @Param("example") ActivityGuaguaCardLogExample example);

    int updateByPrimaryKeySelective(ActivityGuaguaCardLog record);

    int updateByPrimaryKey(ActivityGuaguaCardLog record);
}