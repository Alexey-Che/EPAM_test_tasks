package com.company.doandlearn.algorithmization.sorting;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Task1 k = new Task1();
        k.go();
    }

    public void go() {
        int[] a = {0,1,2,3,4};
        int[] b = {10,11,12};
        int k = 2;
        int m = a.length;
        int n = b.length;
        int y = m+n;
       /* int[] aCopy = Arrays.copyOf(a, a.length+b.length);
        System.out.println(Arrays.toString(aCopy));*/
       int[] c = new int[y];
       int index = 0;
       for (int i = 0; i < m; i++) {
           if (i !=k) {
               c[index++] = a[i];
           } else {
               c[index++] = a[i];
               for (int value : b) {
                   c[index++] = value;
               }
           }
       }
        System.out.println(Arrays.toString(c));
    }
}
