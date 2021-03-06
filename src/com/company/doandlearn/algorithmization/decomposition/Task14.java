package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task14 {
    public static void main(String[] args) {
        Task14 k = new Task14();
        k.go();
    }

    public void go() {
        int k = ReadFromScanner.readOnlyPositiveFromScanner("enter a number");
        for (int i = 1; i < k; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " число Армстронга");
            }
        }
    }

    public boolean isArmstrong(int a) {
        String aString = Integer.toString(a);
        int[] aInt = goInt(aString);
        int sum = getSum(aInt);
        if (Math.pow(sum, aInt.length) == a) {
            return true;
        } else {
            return false;
        }
    }

    private int getSum(int[] aInt) {
        int sum = 0;
        for (int i = 0; i < aInt.length; i++) {
            sum += aInt[i];
        }
        return sum;
    }

    private static int[] goInt(String a) {
        int[] p = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            p[i] = a.charAt(i) - '0';
        }
        return p;
    }
}
