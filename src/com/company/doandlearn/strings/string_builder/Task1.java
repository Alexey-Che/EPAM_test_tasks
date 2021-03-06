package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 k = new Task1();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("введите сроку для подсчета пробелов");
        System.out.println(string);
        System.out.println("наибольшее количество идущих продряд пробелов = " + calcSpaces(string));
    }

    public int calcSpaces(String string) {
        int count = 0;
        int maxCount = 0;
        for (int i=0; i<string.length();i++) {
            if (string.charAt(i) == ' ') {
                count++;
            } else {
                if (maxCount<count) {
                    maxCount= count;
                }
                count = 0;
            }
        }
        return maxCount;
    }
}
