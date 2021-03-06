package com.company.doandlearn.classes.agregation.task3;

import java.util.List;

public class Region {

    private String name;
    private City regionalCenter;
    private List<District> districts;

    public Region(String name, City regionalCenter, List<District> districts) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.districts = districts;
    }

    public int getAreaOfRegion() {
        int sum=0;
        for (District distrist: districts) {
            sum+=distrist.getArea();
        }
        sum+=regionalCenter.getArea();
        return sum;
    }

    public String getName() {
        return name;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
