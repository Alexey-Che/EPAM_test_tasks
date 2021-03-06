package com.company.doandlearn.strings.massive_string;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 k = new Task3();
        k.go();
    }

    public void go() {
        String string = ReadFromScanner.readStringFromScanner("введите сроку для подсчета цифр");
        findDigits(string);
    }

    private void findDigits(String a) {
        char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (a.charAt(i) == array[j]) {
                    counter++;
                }
            }
        }
        System.out.print("quantity of digits is " + counter);
    }
}
