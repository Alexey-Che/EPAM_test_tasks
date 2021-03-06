package com.company.doandlearn.basics_of_oop.task4;

import com.company.doandlearn.basics_of_oop.task4.cave.Cave;
import com.company.doandlearn.basics_of_oop.task4.cave.Dragon;
import com.company.doandlearn.basics_of_oop.task4.console.Console;

public class Runner {
    public static void main(String[] args) {

        Cave cave = new Cave("cave", new Dragon("dragon"));
        cave.setNumberOfTreasure(100);
        Console.startConsoleMenu(cave);
    }
}
