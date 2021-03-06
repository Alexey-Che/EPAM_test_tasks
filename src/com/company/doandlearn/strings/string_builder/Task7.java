package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 k = new Task7();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("enter string");
        String a = deleteSpace(string);
        System.out.println(deleteSpace(string));

        System.out.println(deleteRepeatingCharacters(a));
    }

    private String deleteSpace(String a) {
        StringBuilder stringBuilder = new StringBuilder(a);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char symbol = stringBuilder.charAt(i);
            if (symbol == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        return stringBuilder.toString();
    }

    private String deleteRepeatingCharacters(String a) {
        StringBuilder stringBuilder = new StringBuilder(a);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char symbol = stringBuilder.charAt(i);
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) == symbol) {
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
        }
        return stringBuilder.toString();
    }
}
