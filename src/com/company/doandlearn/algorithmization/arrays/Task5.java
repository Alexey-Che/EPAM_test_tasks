package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Task5 k = new Task5();
        k.go();
    }

    private void go() {
        int[] mass = SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        System.out.println(Arrays.toString(mass));
        for (int i =0;i<mass.length;i++) {
            if (mass[i]>i) {
                System.out.println(mass[i]);
            }
        }
    }
}

