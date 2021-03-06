package com.company.doandlearn.topicone.cycles;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task7 {
    public static void main(String[] args) {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("введите начало отрезка");
        int b = ReadFromScanner.readOnlyPositiveFromScanner("введите конец отрезка");
        for (int i = a; i<=b; i++) {
            for (int j = 2; j<i; j++) {
                if (i%j==0) {
                    System.out.println(j + " делитель числа " + i);
                }
            }
        }
    }
}
