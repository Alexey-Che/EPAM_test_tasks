package com.company.doandlearn.basics_of_oop.task4.service;

import com.company.doandlearn.basics_of_oop.task4.cave.Cave;
import com.company.doandlearn.basics_of_oop.task4.treasure.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureService {

    public static void showAllTreasures(Cave cave) {
        int id = 1;
        for (Treasure treasure : cave.getTreasures()) {
            System.out.println(String.format("%-3d %-100s", id++, treasure));
        }
        System.out.println();
    }

    public static void chooseMostExpensive(Cave cave) {
        int highestPrice = 0;
        Treasure treasure = null;
        for (Treasure element : cave.getTreasures()) {
            if (element.getValue() > highestPrice) {
                highestPrice = element.getValue();
                treasure = element;
            }
        }
        System.out.println(treasure + "\n");
    }

    public static void showTreasuresWorth(Cave cave, int amount) {
        List<Treasure> treasures = new ArrayList<>();
        int sumOfTreasures = 0;
        for (Treasure element : cave.getTreasures()) {
            if (element.getValue() + sumOfTreasures <= amount) {
                sumOfTreasures += element.getValue();
                treasures.add(element);
            }
        }
        int id = 1;
        for (Treasure treasure : treasures) {
            System.out.println(String.format("%-3d %-100s", id++, treasure));
        }
        System.out.println();
    }

    public static List<Treasure> readFileAndSetTreasures(int numberOfTreasures) {
        List<Treasure> treasures = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src\\com\\company\\doandlearn" +
                    "\\basics_of_oop\\task4\\resources\\treasures_list.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine() && numberOfTreasures-- > 0) {
                String[] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];
                int treasureValue = Integer.parseInt(treasureLine[2]);
                String descriptionOfTreasure = treasureLine[3];
                switch (treasureType) {
                    case "Porcelain":
                        treasures.add(new Porcelain(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Necklace":
                        treasures.add(new Neck(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Combat Weapon":
                        treasures.add(new CombatWeapon(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Coin":
                        treasures.add(new Coin(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Gem":
                        treasures.add(new Gem(treasureName, treasureValue, descriptionOfTreasure));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Treasure information file not found.");
        }
        return treasures;
    }
}
