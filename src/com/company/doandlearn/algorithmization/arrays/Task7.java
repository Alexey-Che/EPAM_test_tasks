package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        Task7 k = new Task7();
        k.go();
    }

    private void go() {
        int k = ReadFromScanner.readOnlyPositiveFromScanner("размер массива *2 ");
        int[] mass = SetSequence.randomSequence(k * 2);
        System.out.println(Arrays.toString(mass));
        int max = Integer.MIN_VALUE;
        for (int i = 0, j = mass.length - 1; i < j; i++, j--) {
            max = Integer.max(max, mass[i] + mass[j]);
        }
        System.out.println(max);
    }
}
