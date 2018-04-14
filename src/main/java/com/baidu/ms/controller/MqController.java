package com.baidu.ms.controller;

import com.baidu.ms.service.ConsumerService;
import com.baidu.ms.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lmy on 2017/2/26.
 */
@Controller
@RequestMapping("/mq")
public class MqController {
    @Autowired(required = false)//
    private Destination destination;
    @Autowired(required = false)//
    private ProducerService producerService;
    @Autowired(required = false)//
    private ConsumerService consumerService;

    @RequestMapping("producer")
    public void producer() {
        System.out.println("------------go producer");
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(now);
        System.out.println(time);
    }

    @RequestMapping(value = "/onsend")
    public ModelAndView producer1() {
        System.out.println("------------send to jms");
        ModelAndView mv = new ModelAndView();
        producerService.sendMessage(destination, "message");
        mv.setViewName("welcome");
        return mv;
    }

    @RequestMapping(value = "/receive")
    public ModelAndView queue_receive() throws JMSException {
        System.out.println("------------receive message");
        ModelAndView mv = new ModelAndView();

        TextMessage tm = consumerService.receive(destination);
        System.out.println(tm.getText());
        mv.addObject("textMessage", tm.getText());

        mv.setViewName("queue_receive");
        return mv;
    }

    @RequestMapping(value = "/jms")
    public ModelAndView jmsManager() throws IOException {
        System.out.println("------------jms manager");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");

        JMXServiceURL url = new JMXServiceURL("");
        JMXConnector connector = JMXConnectorFactory.connect(url);
        connector.connect();
        MBeanServerConnection connection = connector.getMBeanServerConnection();

        return mv;
    }
}
