package com.baidu.test.SJMS;

/**
 * Created by lmy on 2016/9/11.
 */
interface IStrategy {
    public void operate();
}

class backDoor implements IStrategy {
    public void operate() {
        System.out.println("找乔国老帮忙，让顶顶顶顶");
    }
}

class GivenGreenLight implements IStrategy {

    public void operate() {
        System.out.println("求吴国太");
    }
}

class BlackEnemy implements IStrategy {

    public void operate() {
        System.out.println("孙夫人断后");
    }
}

class ContextThis {
    private IStrategy strategy;

    public ContextThis(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}

public class CeLue {
    public static void main(String[] args) {
        ContextThis contextThis;

        System.out.println("------刚刚到吴国，第一个精囊");
        contextThis = new ContextThis(new backDoor());
        contextThis.operate();
        System.out.println();

        System.out.println("----------刘备乐不思蜀，拆第二个了---------------");
        contextThis = new ContextThis(new GivenGreenLight());
        contextThis.operate();//拆开执行
        System.out.println();

        //孙权的小追兵了，咋办？拆开第三个锦囊
        System.out.println("----------孙权的小追兵了，咋办？拆开第三个锦囊---------------");
        contextThis = new ContextThis(new BlackEnemy());
        contextThis.operate();//拆开执行
    }



}
