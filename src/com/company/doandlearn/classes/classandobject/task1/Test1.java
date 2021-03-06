package com.company.doandlearn.classes.classandobject.task1;

public class Test1 {
    private int a;
    private int b;

    public void printAB() {
        //System.out.println("a = " + a + "b = " + b);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a+b;
    }

    public int getMax() {
        return Math.max(a,b);
    }
}
