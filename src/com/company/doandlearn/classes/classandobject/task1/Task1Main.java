package com.company.doandlearn.classes.classandobject.task1;

public class Task1Main {

    public static void main(String[] args) {
        Test1 k = new Test1();
        k.setA(5);
        k.setB(10);
        printSumAndMax(k);
        Test1 s = new Test1();
        s.setA(59);
        s.setB(14);
        printSumAndMax(s);
        s.setA(23654);
        s.setB(234);
        printSumAndMax(s);
    }

    public static void printSumAndMax(Test1 a) {
        a.printAB();
        System.out.println(String.format("Сумма = %d Макс = %d", a.getSum(), a.getMax()));
    }
}
