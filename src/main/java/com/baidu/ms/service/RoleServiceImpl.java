package com.baidu.ms.service;

import com.baidu.ms.pojo.PlatformRole;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lmy on 2017/2/26.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public List<String> getRolesName(List<PlatformRole> roles) {
        return roles.stream().map(PlatformRole::getName).collect(Collectors.toList());
    }
}
