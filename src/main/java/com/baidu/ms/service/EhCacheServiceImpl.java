package com.baidu.ms.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by lmy on 2017/2/26.
 */
@Service
public class EhCacheServiceImpl implements EhCacheService {
    @Override
    @Cacheable(value = "testCache", key = "#param", condition = "#id>5")
    public String getTimestamp(String param, int id) {
        Random random = new Random();
        int i = random.nextInt();
        return i + "";
    }
}
