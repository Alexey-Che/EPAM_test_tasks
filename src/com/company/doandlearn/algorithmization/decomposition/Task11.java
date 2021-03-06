package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task11 {
    public static void main(String[] args) {
        Task11 k = new Task11();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readOnlyPositiveFromScanner("enter a first number");
        int m = ReadFromScanner.readOnlyPositiveFromScanner("enter a second number");
        String nString = Integer.toString(n);
        String mString = Integer.toString(m);
        int[] first = goInt(nString);
        int[] second = goInt(mString);
        if (first.length > second.length) {
            System.out.println("в первом числе " + n + "( " + first.length + " ) цифр больше чем во втором " + m + "( " + second.length + " )");
        } else {
            System.out.println("в первом числе " + n + "( " + first.length + " ) цифр меньше чем во втором " + m + "( " + second.length + " )");
        }

    }

    private static int[] goInt(String a) {
        int[] p = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            p[i] = a.charAt(i) - '0';
        }
        return p;
    }
}
