package com.baidu.test.aop;

import com.baidu.ms.pojo.Shop;
import com.baidu.ms.service.ShopService;
import com.baidu.ms.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lmy on 2017/2/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:config/spring/application-dao.xml",
                "classpath:config/spring/application-service.xml",
                "classpath:config/spring/application-transaction.xml",
                "classpath:config/spring/application-captcha.xml",
                "classpath:config/spring/application-redis.xml",
                "classpath:config/spring/spring-mvc.xml"
        }
)
public class testRedisInterceptor {
    @Autowired(required=false)//
    private UserService userService;

    @Autowired(required=false)//
    private ShopService shopService;

    @Test
    public void getCache() {

        try {
            Shop user = shopService.getLatestShopByUser(2);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
