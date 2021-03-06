package com.company.doandlearn.topicone.linear;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int x = readIntFromScanner("pls enter x");
        int y = readIntFromScanner("pls enter y");
        boolean b;
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0 || x >= -2 && x <= 2 && y >= 0 && y <= 3) {
            b = true;
        } else {
            b = false;
        }
        System.out.println(b);
    }

    private static int readIntFromScanner(String outPrint) {
        Scanner in = new Scanner(System.in);
        System.out.print(outPrint);
        int a = in.nextInt();
        System.out.println("You entered int " + a);
        return a;
    }
}
