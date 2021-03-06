package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        Task12 k = new Task12();
        k.go();
    }

    public void go() {
        int k = ReadFromScanner.readOnlyPositiveFromScanner("enter a number");
        int n = ReadFromScanner.readOnlyPositiveFromScanner("enter a number");
        int[] mass = new int[(int) Math.pow(k,2)];
        int count = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i + j == k && (i + j) < n) {
                    mass[count] = i;
                    count++;
                    mass[count] = j;
                    count++;
                }
            }
        }
        int[] result = Arrays.copyOf(mass,count);
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(result));
    }
}
