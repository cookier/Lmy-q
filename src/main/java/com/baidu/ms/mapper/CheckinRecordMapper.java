package com.baidu.ms.mapper;

import com.baidu.ms.pojo.CheckinRecord;
import com.baidu.ms.pojo.CheckinRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckinRecordMapper {
    long countByExample(CheckinRecordExample example);

    int deleteByExample(CheckinRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckinRecord record);

    int insertSelective(CheckinRecord record);

    List<CheckinRecord> selectByExampleWithBLOBs(CheckinRecordExample example);

    List<CheckinRecord> selectByExample(CheckinRecordExample example);

    CheckinRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckinRecord record, @Param("example") CheckinRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") CheckinRecord record, @Param("example") CheckinRecordExample example);

    int updateByExample(@Param("record") CheckinRecord record, @Param("example") CheckinRecordExample example);

    int updateByPrimaryKeySelective(CheckinRecord record);

    int updateByPrimaryKeyWithBLOBs(CheckinRecord record);

    int updateByPrimaryKey(CheckinRecord record);
}