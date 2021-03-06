package com.company.doandlearn.topicone.branching;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task5 {
    public static void main(String[] args) {
        int x = ReadFromScanner.readIntFromScanner("enter x");
        double y;
        if (x <= 3) {
            y = Math.pow(x, 2) - 3 * x + 9;
        } else {
            y = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("F(x) = " + y);
    }
}
