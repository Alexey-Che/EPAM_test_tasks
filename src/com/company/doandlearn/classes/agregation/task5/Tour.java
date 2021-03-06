package com.company.doandlearn.classes.agregation.task5;

public class Tour {

    private String country;
    private String city;
    private TourType type;
    private Transport transport;
    private Food food;
    private int numberOfDays;
    private double price;

    public Tour(String country, String city, TourType type, Transport
            transport, Food food, int numberOfDays, double price) {
        this.country = country;
        this.city = city;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public TourType getType() {
        return type;
    }

    public Transport getTransport() {
        return transport;
    }

    public Food getFood() {
        return food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setType(TourType type) {
        this.type = type;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", transport=" + transport +
                ", food=" + food +
                ", numberOfDays=" + numberOfDays +
                ", price=" + price +
                '}';
    }
}
