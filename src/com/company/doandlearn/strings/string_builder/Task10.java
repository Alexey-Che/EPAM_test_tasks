package com.company.doandlearn.strings.string_builder;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        Task10 k = new Task10();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("enter string");
        String[] mass = string.split("[.?!]");
        System.out.println(Arrays.toString(mass));
        System.out.println(mass.length);
    }
}
