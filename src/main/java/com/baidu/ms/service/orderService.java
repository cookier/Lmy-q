package com.baidu.ms.service;

import com.baidu.ms.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2017/1/5.
 */
public interface orderService {
    /**
     * 查找所有用户
     */
    List<User> findUser() throws Exception;
}
