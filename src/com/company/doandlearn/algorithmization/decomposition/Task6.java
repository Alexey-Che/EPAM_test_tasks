package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 k = new Task6();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("enter first number");
        int b = ReadFromScanner.readOnlyPositiveFromScanner("enter second number");
        int c = ReadFromScanner.readOnlyPositiveFromScanner("enter third number");
        System.out.println("Числа простые " + isSimple(a, b, c));
    }

    public boolean isSimple(int a, int b, int c) {
        return Task1.nod(a, b) == 1 && Task1.nod(c, b) == 1 && Task1.nod(a, c) == 1;
    }
}
