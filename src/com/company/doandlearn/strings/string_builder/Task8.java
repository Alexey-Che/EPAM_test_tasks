package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task8 {
    public static void main(String[] args) {
        Task8 k = new Task8();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("enter string");
        System.out.println("Longest word is " + biggestWord(string));
    }

    private String biggestWord(String string) {
        String word = "";
        int maxLenght = 0;
        String[] words = string.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLenght) {
                maxLenght = words[i].length();
                word = words[i];
            }
        }
        return word;
    }
}
