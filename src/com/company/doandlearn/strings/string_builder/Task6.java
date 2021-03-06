package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 k = new Task6();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("enter string");
        System.out.println(string);
        System.out.println(cloneChar(string));
    }

    private static String cloneChar(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        if (a != null) {
            char posSymbol;
            for (int i = 0; i < a.length(); i++) {
                posSymbol = a.charAt(i);
                stringBuilder.append(posSymbol).append(posSymbol).append(posSymbol);
            }
        }
        return stringBuilder.toString();
    }
}

