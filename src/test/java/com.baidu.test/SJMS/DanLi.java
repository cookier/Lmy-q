package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/7.
 */

class Singleton {//第一种（懒汉，线程不安全）：
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Singleton1 {//第二种（懒汉，线程安全）：：
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

class Singleton2 {//第三种（饿汉）：
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }
}

class Singleton3 {//第四种（饿汉，变种）：
    private static Singleton3 instance = null;

    static {
        instance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}

class Singleton4 {//第五种（静态内部类）：

    private static class SingletonHolder {
        private static final Singleton4 instance = new Singleton4();
    }

    private Singleton4() {

    }

    public static final Singleton4 getInstance() {
        return SingletonHolder.instance;
    }

}

enum Singleton5 { //第六种（枚举）：
    INSTANCE;

    public void whateverMethod() {
    }
}

class Singleton6 {//第七种（双重校验锁）：
    private volatile static Singleton6 singleton;//volatile让编译器不会对这行代码优化

    private Singleton6() {
    }

    public static Singleton6 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }

}


public class DanLi {
}
