package com.baidu.ms.job;

import com.baidu.ms.pojo.TaskJob;
import com.baidu.ms.service.TaskJobService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.quartz.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/3/21.
 */
public class TaskExecuteJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap map = jobExecutionContext.getTrigger().getJobDataMap();
        String key = jobExecutionContext.getJobDetail().getKey().toString();
        key = key.substring(key.indexOf(".") + 1, key.length());
        String str = (String) map.get(key);
        SchedulerContext schedulerContext = (SchedulerContext) map.get(key + "|schedulerContext");
        TaskJobService taskJobService = (TaskJobService) schedulerContext.get("taskJobServiceImpl");

        try {
            List<Object> valueList = new ArrayList<>();
            List<Class> typeList = new ArrayList<>();
            Object[] values = null;
            Class[] types = null;

            JSONObject jo = JSONObject.fromObject(str);
            String className = jo.getString("className");
            String methodName = jo.getString("methodName");
            String field = jo.getString("field");
            String jobId = jo.getString("jobId");
            // 通过field得到所有调用方法所需的参数，并将它们组装到values和types中
            JSONArray fields = JSONArray.fromObject(field);

            fill("int", jo.getString("id"), typeList, valueList);

            for (int i = 0; i < fields.size(); i++) {
                JSONObject jsonObject = fields.getJSONObject(i);
                Object[] keys = jsonObject.keySet().toArray();
                JSONArray typeAndValue = jsonObject.getJSONArray(keys[0].toString());
                String type = typeAndValue.getString(0);
                String value = typeAndValue.getString(1);
                fill(type, value, typeList, valueList);
            }

            if (!typeList.isEmpty() && !valueList.isEmpty()) {
                values = valueList.toArray(new Object[valueList.size()]);
                types = typeList.toArray(new Class[typeList.size()]);
            }

            //更新任务本次执行时间
            TaskJob taskJob = taskJobService.selectByJobId(jobId);
            taskJob.setLastExecuteTime(new Date());
            taskJobService.updateJob(taskJob);

            //通过反射调用任务对应的执行方法
            Object object = schedulerContext.get(className);
            Class clazz = object.getClass();
            System.out.println("cccccccccccccccccccccccc");
            Method[] arr = clazz.getMethods();
            List<Method> list = Arrays.asList(arr);
            Method m = clazz.getDeclaredMethod(methodName);
            System.out.println(m + "||||||||||||||||||||||||||||||");
            m.setAccessible(true);
            System.out.println(object.hashCode());
            m.invoke(object);
            System.out.println("cccccccccccccccccccccccc");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fill(String type, String value, List<Class> typeList, List<Object> valueList) {
        if (type.equalsIgnoreCase("boolean")) {
            typeList.add(Boolean.class);
            valueList.add(Boolean.valueOf(value));
        } else if (type.equalsIgnoreCase("byte")) {
            typeList.add(Byte.class);
            valueList.add(Byte.valueOf(value));
        } else if (type.equalsIgnoreCase("short")) {
            typeList.add(Short.class);
            valueList.add(Short.valueOf(value));
        } else if (type.equalsIgnoreCase("int")) {
            typeList.add(Integer.class);
            valueList.add(Integer.valueOf(value));
        } else if (type.equalsIgnoreCase("float")) {
            typeList.add(Float.class);
            valueList.add(Float.valueOf(value));
        } else if (type.equalsIgnoreCase("long")) {
            typeList.add(Long.class);
            valueList.add(Long.valueOf(value));
        } else if (type.equalsIgnoreCase("double")) {
            typeList.add(Double.class);
            valueList.add(Double.valueOf(value));
        } else if (type.equalsIgnoreCase("string")) {
            typeList.add(String.class);
            valueList.add(value);
        }
    }

}
