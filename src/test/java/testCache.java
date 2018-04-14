import com.baidu.ms.service.EhCacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lmy on 2017/2/26.
 */

@ContextConfiguration(
        locations = {
                "classpath:config/spring/application-dao.xml",
                "classpath:config/spring/application-service.xml",
                "classpath:config/spring/application-transaction.xml",
                "classpath:config/spring/application-captcha.xml",
                "classpath:config/spring/application-ehcache.xml",
                "classpath:config/spring/application-mq.xml",
                "classpath:config/spring/spring-mvc.xml"
        }
)

@RunWith(SpringJUnit4ClassRunner.class)
public class testCache {
    @Autowired(required=false)
    private EhCacheService ehCacheService;

    @Test
    public void testEh() {
        System.out.println(ehCacheService);
        String str1 = ehCacheService.getTimestamp("bb", 4);
        String str2 = ehCacheService.getTimestamp("bb", 100);
        String str3 = ehCacheService.getTimestamp("bb", 100);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
