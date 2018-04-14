package com.baidu.ms.service;

import com.baidu.ms.pojo.SystemConfig;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22.
 */
public interface SystemConfigService {
    public boolean createSystemConfig(SystemConfig systemConfig) throws Exception;

    public boolean updateSystemConfig(SystemConfig systemConfig) throws Exception;

    public boolean deleteSystemConfig(int id) throws Exception;

    public SystemConfig getSystemConfig(int id) throws Exception;

    public SystemConfig getSystemConfigByName(String name) throws Exception;

    public String getSystemConfigValue(String name) throws Exception;

    public List<SystemConfig> getAllSystemConfig() throws Exception;
}
