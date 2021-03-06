package com.company.doandlearn.strings.string_builder;

public class Task4 {
    public static void main(String[] args) {
        Task4 k = new Task4();
        k.go();
    }

    public void go() {
        String word = "информатика";
        System.out.println(turnOut(word));
    }

    private static String turnOut (String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += cake;
        return cake;
    }
}
