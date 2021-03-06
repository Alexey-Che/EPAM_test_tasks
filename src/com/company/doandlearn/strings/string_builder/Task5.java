package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task5 {
    public static void main(String[] args) {
        Task5 k = new Task5();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("enter string");
        System.out.println(string);
        System.out.println("number of letters a = " + counter(string, 'a'));
    }

    private int counter(String string, char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
