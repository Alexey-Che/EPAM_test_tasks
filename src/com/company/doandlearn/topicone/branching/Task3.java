package com.company.doandlearn.topicone.branching;

public class Task3 {
    public static void main(String[] args) {
        int x1 =1;
        int y1 =1;
        int x2 =2;
        int y2 =2;
        int x3 =3;
        int y3 =3;
        if ((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)==0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}
