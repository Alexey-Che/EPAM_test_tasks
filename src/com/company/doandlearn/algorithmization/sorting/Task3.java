package com.company.doandlearn.algorithmization.sorting;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Task3 k = new Task3();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readIntFromScanner("set sequence size");
        int[] a = SetSequence.randomSequence(n);
        System.out.println(Arrays.toString(a));
        /*int index = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = (index = i) + 1; j < a.length; j++) {
                if (a[index] < a[j]) {
                    index = j;
                }
                if (index != i) {
                    a[i] = ((a[index] ^= a[i] ^= a[index])) ^ a[i];
                }
            }
        }*/
        int index;
        int tmp;
        for (int i = 0; i < a.length; i++) {
            index = i;
            tmp = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > tmp) {
                    tmp = a[j];
                    index = j;
                }
            }
            if (index == i)
                continue;
            tmp = a[i];
            a[i] = a[index];
            a[index] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
