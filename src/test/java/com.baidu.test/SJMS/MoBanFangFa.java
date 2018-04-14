package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/8.
 * 模板方法：使用抽象类的功能，用一个实例方法中调用接口方法
 */
abstract class AbstractClass {
    public abstract void PrimitiveOperation1();

    public abstract void PrimitiveOperation2();

    public void TemplateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("Done the method.");
    }
}

class ConcreteClassA extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("Implement operation 1 in Concreate class A.");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("Implement operation 2 in Concreate class A.");
    }
}

class ConcreteClassB extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("Implement operation 1 in Concreate class B.");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("Implement operation 2 in Concreate class B.");
    }
}

public class MoBanFangFa {
    public static void main(String[] args) {
        AbstractClass c = new ConcreteClassA();
        c.TemplateMethod();

        c = new ConcreteClassB();
        c.TemplateMethod();
    }

}
