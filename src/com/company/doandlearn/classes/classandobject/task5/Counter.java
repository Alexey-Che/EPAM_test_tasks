package com.company.doandlearn.classes.classandobject.task5;

public class Counter {
    private int count;
    private int min;
    private int max;

    public Counter() {
        count = 10;
        min = 0;
        max = 20;
    }

    public Counter(int count, int min, int max) {
        this.count = count;
        this.min = min;
        this.max = max;
    }

    public void countIncrease() {
        if (count<max) {
            count++;
        }
    }

    public void countDecrease() {
        if (count>min) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public int getDifMaxMin() {
        return max-min;
    }
}
