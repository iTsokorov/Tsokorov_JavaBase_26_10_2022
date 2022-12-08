package com.hillel.tsokorov.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        int shuttles;
        int countShuttles = 0;

        for (shuttles = 100; shuttles > 0; shuttles--) {
            if (shuttles % 10 == 4 || shuttles % 10 == 9) {
                continue;
            }
            if (shuttles / 10 == 4 || shuttles / 10 == 9) {
                continue;
            }
            if (shuttles / 10 / 10 == 4 || shuttles / 10 / 10 == 9) {
                continue;
            }
            if (shuttles / 10 % 10 == 4 || shuttles / 10 % 10 == 9) {
                continue;
            }
            countShuttles++;
        }
        System.out.println("Count of shuttles - " + countShuttles);
    }
}
