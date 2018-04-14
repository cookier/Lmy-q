package com.baidu.ms.service;

import javax.jms.Destination;

/**
 * Created by lmy on 2017/2/26.
 */
public interface ProducerService {
    public void sendMessage(Destination destination, final String msg);

    public void sendMessage(final String msg);
}
