package com.baidu.ms.mapper;

import com.baidu.ms.pojo.RankingHistoryLog;
import com.baidu.ms.pojo.RankingHistoryLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RankingHistoryLogMapper {
    long countByExample(RankingHistoryLogExample example);

    int deleteByExample(RankingHistoryLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankingHistoryLog record);

    int insertSelective(RankingHistoryLog record);

    List<RankingHistoryLog> selectByExampleWithBLOBs(RankingHistoryLogExample example);

    List<RankingHistoryLog> selectByExample(RankingHistoryLogExample example);

    RankingHistoryLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankingHistoryLog record, @Param("example") RankingHistoryLogExample example);

    int updateByExampleWithBLOBs(@Param("record") RankingHistoryLog record, @Param("example") RankingHistoryLogExample example);

    int updateByExample(@Param("record") RankingHistoryLog record, @Param("example") RankingHistoryLogExample example);

    int updateByPrimaryKeySelective(RankingHistoryLog record);

    int updateByPrimaryKeyWithBLOBs(RankingHistoryLog record);

    int updateByPrimaryKey(RankingHistoryLog record);
}