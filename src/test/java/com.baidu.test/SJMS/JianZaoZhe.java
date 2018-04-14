package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/7.
 */
class ProductJZ {//model
    private String name;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showProduct() {
        System.out.println("名称：" + name);
        System.out.println("型号：" + type);
    }
}

abstract class Builder {//工人
    public abstract void setPart(String arg1, String arg2);

    public abstract ProductJZ getProduct();
}

class ConcreateBuilder extends Builder {
    private ProductJZ product = new ProductJZ();

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    @Override
    public ProductJZ getProduct() {
        return product;
    }
}

class Director {
    private Builder builder = new ConcreateBuilder();

    public ProductJZ getAProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }

    public ProductJZ getBProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();
    }
}

public class JianZaoZhe {
    public static void main(String[] args) {
        Director director = new Director();
        ProductJZ product1 = director.getAProduct();
        product1.showProduct();

        ProductJZ product2 = director.getBProduct();
        product2.showProduct();
    }
}
