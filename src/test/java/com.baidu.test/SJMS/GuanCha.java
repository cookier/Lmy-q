package com.baidu.test.SJMS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lmy on 2016/9/11.
 */
interface Watcher {
    public void update(String string);
}

interface Watched {
    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String str);
}

class ConcreteWatcher implements Watcher {

    public void update(String string) {
        System.out.println(string);
    }
}

class ConcreteWatched implements Watched {
    private List<Watcher> list = new ArrayList<Watcher>();

    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    public void notifyWatchers(String str) {
        for (Watcher watcher : list) {
            watcher.update(str);
        }

    }
}

public class GuanCha {
    public static void main(String[] args) {
        Watched girl = new ConcreteWatched();

        Watcher w1 = new ConcreteWatcher();
        Watcher w2 = new ConcreteWatcher();
        Watcher w3 = new ConcreteWatcher();
        Watcher w4 = new ConcreteWatcher();

        girl.addWatcher(w1);
        girl.addWatcher(w2);
        girl.addWatcher(w3);
        girl.addWatcher(w4);

        girl.notifyWatchers("hello");
    }
}
