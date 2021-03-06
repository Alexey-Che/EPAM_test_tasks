package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Task2 k = new Task2();
        k.go();
    }

    private void go() {
        int[] mass = SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        int z = ReadFromScanner.readIntFromScanner("введите число");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > z) {
                mass[i] = z;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
