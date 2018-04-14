package com.baidu.test.controller;

import com.baidu.ms.mapper.OrderMapper;
import com.baidu.ms.pojo.Order;
import com.baidu.ms.pojo.OrderExample;
import com.baidu.ms.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lmy on 2017/2/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:config/spring/application-dao.xml",
                "classpath:config/spring/application-service.xml",
                "classpath:config/spring/application-transaction.xml",
                "classpath:config/spring/application-captcha.xml",
                "classpath:config/spring/application-mq.xml",
                "classpath:config/spring/spring-mvc.xml"
        }
)
public class testUserController {

    @Autowired(required=false)//
    private UserService userService;

    @Autowired(required=false)
    private OrderMapper orderMapper;

    @Test
    public void getAccount() throws Exception {
        System.out.println(userService.findUser().size());
    }

    @Test
    public void testOrder() throws JsonProcessingException {
        OrderExample orderExample1 = new OrderExample();
        orderExample1.or().andOrderStatusEqualTo(1).andCustomerOrderIdBetween(1, 3);
//        System.out.println(orderMapper.deleteByPrimaryKey(54847));
        Order order1 = orderMapper.selectByPrimaryKey(54845);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(order1);

        JSONObject jo = new JSONObject();
        jo.put("sdf", "sdf");

        System.out.println(json);
        System.out.println(jo);


    }


}
