package com.hillel.tsokorov.homeworks.homework13;

public class Burger {

    String roll;
    String meat;
    String additionalMeat;
    String green;
    String cheese;
    String mayonnaise;

    public Burger(String roll, String meat, String green, String cheese, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.green = green;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println(infoOrdinaryBurger());
    }

    public Burger(String roll, String meat, String green, String cheese) {
        this.roll = roll;
        this.meat = meat;
        this.green = green;
        this.cheese = cheese;
        System.out.println(infoDietBurger());
    }

    public Burger(String roll, String meat, String additionalMeat, String green, String cheese, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.additionalMeat = additionalMeat;
        this.green = green;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println(infoDoubleMeatBurger());
    }

    public String infoOrdinaryBurger() {
        return "Ordinary burger composition: " +
                roll +
                ", " + meat +
                ", " + green +
                ", " + cheese +
                ", " + mayonnaise;
    }

    public String infoDietBurger() {
        return "Diet burger composition: " +
                roll +
                ", " + meat +
                ", " + green +
                ", " + cheese;
    }

    public String infoDoubleMeatBurger() {
        return "Double meat burger composition: " +
                roll +
                ", " + meat +
                ", " + additionalMeat +
                ", " + green +
                ", " + cheese +
                ", " + mayonnaise;
    }
}
