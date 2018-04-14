package com.baidu.ms.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by lmy on 2017/2/25.
 */

@Component
public class JsonKit {
    private static ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
        objectMapper = new ObjectMapper();
    }

    public static String beanToJsonStr(Object bean) throws JsonProcessingException {
        return objectMapper.writeValueAsString(bean);
    }

}
