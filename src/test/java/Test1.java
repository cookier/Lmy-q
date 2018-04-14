import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by lmy on 2017/5/25.
 */
public class Test1 {
    @Test
    public void testZZ(){
        if(Pattern.compile("public.+?abc").matcher("public  abc").find()){
            System.out.println("sdfa");
        }
    }
    
    @Test
    public void testShu(){
    }
}
