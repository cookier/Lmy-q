package com.baidu.ms.service;

import javax.jms.Destination;
import javax.jms.TextMessage;

/**
 * Created by lmy on 2017/2/26.
 */
public interface ConsumerService {
    public TextMessage receive(Destination destination);
}
