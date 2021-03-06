package com.company.doandlearn.basics_of_oop.task4.cave;

import com.company.doandlearn.basics_of_oop.task4.service.TreasureService;
import com.company.doandlearn.basics_of_oop.task4.treasure.Treasure;

import java.util.List;

public class Cave {

    private String name;
    private int numberOfTreasure;
    private List<Treasure> treasures;
    private Dragon dragon;

    public Cave(String name, Dragon dragon) {
        this.name = name;
        this.dragon = dragon;
        this.numberOfTreasure = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTreasure() {
        return numberOfTreasure;
    }

    public void setNumberOfTreasure(int numberOfTreasure) {
        this.numberOfTreasure = numberOfTreasure;
        this.treasures = TreasureService.readFileAndSetTreasures(numberOfTreasure);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }
}
