package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task16 {
    public static void main(String[] args) {
        Task16 k = new Task16();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readOnlyPositiveFromScanner("enter a number of digits");
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (isAllOddNumbers(i)) {
                sum += i;
            }
        }
        int evenSum = calcEvenNumbersOfSum(sum);
        System.out.println(String.format("Сумма %d значных чисел содержащих только нечетные цифры равна %d , в ней %d четных цифр", n, sum, evenSum));
    }

    public boolean isAllOddNumbers(int a) {
        String aString = Integer.toString(a);
        int[] aInt = goInt(aString);
        for (int d : aInt) {
            if (d % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public int calcEvenNumbersOfSum(int a) {
        String aString = Integer.toString(a);
        int[] aInt = goInt(aString);
        int count = 0;
        for (int d : aInt) {
            if (d % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int[] goInt(String a) {
        int[] p = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            p[i] = a.charAt(i) - '0';
        }
        return p;
    }
}
