package com.company.doandlearn.topicone.branching;

public class Task2 {
    static int min(int a, int b) {
        return a < b ? a : b;
    }
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 19;
        int d = 2;
        int min1 = Math.min(a,b);
        int min2 = Math.min(c,d);
        int max = max(min1, min2);
        int max2 = max(min(a,b),min(c,d));
        System.out.println(max);
    }
}
