package com.company.doandlearn.classes.classandobject.task2;

public class Test2 {
    private Double money;
    private Long height;

    public Test2(Double money, Long height) {
        this.money = money;
        this.height = height;
    }

    public Test2() {
        money = 10.5;
        height = 50L;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Double getMoney() {
        return money;
    }

    public Long getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "money=" + money +
                ", height=" + height +
                '}';
    }
}
