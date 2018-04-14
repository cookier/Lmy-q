package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityParticipator;
import com.baidu.ms.pojo.ActivityParticipatorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityParticipatorMapper {
    long countByExample(ActivityParticipatorExample example);

    int deleteByExample(ActivityParticipatorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityParticipator record);

    int insertSelective(ActivityParticipator record);

    List<ActivityParticipator> selectByExampleWithBLOBs(ActivityParticipatorExample example);

    List<ActivityParticipator> selectByExample(ActivityParticipatorExample example);

    ActivityParticipator selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityParticipator record, @Param("example") ActivityParticipatorExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityParticipator record, @Param("example") ActivityParticipatorExample example);

    int updateByExample(@Param("record") ActivityParticipator record, @Param("example") ActivityParticipatorExample example);

    int updateByPrimaryKeySelective(ActivityParticipator record);

    int updateByPrimaryKeyWithBLOBs(ActivityParticipator record);

    int updateByPrimaryKey(ActivityParticipator record);
}