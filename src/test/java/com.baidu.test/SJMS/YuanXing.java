package com.baidu.test.SJMS;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/7.
 * 原型模式：new方法是jvm调用构造方法，完成里面的代码后，自动生成一个实例返回，现在用clone方法，这个过程会比new快,而且clone方法根本没走new方法，前提new里灭有执行代码
 */
class Prototype implements Cloneable {
    private ArrayList list = new ArrayList();

    public Prototype(String name) {
        System.out.println("fuck you");
    }

    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
            prototype.list = (ArrayList) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}

class ConcreatePrototype extends Prototype {
    public ConcreatePrototype() {
        super("fuck you");
    }

    public void show() {
        System.out.println("原型模式实现类");
    }
}

public class YuanXing {
    public static void main(String[] args) {
        ConcreatePrototype cp = new ConcreatePrototype();
        for (int i = 0; i < 10; i++) {
            ConcreatePrototype clonecp = (ConcreatePrototype) cp.clone();
            clonecp.show();
        }

    }
}
