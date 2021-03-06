package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        Task10 k = new Task10();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readOnlyPositiveFromScanner("enter a number");
        String nString = Integer.toString(n);
        int[] nInt = convertStrToInt(nString);
        System.out.println(Arrays.toString(nInt));
    }

    private static int[] convertStrToInt(String a) {
        int[] p = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            p[i] = a.charAt(i) - '0';
        }
        return p;
    }
}
