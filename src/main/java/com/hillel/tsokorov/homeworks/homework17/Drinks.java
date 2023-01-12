package com.hillel.tsokorov.homeworks.homework17;

public class Drinks {

    private static int counterDrinks;
    private static final double TEA_PRICE = 15.99;
    private static final double COFFEE_PRICE = 20.99;
    private static final double LEMONADE_PRICE = 13.99;
    private static final double MOJITO_PRICE = 40.99;
    private static final double MINERAL_WATER_PRICE = 10.99;
    private static final double COCA_COLA_PRICE = 16.99;

    public Drinks() {
        counterDrinks++;
    }

    public static int getCounterDrinks() {
        return counterDrinks;
    }

    public static double getTEA_PRICE() {
        return TEA_PRICE;
    }

    public static double getCOFFEE_PRICE() {
        return COFFEE_PRICE;
    }

    public static double getLEMONADE_PRICE() {
        return LEMONADE_PRICE;
    }

    public static double getMOJITO_PRICE() {
        return MOJITO_PRICE;
    }

    public static double getMINERAL_WATER_PRICE() {
        return MINERAL_WATER_PRICE;
    }

    public static double getCOCA_COLA_PRICE() {
        return COCA_COLA_PRICE;
    }

    public static void prepareTea() {
        System.out.println("Tea preparing...");
    }

    public static void prepareCoffee() {
        System.out.println("Coffee preparing...");
    }

    public static void prepareLemonade() {
        System.out.println("Lemonade preparing...");
    }

    public static void prepareMojito() {
        System.out.println("Mojito preparing...");
    }

    public static void prepareMineralWater() {
        System.out.println("Mineral water preparing...");
    }

    public static void prepareCocaCola() {
        System.out.println("Coca-Cola preparing...");
    }
}
