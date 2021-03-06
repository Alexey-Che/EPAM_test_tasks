package com.company.doandlearn.basics_of_oop.task2;

public class PaymentMain {

    public static void main(String[] args) {

        Payment check = new Payment();

        Payment.Product p1 = check.new Product("car", 156.42);
        check.addProduct(p1);
        System.out.println(check);



        /*Payment.Product p1 = new Payment.Product("car", 156.42);
        Payment.Product p2 = new Payment.Product("hair dryer", 1356.48);
        Payment.Product p3 = new Payment.Product("microwave", 116.57);
        Payment.Product p4 = new Payment.Product("oven", 1123.39);
        Payment.Product p5 = new Payment.Product("house", 756.25);

        Payment check = new Payment();
        check.addProduct(p1);
        check.addProduct(p2);
        check.addProduct(p3);
        check.addProduct(p4);
        check.addProduct(p5);

        System.out.println(check);*/
    }
}

