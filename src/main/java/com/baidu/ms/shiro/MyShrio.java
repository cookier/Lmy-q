package com.baidu.ms.shiro;

import com.baidu.ms.pojo.PlatformPermission;
import com.baidu.ms.pojo.PlatformRole;
import com.baidu.ms.pojo.User;
import com.baidu.ms.service.RoleService;
import com.baidu.ms.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;

/**
 * Created by lmy on 2017/2/26.
 */
public class MyShrio extends AuthorizingRealm {

    @Autowired(required = false)
    private UserService userService;
    @Autowired(required = false)
    private RoleService roleService;

    /**
     * 权限认证，获取登录用户的权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String loginName = (String) principalCollection.fromRealm(getName()).iterator().next();
        //此处连库匹配了登录用户的数据，具体怎么做，需要根据个人需求而定
        User user = null;
        try {
            user = userService.selectUser(new HashedMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<PlatformRole> list = user.getRoles();
        if (user != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //获取用户的角色名称
            info.setRoles(new HashSet<String>(roleService.getRolesName(list)));
            //获取用户的权限
            List<PlatformPermission> permissions = user.getPermissions();
            for (PlatformPermission role : permissions) {
                info.addStringPermissions(new HashSet<>());
            }
            return info;
        }
        return null;
    }

    /**
     * 登录认证，创建用户的登录信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //判断用户登录状态
        token.getUsername();
        User user = null;
        try {
            user = userService.selectUser(new HashedMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user != null) {
            //保存用户登录信息到认证中
            return new SimpleAuthenticationInfo(user.getMobile(), user.getPassword(), getName());
        }
        return null;
    }

}