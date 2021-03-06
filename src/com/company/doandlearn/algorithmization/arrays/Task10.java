package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        Task10 k = new Task10();
        k.go();
    }

    private void go() {
        int[] mass = SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        System.out.println(Arrays.toString(mass));
        /*for (int i=1; i<mass.length; i++) {
            if (i%2==1) {
                mass[i] = 0;
            }
        }*/
        System.out.println(Arrays.toString(getLessArray(mass)));

    }
    public int[] getLessArray(int[] data) {
        if (data.length < 2) {
            return data;
        }
        int count = 1;
        for (int i = 2; i < data.length; i += 2) {
            data[count] = data[i];
            count++;
        }
        for (int i = count; i < data.length; i++) {
            data[i] = 0;
        }
        return data;
    }
}
