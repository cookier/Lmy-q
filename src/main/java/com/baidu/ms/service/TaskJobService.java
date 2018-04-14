package com.baidu.ms.service;

import com.baidu.ms.pojo.TaskJob;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface TaskJobService {
    public List<TaskJob> getAllTaskJob() throws Exception;

    public boolean updateJob(TaskJob taskJob) throws Exception;

    public TaskJob selectByPrimaryKey(Integer id) throws Exception;

    public TaskJob selectByJobId(String jobId) throws Exception;
}
