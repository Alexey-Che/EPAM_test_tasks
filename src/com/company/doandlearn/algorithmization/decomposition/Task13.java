package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task13 {
    public static void main(String[] args) {
        Task13 k = new Task13();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readOnlyPositiveFromScanner("enter a number");
        for (int i = n; i < n * 2; i++) {
            if (isSimple(i) && isSimple(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }

    private boolean isSimple(int a) {
        if (a <= 0) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
