package com.company.doandlearn.topicone.cycles;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task1 {

    /*static private int result = 0;*/
    public void helloWorld() {
        System.out.println("hello world");
    }
    public int calculateSum (int x) {
        int sum = 0;
        for (int i = 1;i<x; i++) {
            sum+=i;
        }
        helloWorld();
        return sum;
    }
    public static void main(String[] args) {
        int x = ReadFromScanner.readOnlyPositiveFromScanner("введите целое положительное число");
        /*do {
            x = ReadFromScanner.readIntFromScanner("введите целое положительное число");
        } while (x<0); */

        /*if (x<0) {
            System.err.println("Ошибка, отрицательное число или 0");
        }*/
        /*for (int i = 1;i<x; i++) {
            result+=i;
        }*/
        Task1 k = new Task1();
        int result = k.calculateSum(x);
        System.out.println("Сумма чисел от 1 до "+ x + " равна " + result);
        k.helloWorld();
    }
}
