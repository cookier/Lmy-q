package com.baidu.ms.mapper;

import com.baidu.ms.pojo.TaskLog;
import com.baidu.ms.pojo.TaskLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskLogMapper {
    long countByExample(TaskLogExample example);

    int deleteByExample(TaskLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskLog record);

    int insertSelective(TaskLog record);

    List<TaskLog> selectByExampleWithBLOBs(TaskLogExample example);

    List<TaskLog> selectByExample(TaskLogExample example);

    TaskLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskLog record, @Param("example") TaskLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskLog record, @Param("example") TaskLogExample example);

    int updateByExample(@Param("record") TaskLog record, @Param("example") TaskLogExample example);

    int updateByPrimaryKeySelective(TaskLog record);

    int updateByPrimaryKeyWithBLOBs(TaskLog record);

    int updateByPrimaryKey(TaskLog record);
}