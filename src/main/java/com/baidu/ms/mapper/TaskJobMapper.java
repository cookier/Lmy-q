package com.baidu.ms.mapper;

import com.baidu.ms.pojo.TaskJob;
import com.baidu.ms.pojo.TaskJobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskJobMapper {
    long countByExample(TaskJobExample example);

    int deleteByExample(TaskJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskJob record);

    int insertSelective(TaskJob record);

    List<TaskJob> selectByExampleWithBLOBs(TaskJobExample example);

    List<TaskJob> selectByExample(TaskJobExample example);

    TaskJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskJob record, @Param("example") TaskJobExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskJob record, @Param("example") TaskJobExample example);

    int updateByExample(@Param("record") TaskJob record, @Param("example") TaskJobExample example);

    int updateByPrimaryKeySelective(TaskJob record);

    int updateByPrimaryKeyWithBLOBs(TaskJob record);

    int updateByPrimaryKey(TaskJob record);

    TaskJob selectByJobId(String jobId);

    List<TaskJob> getAllTaskJob();
}