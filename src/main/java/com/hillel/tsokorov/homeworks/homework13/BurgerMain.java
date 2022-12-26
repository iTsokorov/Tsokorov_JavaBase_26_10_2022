package com.hillel.tsokorov.homeworks.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger ordinaryBurger = new Burger("roll", "meat",
                "green", "cheese", "mayonnaise");

        Burger dietBurger = new Burger("roll", "meat", "green", "cheese");

        Burger doubleMeatBurger = new Burger("roll", "meat", "additionalMeat",
                "green", "cheese", "mayonnaise");
    }
}
