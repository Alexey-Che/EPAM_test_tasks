package com.company.doandlearn.topicone;

import java.util.Scanner;

public class ReadFromScanner {

    public static int readIntFromScanner(String outPrint) {
        Scanner in = new Scanner(System.in);
        System.out.print(outPrint);
        int a = in.nextInt();
        System.out.println("You entered int " + a);
        in.close();
        return a;
    }

    public static int readOnlyPositiveFromScanner(String outPrint) {
        int x = 0;
        do {
            x = readIntFromScanner(outPrint);
        } while (x <= 0);
        return x;
    }

    public static String readStringFromScanner(String outPrint) {
        Scanner in = new Scanner(System.in);
        System.out.print(outPrint);
        String a = in.nextLine();
        System.out.println("Вы ввели " + a);
        return a;
    }

    public static int readOnlyPositiveEvenFromScanner(String outPrint) {
        int x = 0;
        do {
            x = readIntFromScanner(outPrint);
        } while (x <= 0 || x % 2 != 0);
        return x;
    }


}
