package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/8.
 */
class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }

}

class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

class Caretaker {

    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}

public class BeiWangLu {
    public static void main(String[] args) {

        Originator o = new Originator();
        Caretaker c = new Caretaker();
        o.setState("On");
        c.saveMemento(o.createMemento());
        o.setState("Off");
        o.restoreMemento(c.retrieveMemento());

        System.out.println(o.getState());
    }
}
