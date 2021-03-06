package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        Task8 k = new Task8();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("set size massive");
        int[] mass = new int[a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mass));
        int k = checkKoutOfIndex(mass.length);
        int sum = 0;
        for (int i = k; i < k + 3; i++) {
            sum += mass[i];
        }
        System.out.println("Сумма трех последовательных элементов = " + sum);
    }

    public int checkKoutOfIndex(int a) {
        int k = 0;
        do {
            k = ReadFromScanner.readOnlyPositiveFromScanner("set number of index massive");
        } while (k < 0 || k > a - 3);
        return k;
    }
}
