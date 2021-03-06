package com.company.doandlearn.basics_of_oop.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<Product> products;

    public Payment() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double calcTotalPrice(List<Product> products) {
        double total = 0;
        for(Product product: products) {
            total+=product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Your purchase: \n"
                + products +"\b\b---------------------\n" + "Total price: "+ calcTotalPrice(products) + "$";
    }

    public class Product {

        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("\b\b%s, price: %.2f$ \n\b\b ", name, price);
        }
    }
}
