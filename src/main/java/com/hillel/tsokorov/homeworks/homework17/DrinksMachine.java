package com.hillel.tsokorov.homeworks.homework17;

public enum DrinksMachine {

    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL_WATER("Mineral water"),
    COCA_COLA("Coca-Cola");

    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
