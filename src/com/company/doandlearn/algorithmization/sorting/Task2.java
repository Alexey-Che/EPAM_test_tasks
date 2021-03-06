package com.company.doandlearn.algorithmization.sorting;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Task2 k = new Task2();
        k.go();
    }

    public void go() {
        int[] a = {1,3,6,8,9,11,15,20,22,23,24};
        int[] b = {2,5,7,10,12,14,16,21,22};
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < result.length; i++) {
            if (aIndex == a.length) {
                result[i] = b[bIndex];
                bIndex++;
            } else if (bIndex == b.length) {
                result[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                result[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] > b[bIndex]) {
                result[i] = b[bIndex];
                bIndex++;
            } else  {
                result[i] = a[aIndex];
                aIndex++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
