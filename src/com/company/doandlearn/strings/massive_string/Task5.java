package com.company.doandlearn.strings.massive_string;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task5 {
    public static void main(String[] args) {
        Task5 k = new Task5();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("введите сроку для подсчета чисел");
        /*String a = string.trim();
        System.out.println(a);*/
        System.out.println(replaceSpaces(string));
    }

    private static String replaceSpaces(String string) {
        StringBuilder strBuilder = new StringBuilder();
        String str = string.trim();
        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(str.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }

    /*public static String format(String format, Object... args, List a) {
        return new Formatter().format(format, args).toString();
    }*/
}
