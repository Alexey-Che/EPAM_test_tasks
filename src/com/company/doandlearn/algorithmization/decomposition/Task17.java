package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task17 {
    public static void main(String[] args) {
        Task17 k = new Task17();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readOnlyPositiveFromScanner("enter a number");
        int count = 0;
        while (n != 0) {
            n -= sumOfDigits(n);
            count++;
        }
        System.out.println("Количество вычитаний = " + count);
    }

    public int sumOfDigits(int a) {
        String aString = Integer.toString(a);
        int[] aInt = goInt(aString);
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
