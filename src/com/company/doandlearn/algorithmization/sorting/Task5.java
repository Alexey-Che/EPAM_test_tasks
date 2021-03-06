package com.company.doandlearn.algorithmization.sorting;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Task5 k = new Task5();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readIntFromScanner("set sequence size");
        int[] a = SetSequence.randomSequence(n);
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; i++) {
            int newElement = a[i];
            int location = i - 1;
            while (location >= 0 && a[location] > newElement) {
                a[location + 1] = a[location];
                location--;
            }
            a[location + 1] = newElement;
        }
        System.out.println(Arrays.toString(a));
    }
}
