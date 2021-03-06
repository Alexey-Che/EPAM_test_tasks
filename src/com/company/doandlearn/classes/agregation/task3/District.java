package com.company.doandlearn.classes.agregation.task3;

import java.util.List;

public class District {

    private String name;
    private List<City> cities;

    public District(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public int getArea() {
        int sum = 0;
        for (City city : cities) {
            sum += city.getArea();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
