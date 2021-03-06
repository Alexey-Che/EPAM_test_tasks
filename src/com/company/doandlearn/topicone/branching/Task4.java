package com.company.doandlearn.topicone.branching;

public class Task4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int x = 8;
        int y = 9;
        int z = 9;
        boolean result = false;
        if (a>x&&b>y||a>x&&b>z||a>z&&b>y||b>x&&a>y||b>x&&a>z||b>z&&b>y) {
            result = true;
        }
        System.out.println(result);
    }
}
