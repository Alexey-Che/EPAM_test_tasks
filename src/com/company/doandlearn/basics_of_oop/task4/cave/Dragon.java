package com.company.doandlearn.basics_of_oop.task4.cave;

public class Dragon {

    private String nameOfDragon;

    public Dragon(String nameOfDragon) {
        this.nameOfDragon = nameOfDragon;
    }

    public String getNameOfDragon() {
        return nameOfDragon;
    }

    public void setNameOfDragon(String nameOfDragon) {
        this.nameOfDragon = nameOfDragon;
    }

    @Override
    public String toString() {
        return "Dragon" + nameOfDragon;
    }
}
