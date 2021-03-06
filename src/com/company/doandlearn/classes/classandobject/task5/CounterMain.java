package com.company.doandlearn.classes.classandobject.task5;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        demoCount(counter);
        Counter counter1 = new Counter(10, -5, 25);
        demoCount(counter1);
    }

    public static void demoCount(Counter counter) {
        System.out.println(counter.getCount());
        int limit = counter.getDifMaxMin()+5;
        for (int i = 0; i < limit ; i++) {
            counter.countIncrease();
            System.out.println(counter.getCount());
        }

        for (int i = 0; i <limit ; i++) {
            counter.countDecrease();
            System.out.println(counter.getCount());
        }
    }
}
