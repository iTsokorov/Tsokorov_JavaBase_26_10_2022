package com.hillel.tsokorov.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        int countOfLuckyShuttles = 0;
        int shuttles = 100;

        for (int i = 1; i <= shuttles; i++) {
            if (i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            if (i / 10 % 10 == 4 || i / 10 % 10 == 9){
                continue;
            }
            System.out.println("Number of shuttle: " + i);
            countOfLuckyShuttles++;
        }
        System.out.println("Count of lucky shuttles - " + countOfLuckyShuttles);
        System.out.println("Count of unlucky shuttles - " + (shuttles - countOfLuckyShuttles));

    }
}
