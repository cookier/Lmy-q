package com.baidu.ms.service;

import com.baidu.ms.pojo.PlatformPermission;

import java.util.List;


/**
 * Created by lmy on 2017/2/26.
 */
public interface PermissionService {
    public List<String> getPermissionsName(List<PlatformPermission> permissionList);
}
