package com.company.doandlearn.topicone.cycles;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("введите первое число");
        int b = ReadFromScanner.readOnlyPositiveFromScanner("введите второе число");
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);
        int[] aInt = goInt(aString);
        int[] bInt = goInt(bString);
        /*for (int i = 0; i < aString.length(); i++) {
            aInt[i] = aString.charAt(i) - '0';
        }
        for (int i = 0; i < bString.length(); i++) {
            bInt[i] = bString.charAt(i) - '0';
        }*/
        /*HashSet<Integer> totalNumbers = new HashSet<Integer>();*/
        Set<Integer> totalNumbers = new HashSet<>();
        for (int d : aInt) {
            for (int g : bInt) {
                if (d == g) {
                    totalNumbers.add(g);
                }
            }
        }
        System.out.println(totalNumbers);
    }

    private static int[] goInt(String a) {
        int[] p = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            p[i] = a.charAt(i) - '0';
        }
        return p;
    }
}
