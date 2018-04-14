package com.baidu.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lmy on 2017/2/27.
 */
public class TestLambda {
    interface MyNumber {
        double getValue();
    }

    @Test
    public void test1() {
        MyNumber myNumber;

        myNumber = () -> 123.45;
        System.out.println(myNumber.getValue());
    }

    interface NumericTest {
        boolean test(int n);
    }

    @Test
    public void test2() {
        NumericTest isEven = (n) -> (n % 2) == 0;
        System.out.println(isEven.test(2));
    }

    interface SomeFunc<T> {
        T func(T t);
    }

    @Test
    public void test3() {
        String string = "sdfsdf";
        System.out.println(this.hashCode());
        SomeFunc<String> reverse = (str) -> {
            System.out.println(this.hashCode());
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result + string;
        };
        System.out.println(reverse.func("sdfds"));
    }

    interface StringFunc {
        String func(String n);
    }

    static class MyStringOps {
        static String strReverse(String string) {
            String result = "";
            int i;
            for (i = string.length() - 1; i >= 0; i--) {
                result += string.charAt(i);
            }
            return result;
        }
    }


    @Test
    public void test4() {
        String inStr = "lambds add pwoer to Jave";

    }

    interface MyFunc<T> {
        boolean func(T v1, T v2);
    }

    class HighTemp {
        private int hTemp;

        HighTemp(int hTemp) {
            hTemp = hTemp;
        }

        boolean samTemp(HighTemp ht2) {
            return hTemp == ht2.hTemp;
        }

        boolean lessThanTemp(HighTemp ht2) {
            return hTemp < ht2.hTemp;
        }
    }

    @Test
    public void test5() {
    }

    class MyClass {

        private int val;

        MyClass(int v) {
            val = v;
        }

        int getVal() {
            return val;
        }
    }

    static class UserMethodRef {
        static int compareMc(MyClass a, MyClass b) {
            return a.getVal() - b.getVal();
        }
    }

    @Test
    public void test6() {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(2));
        al.add(new MyClass(3));
        al.add(new MyClass(4));
        al.add(new MyClass(5));

        MyClass maxValObj = Collections.max(al, (c, c1) -> {
            return c.getVal() - c1.getVal();
        });
        MyClass maxValObj1 = Collections.max(al, UserMethodRef::compareMc);

        System.out.println(maxValObj.getVal());
        System.out.println(maxValObj1.getVal());
    }

    interface MyFunc1 {
        MyClass1 func(int n);
    }

    class MyClass1 {
        private int val;

        MyClass1(int val) {
            this.val = val;
        }

        MyClass1() {
            this.val = 0;
        }

        int getVal() {
            return this.val;
        }
    }

    @Test
    public void test7() {
        MyFunc1 myFunc1 = MyClass1::new;

        MyClass1 mc = myFunc1.func(1000);
        System.out.println(mc.getVal());
    }

    interface StringFunc2 {
        String func(String string);
    }

    static class MyStringOps2 {
        static String strReverse(String string) {
            String result = "";
            int i;

            for (i = string.length() - 1; i >= 0; i--) {
                result += string.charAt(i);
            }
            return result;
        }
    }

    static class MethodRefDome {
        static String stringOp(StringFunc sf, String s) {
            return sf.func(s);
        }
    }

    @Test
    public void test9() {
        String inStr = "lambds add pwoer to Jave";
        String outStr;
        outStr = MethodRefDome.stringOp(MyStringOps2::strReverse, inStr);

        System.out.println(inStr);
        System.out.println(outStr);
    }

    interface Myfunc3<T> {
        boolean func(T v1, T v2);
    }

    class HighTemp3 {
        private int hTemp;

        HighTemp3(int ht) {
            hTemp = ht;
        }

        boolean sameTemp(HighTemp ht2) {
            return hTemp == ht2.hTemp;
        }

        boolean lessThanTemp(HighTemp ht2) {
            return hTemp < ht2.hTemp;
        }

    }

    static class InstanceMethWithObjectRefDemo {
        static <T> int counter(T[] vals, Myfunc3<T> f, T v) {
            int count = 0;

            for (int i = 0; i < vals.length; i++) {
                if (f.func(vals[i], v)) {
                    count++;
                }
            }
            return count;
        }
    }

    @Test
    public void test10() {
        int count;
        HighTemp[] weekDayHighs = {
                new HighTemp(89),
                new HighTemp(345),
                new HighTemp(892),
                new HighTemp(222),
                new HighTemp(88969),
                new HighTemp(3436),
                new HighTemp(8933),
                new HighTemp(8339)
        };

        HighTemp3 highTemp3 = new HighTemp3(23);

    }


}
