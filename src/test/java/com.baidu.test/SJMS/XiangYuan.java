package com.baidu.test.SJMS;

import java.util.Hashtable;

/**
 * Created by Administrator on 2016/9/8.
 * 享元：让对象定义到一个内存池中，然后通过标识符来拿，这样就避免new重复的对象
 */
abstract class Flyweight {
    abstract void operation();
}

class ConcreteFlyweight extends Flyweight {
    private String string;

    public ConcreteFlyweight(String str) {
        string = str;
    }

    @Override
    void operation() {
        System.out.println("Concrete---Flyweight : " + string);
    }
}

class FlyweightFactory{
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory() {}

    public Flyweight getFlyWeight(Object obj) {
        Flyweight flyweight = (Flyweight) flyweights.get(obj);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize() {
        return flyweights.size();
    }
}


public class XiangYuan {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1;
        Flyweight fly2;
        Flyweight fly3;
        Flyweight fly4;
        Flyweight fly5;
        Flyweight fly6;

    public XiangYuan() {
        fly1 = factory.getFlyWeight("Google");
        fly2 = factory.getFlyWeight("Qutr");
        fly3 = factory.getFlyWeight("Google");
        fly4 = factory.getFlyWeight("Google");
        fly5 = factory.getFlyWeight("Google");
        fly6 = factory.getFlyWeight("Google");
    }

    public void showFlyweigth() {
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        int objSize = factory.getFlyweightSize();
        System.out.println("objectSiz=" + objSize);
    }

    public static void main(String[] args) {
        System.out.println("The FlyWeight Pattern!");
        XiangYuan fp = new XiangYuan();
        fp.showFlyweigth();
    }
}
