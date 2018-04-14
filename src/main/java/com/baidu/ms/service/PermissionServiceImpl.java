package com.baidu.ms.service;

import com.baidu.ms.pojo.PlatformPermission;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lmy on 2017/2/26.
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Override
    public List<String> getPermissionsName(List<PlatformPermission> permissionList) {
        return permissionList.stream().map(PlatformPermission::getPermissionName).collect(Collectors.toList());
    }
}
