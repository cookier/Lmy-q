package com.baidu.test.SJMS;

import java.util.Vector;

/**
 * Created by Administrator on 2016/9/8.
 */
interface Iterator {
    public Object first();

    public Object next();

    public Object currentItem();

    public boolean isDone();
}

class ConcreteIterator implements Iterator {
    private int currentIndex = 0;
    private Vector vector = null;

    public ConcreteIterator(final Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object first() {
        currentIndex = 0;
        return vector.get(currentIndex);
    }

    @Override
    public Object next() {
        currentIndex++;
        return vector.get(currentIndex);
    }

    @Override
    public Object currentItem() {
        return vector.get(currentIndex);
    }

    @Override
    public boolean isDone() {
        if (currentIndex >= this.vector.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}

interface Aggregat {
    public Iterator createIterator();
}

class ConcreteAggregat implements Aggregat {
    private Vector vector = null;

    private Vector getVector() {
        return vector;
    }

    public void setVector(final Vector vector) {
        this.vector = vector;
    }

    public ConcreteAggregat() {
        vector = new Vector();
        vector.add("vector 1");
        vector.add("vector 2");
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(vector);
    }
}

public class DieDaiQi {
    public static void main(String[] args) {
        final Aggregat agg = new ConcreteAggregat();
        final Iterator iterator = agg.createIterator();
        System.out.println(iterator.first());
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
