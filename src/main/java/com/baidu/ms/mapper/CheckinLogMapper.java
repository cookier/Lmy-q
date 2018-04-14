package com.baidu.ms.mapper;

import com.baidu.ms.pojo.CheckinLog;
import com.baidu.ms.pojo.CheckinLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckinLogMapper {
    long countByExample(CheckinLogExample example);

    int deleteByExample(CheckinLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckinLog record);

    int insertSelective(CheckinLog record);

    List<CheckinLog> selectByExample(CheckinLogExample example);

    CheckinLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckinLog record, @Param("example") CheckinLogExample example);

    int updateByExample(@Param("record") CheckinLog record, @Param("example") CheckinLogExample example);

    int updateByPrimaryKeySelective(CheckinLog record);

    int updateByPrimaryKey(CheckinLog record);
}