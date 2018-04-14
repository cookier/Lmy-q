package com.baidu.ms.service;

import com.baidu.ms.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/5.
 */
public interface UserService {
    /**
     * 查找所有用户
     */
    List<User> findUser() throws Exception;

    User selectUser(Map map) throws Exception;
}
