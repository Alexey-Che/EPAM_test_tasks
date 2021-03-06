package com.company.doandlearn.algorithmization.sorting;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Task4 k = new Task4();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readIntFromScanner("set sequence size");
        int[] a = SetSequence.randomSequence(n);
        System.out.println(Arrays.toString(a));
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("количество перестановок " + count);
    }
}
