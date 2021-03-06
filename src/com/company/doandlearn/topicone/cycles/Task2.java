package com.company.doandlearn.topicone.cycles;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task2 {
    public static void main(String[] args) {
        int a = ReadFromScanner.readIntFromScanner("введите начало отрезка");
        int b = ReadFromScanner.readIntFromScanner("введите конец отрезка");
        int h = ReadFromScanner.readOnlyPositiveFromScanner("введите шаг");
        int result;
        for (int i = a; i <=b; i+=h) {
            if (i>2) {
                result = i;
            } else {
                result = -i;
            }
            System.out.println("f(" + i +") =" + result);
        }
    }
}
