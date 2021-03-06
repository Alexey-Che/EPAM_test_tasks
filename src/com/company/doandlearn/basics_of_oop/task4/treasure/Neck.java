package com.company.doandlearn.basics_of_oop.task4.treasure;

public class Neck extends Treasure {

    private String descriptionOfTreasure;

    public Neck(String name, int value, String descriptionOfTreasure) {
        super.setName(name);
        super.setValue(value);
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    @Override
    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-40s value: %-5d description: %-40s", "Neck:", super.getName(), super.getValue(),descriptionOfTreasure);
    }
}
