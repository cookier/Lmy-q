import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lmy on 2017/8/11.
 */
public class TestClazz<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item){storage.add(item);}

    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }
    @Test
    public void tetOne(){
        TestClazz<String> rs = new TestClazz<String>();
        for(String s : ("The  quick brown fox jumped over the lazy brown dog").split(" ")){
            rs.add(s);
        }
        for(int i = 0;i<11;i++){
            System.out.print(rs.select()+" ");
        }
    }
}
