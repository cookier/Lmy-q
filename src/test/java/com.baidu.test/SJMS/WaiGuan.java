package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/8.
 * 外观：把多个类的方法放到一个类的方法中去使用
 */
class DrawerOne {
    public void open() {
        System.out.println("第一个抽屉被打开了");
        getKey();
    }

    public void getKey() {
        System.out.println("得到第二个抽屉的药匙");
    }
}

class DrawerTwo {
    public void open() {
        System.out.println("第二个抽屉被打开了");
        getFile();
    }

    public void getFile() {
        System.out.println("得到这个重要文件");
    }
}

class DrawerFacade {
    DrawerOne darwerOne = new DrawerOne();
    DrawerTwo drawerTwo = new DrawerTwo();

    public void open() {
        darwerOne.open();
        drawerTwo.open();
    }

}

public class WaiGuan {
    public static void main(String[] args) {
        DrawerFacade drawer = new DrawerFacade();
        drawer.open();
    }
}
