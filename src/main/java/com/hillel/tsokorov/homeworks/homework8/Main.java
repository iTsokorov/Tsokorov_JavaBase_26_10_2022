package com.hillel.tsokorov.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        int countOfLuckyShuttles = 0;
        int shuttles = 0;

        for (int i = 1; ; i++) {
            if (i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            if (i / 10 % 10 == 4 || i / 10 % 10 == 9){
                continue;
            }
            System.out.println("Number of shuttle: " + i);
            countOfLuckyShuttles++;
            shuttles++;
            if (shuttles == 100) {
                break;
            }
        }
        System.out.println("Count of lucky shuttles - " + countOfLuckyShuttles);

    }
}
