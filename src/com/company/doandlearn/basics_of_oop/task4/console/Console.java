package com.company.doandlearn.basics_of_oop.task4.console;

import com.company.doandlearn.basics_of_oop.task4.cave.Cave;
import com.company.doandlearn.basics_of_oop.task4.service.TreasureService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    public static void startConsoleMenu(Cave cave) {
        int choice;
        boolean isStopped = false;
        while (!isStopped) {
            printOptions();
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = makeChoice();
            isStopped = operationPerformed(cave, choice);
        }
    }

    private static void printOptions() {
        String menuText = "Available operations:\n" +
                "1 - Show all treasures;\n" +
                "2 - Choose the most expensive treasure;\n" +
                "3 - Select treasures for a given amount;\n" +
                "4 - Close application.";
        System.out.println(menuText);
    }

    private static int makeChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > 4 || choice < 1) {
                System.out.println("There is no such option. Repeat entry.\n");
                printOptions();
            } else {
                return choice;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again.\n");
            printOptions();
        }
        return -1;
    }

    private static boolean operationPerformed(Cave cave, int choice) {
        switch (choice) {
            case 1:
                System.out.println("List of treasures in the cave:");
                TreasureService.showAllTreasures(cave);
                break;
            case 2:
                System.out.println("The most expensive treasure:");
                TreasureService.chooseMostExpensive(cave);
                break;
            case 3:
                System.out.println("Enter the total amount of treasures");
                Scanner scanner = new Scanner(System.in);
                try {
                    int amount = scanner.nextInt();
                    TreasureService.showTreasuresWorth(cave, amount);
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Try again.");
                }
                break;
            case 4:
                System.out.println("The work is completed.\nGoodbye");
                return true;
        }
        return false;
    }
}
