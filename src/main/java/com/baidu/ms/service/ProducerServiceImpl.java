package com.baidu.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by lmy on 2017/2/26.
 */
@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired(required = false)//
    private JmsTemplate jmsTemplate;

    @Override
    public void sendMessage(Destination destination, String msg) {
        System.out.println("向队列" + destination.toString() + "发送了消息------------" + msg);
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }

    @Override
    public void sendMessage(String msg) {
        String destination = jmsTemplate.getDefaultDestination().toString();
        System.out.println("向队列" + destination + "发送了消息------------" + msg);
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
}
