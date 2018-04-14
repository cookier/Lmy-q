package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityParticipationBlanklist;
import com.baidu.ms.pojo.ActivityParticipationBlanklistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityParticipationBlanklistMapper {
    long countByExample(ActivityParticipationBlanklistExample example);

    int deleteByExample(ActivityParticipationBlanklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityParticipationBlanklist record);

    int insertSelective(ActivityParticipationBlanklist record);

    List<ActivityParticipationBlanklist> selectByExampleWithBLOBs(ActivityParticipationBlanklistExample example);

    List<ActivityParticipationBlanklist> selectByExample(ActivityParticipationBlanklistExample example);

    ActivityParticipationBlanklist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityParticipationBlanklist record, @Param("example") ActivityParticipationBlanklistExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityParticipationBlanklist record, @Param("example") ActivityParticipationBlanklistExample example);

    int updateByExample(@Param("record") ActivityParticipationBlanklist record, @Param("example") ActivityParticipationBlanklistExample example);

    int updateByPrimaryKeySelective(ActivityParticipationBlanklist record);

    int updateByPrimaryKeyWithBLOBs(ActivityParticipationBlanklist record);

    int updateByPrimaryKey(ActivityParticipationBlanklist record);
}