package com.baidu.ms.service;

import com.baidu.ms.pojo.PlatformRole;

import java.util.List;

/**
 * Created by lmy on 2017/2/26.
 */
public interface RoleService {
    public List<String> getRolesName(List<PlatformRole> roles);
}
