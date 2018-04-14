package com.baidu.test.SJMS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 216/9/8.
 * 解释器：由于传入方法的参数是一个引用类型，所有可以给这个引用进行有层次的操作
 */
class Context {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}

abstract class AbstractExpreesion {
    abstract void Interpret(Context context);
}

class PlusExpression extends AbstractExpreesion {

    @Override
    void Interpret(Context context) {
        int sum = context.getSum();
        sum++;
        context.setSum(sum);
    }
}

class MinusExpression extends AbstractExpreesion {

    @Override
    void Interpret(Context context) {
        int sum = context.getSum();
        sum--;
        context.setSum(sum);
    }
}

public class JieShiQi {
    public static void main(String[] args) {
        Context context = new Context();
        context.setSum(10);
        List<AbstractExpreesion> list = new ArrayList<AbstractExpreesion>();
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new PlusExpression());

        list.add(new MinusExpression());
        list.add(new MinusExpression());

        for(int i =0;i<list.size();i++) {
            AbstractExpreesion expreesion = list.get(i);
            expreesion.Interpret(context);
        }
        System.out.println(context.getSum());
    }
}
