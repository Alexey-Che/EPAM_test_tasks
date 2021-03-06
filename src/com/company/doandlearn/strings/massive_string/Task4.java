package com.company.doandlearn.strings.massive_string;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 k = new Task4();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("введите сроку для подсчета чисел");
        System.out.println(findNumbers(string));
    }

    private int findNumbers (String strings) {
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (isDigit(strings.charAt(i))) {
                if (i == strings.length() - 1 || !isDigit(strings.charAt(i + 1))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private boolean isDigit (char chars) {
        boolean isDigit = false;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < digits.length; i++) {
            if (chars == digits[i]) {
                isDigit = true;
                break;
            }
        }
        return isDigit;
    }
}
