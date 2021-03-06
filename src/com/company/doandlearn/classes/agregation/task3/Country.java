package com.company.doandlearn.classes.agregation.task3;

import java.util.List;

public class Country {

    private City capital;
    private String name;
    private List<Region> regions;

    public Country(City capital, String name, List<Region> regions) {
        this.capital = capital;
        this.name = name;
        this.regions = regions;
    }

    public int getAreaOfCountry() {
        int sum=0;
        for(Region region: regions) {
            System.out.print(region.getName()+"  ");
            System.out.println(region.getAreaOfRegion());
            sum+=region.getAreaOfRegion();
        }
        sum+=capital.getArea();
        return sum;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City getCapital() {
        return capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void printregionsCenter() {
        for(Region region: regions) {
            System.out.println(region.getRegionalCenter().getName());
        }
    }
}
