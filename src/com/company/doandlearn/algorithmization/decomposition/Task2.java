package com.company.doandlearn.algorithmization.decomposition;

public class Task2 {
    public static void main(String[] args) {
        Task2 k = new Task2();
        k.go();
    }

    public void go() {
        int a1=78, a2=294, a3=570, a4=36;
        int nod = Task1.nod(Task1.nod(Task1.nod(a1,a2),a3),a4);
        System.out.println(nod);
    }
}
