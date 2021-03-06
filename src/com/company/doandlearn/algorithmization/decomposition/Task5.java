package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Task5 k = new Task5();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("set size massive");
        int[] mass = new int[a];
        //int[] mass = {99, 66, 13, 22, 87, 99, 87, 26, 19, 84, 19, 18, 99};
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 200 - 100);
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(calcPenultimateInt(mass));
    }

    public int calcPenultimateInt(int[] a) {
        int max = Integer.MIN_VALUE;
        int temp = Integer.MIN_VALUE;
        for (int i=0; i<a.length; i++) {
            if (a[i]> max) {
                max = a[i];
            }
            if (i==a.length-1) {
                for (int j=0; j<a.length; j++) {
                    if (a[j]> temp && a[j] < max) {
                        temp = a[j];
                    }
                }
            }
           /* if (a[i] > max) {
                temp = max;
                max = a[i];
            }
            if (i==a.length-1 && max == a[0]) {
                for (int j=1; j<a.length; j++) {
                    if (a[j] > temp && a[j] != max) {
                        temp = a[j];
                    }
                }
            }*/
        }
        return temp;
    }
}
