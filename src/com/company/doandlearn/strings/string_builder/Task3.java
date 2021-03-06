package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 k = new Task3();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("enter string for check palindrome");
        System.out.println(string);
        System.out.println("This string is palindrome? " + palindrome(string));
    }

    private boolean palindrome(String strings) {
        int n = strings.length();
        for (int i = 0; i < (n / 2); i++) {
            if (strings.charAt(i) != strings.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
