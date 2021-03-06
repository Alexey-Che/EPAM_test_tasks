package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task9 {
    public static void main(String[] args) {
        Task9 k = new Task9();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("enter string");
        System.out.println("count of small letters = " + findLowerCase(string));
        System.out.println("count of big letters = " + findUpperCase(string));
    }

    private int findLowerCase(String a) {
        /*StringBuilder stringBuilder = new StringBuilder(a);
        int count = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a' && stringBuilder.charAt(i) <= 'z') {
                count++;
            }
        }*//*
        return count;*/
        return findLetters(a, 'a', 'z');
    }

    private int findUpperCase(String a) {
        return findLetters(a, 'A', 'Z');
        /*StringBuilder stringBuilder = new StringBuilder(a);
        int count = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'A' && stringBuilder.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;*/
    }

    private int findLetters(String a, char from, char to) {
        StringBuilder stringBuilder = new StringBuilder(a);
        int count = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= from && stringBuilder.charAt(i) <= to) {
                count++;
            }
        }
        return count;
    }
}
