package com.hillel.tsokorov.homeworks.homework5;

public class ChinaDynasty {
    public static void main(String[] args) {

        // Li's army
        int warriorOfLi = 13; // 11 180
        int archerOfLi = 24; // 20 640
        int riderOfLi = 46; // 39 560

        int countOfEveryTypeLi = 860;

        int strongArmyLi = countOfEveryTypeLi * warriorOfLi +
                countOfEveryTypeLi * archerOfLi +
                countOfEveryTypeLi * riderOfLi;

        System.out.println("Common attack of Li's army = " + strongArmyLi);

        // Min's army

        int warriorOfMin = 9; // 11 610
        int archerOfMin = 35; // 45 150
        int riderOfMin = 12; // 15 480

        double countOfEveryTypeMin = countOfEveryTypeLi * 1.5; // 1290

        int strongArmyMin = (int) (countOfEveryTypeMin * warriorOfMin +
                        countOfEveryTypeMin * archerOfMin +
                        countOfEveryTypeMin * riderOfMin);

        System.out.println("Common attack of Min's army = " + strongArmyMin);

        if (strongArmyLi > strongArmyMin) {
            System.out.println("Army of Li is stronger");
        } else {
            System.out.println("Army of Min is stronger");
        }
    }
}
