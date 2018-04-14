package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/7.
 * 工厂方法模式：创建一个工厂，向他发出制造哪种商品的指令，他就返回那种商品给你，商品是之前已经定义好的，而工厂里的指令集也是之前定义好的
 */
abstract class Product {
    public String productName;
}

abstract class Creator {
    public Product FactoryMethod(String f_ProductType) {
        Product _product;
        _product = CreateProduct(f_ProductType);
        return _product;
    }

    public abstract Product CreateProduct(String f_Type);//抽象方法
}

class OneProduct extends Product {
    public OneProduct() {
        productName = "OneProduct";
    }
}

class TwoProduct extends Product {
    public TwoProduct() {
        productName = "TwoProduct";
    }
}

class FirstProduct extends Product {
    public FirstProduct() {
        productName = "My FirstProduct";
    }
}

class SecondProduct extends Product {
    public SecondProduct() {
        productName = "My SecondProduct";
    }
}

class OneCreator extends Creator {

    @Override
    public Product CreateProduct(String f_Type) {
        if (f_Type.equals("one")) {
            return new FirstProduct();
        } else if (f_Type.equals("two")) {

            return new SecondProduct();
        }
        return null;
    }
}

class TwoCreater extends Creator {

    @Override
    public Product CreateProduct(String f_Type) {
        if (f_Type.equals("one")) {
            return new FirstProduct();
        } else if (f_Type.equals("two")) {

            return new SecondProduct();
        }
        return null;
    }
}


public class GongChang {
    public static void main(String[] args) {
        Creator creator = new OneCreator();
        Product product = creator.FactoryMethod("one");
        System.out.println(product.productName);
        product = creator.FactoryMethod("two");
        System.out.println(product.productName);

        Creator creator1 = new TwoCreater();
        Product product1 = creator1.FactoryMethod("one");
        System.out.println(product.productName);
        product = creator.FactoryMethod("two");
        System.out.println(product.productName);
    }

}
