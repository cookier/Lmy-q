package com.baidu.ms.service;

import com.baidu.ms.mapper.SystemConfigMapper;
import com.baidu.ms.pojo.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统配置
 *
 * @author Administrator
 */


@Service
public class SystemConfigServiceImpl implements SystemConfigService {

    @Autowired(required = false)
    SystemConfigMapper systemConfigMapper;

    public boolean createSystemConfig(SystemConfig systemConfig) throws Exception {
        return systemConfigMapper.insert(systemConfig) > 0;
    }

    public boolean updateSystemConfig(SystemConfig systemConfig) throws Exception {
        return systemConfigMapper.updateByPrimaryKey(systemConfig) > 0;
    }

    public boolean deleteSystemConfig(int id) throws Exception {
        return systemConfigMapper.deleteByPrimaryKey(id) > 0;
    }

    public SystemConfig getSystemConfig(int id) throws Exception {
        return systemConfigMapper.selectByPrimaryKey(id);
    }

    public SystemConfig getSystemConfigByName(String name) throws Exception {
        return systemConfigMapper.selectByName(name);
    }

    public String getSystemConfigValue(String name) throws Exception {
        SystemConfig c = getSystemConfigByName(name);
        if (c != null) {
            return c.getValue();
        }
        return null;
    }

    /**
     * 查询所有系统配置
     *
     * @return
     */
    public List<SystemConfig> getAllSystemConfig() throws Exception {
        return systemConfigMapper.selectAll();
    }

    /**
     * 分页查询系统配置信息
     *
     * @param paramMap
     * @param operatorMap
     * @param orderByMap
     * @param pageNumber
     * @param pageSize
     * @return
     */

    /**
     * 通过systemConfig名字更新其的value
     */
//    public boolean updateSystemConfigValueByName(String name, String value) {
//        String sql = "UPDATE t_system_config SET value = ? WHERE name = ?";
//        return Db.update(sql, name, value) > 0;
//    }

}
