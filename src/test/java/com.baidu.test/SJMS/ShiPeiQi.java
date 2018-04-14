package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/8.
 * 适配器：原有的方法里的逻辑不变，但是要让他的方法名变成自己的方法名，用适配器模式可以让这种实现变得更快和更清晰
 */
class Adaptee {
    public void specificRequest() {
        System.out.println("被适配类 具有特殊功能...");
    }
}

interface Target {
    public void request();
}

class ConcreateTarget implements Target {
    public void request() {
        System.out.println("普通类 具有普通功能...");
    }
}

class Adapter extends Adaptee implements Target {
    public void request() {
        super.specificRequest();
    }
}

class Adapter1 implements Target {
    private Adaptee adaptee;

    public Adapter1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        this.adaptee.specificRequest();
    }
}

public class ShiPeiQi {
    public static void main(String[] args) {
        Target concreateTarget = new ConcreateTarget();

        concreateTarget.request();

        Target adapter = new Adapter();
        adapter.request();

        Target adapter1 = new Adapter1(new Adaptee());
        adapter1.request();
    }
}
