package com.baidu.test.SJMS;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/9/7.
 */
interface AbstractSubject {
    public abstract void request();

    public abstract void sayHello();
}

class RealSubject implements AbstractSubject {
    public void request() {
        System.out.println("RealSubject's request() ...");
    }

    public void sayHello() {
        System.out.println("============================");
    }
}

class DynamicProxy implements InvocationHandler {

    Object obj = null;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("fuck you");
        Object result = method.invoke(this.obj, args);
        return result;
    }
}


public class DongTaiDaiLi {
    public static void main(String[] args) {
        AbstractSubject realSubject = new RealSubject();
        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();
        InvocationHandler handler = new DynamicProxy(realSubject);

        AbstractSubject proxy = (AbstractSubject) Proxy.newProxyInstance(loader, interfaces, handler);

        proxy.request();

        System.out.println(proxy.getClass().getName());
    }
}
