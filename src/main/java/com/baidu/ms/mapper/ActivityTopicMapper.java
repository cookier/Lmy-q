package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityTopic;
import com.baidu.ms.pojo.ActivityTopicExample;
import com.baidu.ms.pojo.ActivityTopicWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityTopicMapper {
    long countByExample(ActivityTopicExample example);

    int deleteByExample(ActivityTopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityTopicWithBLOBs record);

    int insertSelective(ActivityTopicWithBLOBs record);

    List<ActivityTopicWithBLOBs> selectByExampleWithBLOBs(ActivityTopicExample example);

    List<ActivityTopic> selectByExample(ActivityTopicExample example);

    ActivityTopicWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityTopicWithBLOBs record, @Param("example") ActivityTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityTopicWithBLOBs record, @Param("example") ActivityTopicExample example);

    int updateByExample(@Param("record") ActivityTopic record, @Param("example") ActivityTopicExample example);

    int updateByPrimaryKeySelective(ActivityTopicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityTopicWithBLOBs record);

    int updateByPrimaryKey(ActivityTopic record);
}