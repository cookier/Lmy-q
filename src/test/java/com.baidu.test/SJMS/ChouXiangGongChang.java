package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/7.
 * 抽象工厂模式：把产品在每个工厂里对应出独有的方法，那样就不再通过传参返回产品，而是直接方法指定商品
 */

interface IProduct1 {
    public void show();
}

interface IProduct2 {
    public void show();
}

class Product1 implements IProduct1 {
    public void show() {
        System.out.println("这是1型商品");
    }
}

class Product2 implements IProduct2{
    @Override
    public void show() {
        System.out.println("这是2型商品");
    }
}

interface IFactory{
    public IProduct1 createProduc1();
    public IProduct2 createProduc2();
}

class Factory implements IFactory{
    public IProduct1 createProduc1() {
        return new Product1();
    }

    public IProduct2 createProduc2() {
        return new Product2();
    }
}

public class ChouXiangGongChang {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduc1().show();
        factory.createProduc2().show();
    }
}
