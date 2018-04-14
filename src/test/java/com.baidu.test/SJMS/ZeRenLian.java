package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/8.
 * 责任链：通过set方法让每个处理类内嵌起来，然后执行最上层的处理类随机产生链式反应
 */
abstract class Handler {
    protected Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}

class ConcreateHandler extends Handler{

    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理请求");
        }
    }
}

public class ZeRenLian {
    public static void main(String[] args) {
        Handler handler1 = new ConcreateHandler();
        Handler handler2 = new ConcreateHandler();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}
