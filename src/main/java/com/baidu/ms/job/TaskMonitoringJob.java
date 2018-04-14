package com.baidu.ms.job;

import com.baidu.ms.pojo.TaskJob;
import com.baidu.ms.service.TaskJobService;
import com.baidu.ms.util.JsonKit;
import net.sf.json.JSONObject;
import org.quartz.*;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */

public class TaskMonitoringJob extends QuartzJobBean {
    public Scheduler scheduler = null;

    private TaskJobService taskJobService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            scheduler = jobExecutionContext.getScheduler();
            SchedulerContext schedulerContext = jobExecutionContext.getScheduler().getContext();
            taskJobService = (TaskJobService) schedulerContext.get("taskJobServiceImpl");
            List<TaskJob> list = taskJobService.getAllTaskJob();

            if (list != null) {
                System.out.println(list);
                for (TaskJob taskJob : list) {
                    TriggerKey triggerKey = TriggerKey.triggerKey(taskJob.getJobId(), taskJob.getJobGroup());
                    CronTriggerImpl trigger = (CronTriggerImpl) scheduler.getTrigger(triggerKey);

                    if (trigger == null) {  //这个定时任务不存在
                        if (taskJob.getStatus() == 1) {
                            addJob(taskJob, schedulerContext);
                        }
                    } else {
                        if (taskJob.getStatus() == 1) {
                            boolean flag = false;
                            JobDataMap map = trigger.getJobDataMap();
                            String key = trigger.getKey().toString();
                            key = key.substring(key.indexOf(".") + 1, key.length());
                            String str = (String) map.get(key);
                            JSONObject jo = JSONObject.fromObject(str);
                            System.out.println(jo.toString());
                            String className = jo.getString("className");
                            String methodName = jo.getString("methodName");
                            String cron = jo.getString("cron");

                            if (!className.equals(taskJob.getClassName())) {
                                flag = true;
                            }
                            if (!methodName.equals(taskJob.getMethodName())) {
                                flag = true;
                            }
                            if (!cron.equals(taskJob.getCron())) {
                                flag = true;
                                trigger.setCronExpression(taskJob.getCron());
                            }

                            if (flag) {
                                this.removeJob(triggerKey);
                                addJob(taskJob, schedulerContext);
                            }

                            Date lastExecuteTime = taskJob.getLastExecuteTime();// 上次执行时间
                            Date taskEndTime = taskJob.getTaskEndTime();// 任务执行结束时间
                            Date now = new Date();
                            if (lastExecuteTime != null && now.after(lastExecuteTime) && taskEndTime != null && now.after(taskEndTime)) {
                                this.removeJob(triggerKey);

                                // 更新任务状态
                                taskJob.setStatus(3);
                                taskJobService.updateJob(taskJob);
                            }
                        } else if (taskJob.getStatus() == 3 || taskJob.getStatus() == 4) {// 移除结束和无效的统计任务
                            if (("NORMAL").equals(scheduler.getTriggerState(triggerKey).name())) {
                                this.removeJob(triggerKey);
                            }
                        } else if (taskJob.getStatus() == 2) {
                            this.pauseJob(triggerKey);
                        }

                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addJob(TaskJob taskJob, SchedulerContext schedulerContext) throws Exception {
        String jobId = taskJob.getJobId();
        String jobCronExp = taskJob.getCron();
        String jobGroup = taskJob.getJobGroup();
        Class<? extends Job> jobClass = null;
        jobClass = (Class<? extends Job>) Class.forName("com.baidu.ms.job.TaskExecuteJob");

        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put(jobId, JsonKit.beanToJsonStr(taskJob));
        jobDataMap.put(jobId + "|schedulerContext", schedulerContext);
        JobDetail job = JobBuilder.newJob(jobClass).withIdentity(jobId, jobGroup).usingJobData(jobDataMap).build();
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(jobId, jobGroup).usingJobData(jobDataMap).withSchedule(CronScheduleBuilder.cronSchedule(jobCronExp)).build();
        scheduler.scheduleJob(job, trigger);
    }

    private void removeJob(TriggerKey tk) throws Exception {
        scheduler.pauseTrigger(tk);// 停止触发器
        scheduler.unscheduleJob(tk);// 移除触发器
        scheduler.deleteJob(new JobKey(tk.getName()));// 删除任务
    }

    private void pauseJob(TriggerKey tk) throws Exception {
        scheduler.pauseTrigger(tk);// 暂停
    }

}
