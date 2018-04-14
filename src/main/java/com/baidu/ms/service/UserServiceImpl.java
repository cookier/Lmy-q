package com.baidu.ms.service;

import com.baidu.ms.mapper.UserMapper;
import com.baidu.ms.pojo.User;
import com.baidu.ms.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/5.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        UserExample userExample = new UserExample();
        List<Integer> fieldValues = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            fieldValues.add(i);
        }
        userExample.or().andIdIn(fieldValues);

        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    public User selectUser(Map map) throws Exception {
        User user = userMapper.selectUser(map);

        return user;
    }
}
