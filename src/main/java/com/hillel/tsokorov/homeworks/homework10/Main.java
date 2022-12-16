package com.hillel.tsokorov.homeworks.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayLottery = new int[7];
        int[] arrayPlayer = new int[7];

        for (int i = 0; i < arrayLottery.length; i++) {
            arrayLottery[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(arrayLottery);
        System.out.println("Lottery numbers: " + Arrays.toString(arrayLottery));

        for (int i = 0; i < arrayPlayer.length; i++) {
            arrayPlayer[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(arrayPlayer);
        System.out.println("Player numbers: " + Arrays.toString(arrayPlayer));

        int accordance = 0;

        for (int i = 0; i < arrayLottery.length; i++) {
            if (arrayLottery[i] == arrayPlayer[i]) {
                accordance++;

            }
        }
        System.out.println("Number of matches: " + accordance);
    }
}
