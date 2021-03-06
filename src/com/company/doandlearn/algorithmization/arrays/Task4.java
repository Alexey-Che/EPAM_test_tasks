package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Task4 k = new Task4();
        k.go();
    }

    private void go() {
        int[] mass = SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        System.out.println(Arrays.toString(mass));
        int minIndex = 0;
        int maxIndex = 0;
        int max = mass[maxIndex];
        int min = mass[minIndex];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < mass[minIndex]) {
                minIndex = i;
            }
            if (mass[i] > mass[maxIndex]) {
                maxIndex = i;
            }
        }
        min = mass[minIndex];
        max = mass[maxIndex];
        System.out.println(max);
        System.out.println(min);
        mass[minIndex] = max;
        mass[maxIndex] = min;
        System.out.println(Arrays.toString(mass));
        /*Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        int max = mass[0];
        int min = mass[mass.length-1];
        mass[0] = min;
        mass[mass.length-1] = max;
        System.out.println(Arrays.toString(mass));*/
    }
}
