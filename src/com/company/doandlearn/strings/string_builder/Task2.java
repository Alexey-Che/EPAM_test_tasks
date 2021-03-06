package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 k = new Task2();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("в введенной строке после символа \"a\" довабиться \"b\" ");
        System.out.println(string);
        System.out.println(addBafterA(string, 'a', 'b'));
    }

    private String addBafterA(String text, char symbolBefore, char symbolAfter) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            char posSymbol;
            for (int i = 0; i < text.length(); i++) {
                posSymbol = text.charAt(i);
                stringBuilder.append(posSymbol);
                if (posSymbol == symbolBefore) {
                    stringBuilder.append(symbolAfter);
                }
            }
        }
        return stringBuilder.toString();
    }
}
