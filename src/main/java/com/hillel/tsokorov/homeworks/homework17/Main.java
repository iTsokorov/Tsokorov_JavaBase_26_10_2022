package com.hillel.tsokorov.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        startDrinkMachine();

    }

    private static void startDrinkMachine() {
        double basket = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);

            DrinksMachine[] drinksMachine = DrinksMachine.values();
            String userChoice;
            DrinksMachine userDrinksMachine = null;


            while (true) {
                System.out.println("Please choose your drink from list: " + Arrays.toString(drinksMachine));
                System.out.println("Enter \"EXIT\" for finish");
                userChoice = scanner.nextLine().toUpperCase();
                if (userChoice.equals("EXIT")) {
                    System.out.println("Count of your drinks: " + Drinks.getCounterDrinks());
                    System.out.println("For payment: " + basket + '\u20b4');
                    break;
                }

                for (DrinksMachine drinks : drinksMachine) {
                    if (drinks.toString().equals(userChoice)) {
                        userDrinksMachine = DrinksMachine.valueOf(userChoice);
                        break;
                    }
                }
                if (userDrinksMachine != null) {
                    break;
                }
            }

            if (userDrinksMachine == null) {
                break;
            }


            switch (userDrinksMachine) {
                case TEA: {
                    new Drinks();
                    Drinks.prepareTea();
                    System.out.println(DrinksMachine.TEA.getTitle() + " added to basket. " +
                            "Basket status: " + (basket += Drinks.getTEA_PRICE()) + '\u20b4');
                    break;
                }
                case COFFEE: {
                    new Drinks();
                    Drinks.prepareCoffee();
                    System.out.println(DrinksMachine.COFFEE.getTitle() + " added to basket. " +
                            "Basket status: " + (basket += Drinks.getCOFFEE_PRICE()) + '\u20b4');
                    break;
                }
                case LEMONADE: {
                    new Drinks();
                    Drinks.prepareLemonade();
                    System.out.println(DrinksMachine.LEMONADE.getTitle() + " added to basket. " +
                            "Basket status: " + (basket += Drinks.getLEMONADE_PRICE()) + '\u20b4');
                    break;
                }
                case MOJITO: {
                    new Drinks();
                    Drinks.prepareMojito();
                    System.out.println(DrinksMachine.MOJITO.getTitle() + " added to basket. " +
                            "Basket status: " + (basket += Drinks.getMOJITO_PRICE()) + '\u20b4');
                    break;
                }
                case MINERAL_WATER: {
                    new Drinks();
                    Drinks.prepareMineralWater();
                    System.out.println(DrinksMachine.MINERAL_WATER.getTitle() + " added to basket. " +
                            "Basket status: " + (basket += Drinks.getMINERAL_WATER_PRICE()) + '\u20b4');
                    break;
                }
                case COCA_COLA: {
                    new Drinks();
                    Drinks.prepareCocaCola();
                    System.out.println(DrinksMachine.COCA_COLA.getTitle() + " added to basket. " +
                            "Basket status: " + (basket += Drinks.getCOCA_COLA_PRICE()) + '\u20b4');
                    break;
                }

            }

        }

    }

}
