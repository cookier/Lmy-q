package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/8.
 * 命令：让所有的遥控器可以适配多种电器的命令
 */
interface Command {
    void execute();
}

class Tv {
    public int currentChannel = 0;

    public void turnOn() {
        System.out.println("The television is on");
    }

    public void turnOff() {
        System.out.println("The television is off");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("Now Tv channel is " + channel);
    }
}

class CommandOn implements Command {
    private Tv myTv;


    public CommandOn(Tv tv) {
        myTv = tv;
    }


    @Override
    public void execute() {
        myTv.turnOn();
    }
}

class CommandOff implements Command {
    private Tv myTv;


    public CommandOff(Tv tv) {
        myTv = tv;
    }


    public void execute() {
        myTv.turnOff();
    }
}

class CommandChange implements Command {
    private Tv myTv;

    private int channel;

    public CommandChange(Tv tv, int channel) {
        myTv = tv;
        this.channel = channel;
    }

    public void execute() {
        myTv.changeChannel(channel);
    }
}

class Control {
    private Command onCommand, offCommand, changeChannel;

    public Control(Command on, Command off, Command channel) {
        onCommand = on;
        offCommand = off;
        changeChannel = channel;
    }

    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }

    public void changeChannel() {
        changeChannel.execute();
    }
}

public class MingLing {
    public static void main(String[] args) {
        Tv myTv = new Tv();
        CommandOn on = new CommandOn(myTv);
        CommandOff off = new CommandOff(myTv);
        CommandChange channel = new CommandChange(myTv, 2);
        Control control = new Control(on, off, channel);
        control.turnOn();
        control.changeChannel();
        control.turnOff();
    }
}
