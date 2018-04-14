package com.baidu.ms.service;

import com.baidu.ms.mapper.TaskJobMapper;
import com.baidu.ms.pojo.TaskJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
@Service
public class TaskJobServiceImpl implements TaskJobService {
    @Autowired(required = false)
    private TaskJobMapper taskJobMapper;

    @Override
    public List<TaskJob> getAllTaskJob() throws Exception {
        return taskJobMapper.getAllTaskJob();
    }

    @Override
    public boolean updateJob(TaskJob taskJob) throws Exception {
        return false;
    }

    @Override
    public TaskJob selectByPrimaryKey(Integer id) throws Exception {
        return taskJobMapper.selectByPrimaryKey(id);
    }

    @Override
    public TaskJob selectByJobId(String jobId) throws Exception {
        return taskJobMapper.selectByJobId(jobId);
    }


}
