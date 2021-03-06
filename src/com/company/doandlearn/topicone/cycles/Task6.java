package com.company.doandlearn.topicone.cycles;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task6 {
    public static void main(String[] args) {
        String a = ReadFromScanner.readStringFromScanner("введите строку");
        char[] aArray = a.toCharArray();
        System.out.println(a.charAt(1) - '0' );
        for (int i = 0; i < a.length(); i++) {
            int k = Character.getNumericValue(a.charAt(i));
            int codePoint = (int) a.charAt(i);
            String result = String.format("%s   %d    %d", a.charAt(i), k, codePoint);
            System.out.println(result);
            /*System.out.println(a.charAt(i) + " = " + k + " " + codePoint);*/
        }

        /*int guess = 456;
        String temp = Integer.toString(guess);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
            System.out.println(newGuess[i]);
        }*/
        /*int a = '4';
        int b = '0';
        int c = '4' - '0';
        System.out.println(a);
        System.out.println('4');
        System.out.println(b);
        System.out.println(c);*/

    }
}

