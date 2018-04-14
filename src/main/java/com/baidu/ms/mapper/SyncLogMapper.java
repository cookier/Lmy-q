package com.baidu.ms.mapper;

import com.baidu.ms.pojo.SyncLog;
import com.baidu.ms.pojo.SyncLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyncLogMapper {
    long countByExample(SyncLogExample example);

    int deleteByExample(SyncLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyncLog record);

    int insertSelective(SyncLog record);

    List<SyncLog> selectByExampleWithBLOBs(SyncLogExample example);

    List<SyncLog> selectByExample(SyncLogExample example);

    SyncLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyncLog record, @Param("example") SyncLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SyncLog record, @Param("example") SyncLogExample example);

    int updateByExample(@Param("record") SyncLog record, @Param("example") SyncLogExample example);

    int updateByPrimaryKeySelective(SyncLog record);

    int updateByPrimaryKeyWithBLOBs(SyncLog record);

    int updateByPrimaryKey(SyncLog record);
}