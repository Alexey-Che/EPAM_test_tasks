package com.company.doandlearn.algorithmization.decomposition;

public class Task1 {
    public static void main(String[] args) {
        Task1 k = new Task1();
        k.go();
    }

    public void go() {
        System.out.println(nod(45,15));
        System.out.println(nok(45,15));



    }

    public static int nok(int a, int b) {
        return (a*b)/nod(a,b);
    }

    /*
    @param a первый параметр
     */
    public static int nod(int a, int b) { // алгоритм Евклида
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            d = a + b;
        }
        return d;
    }
}
