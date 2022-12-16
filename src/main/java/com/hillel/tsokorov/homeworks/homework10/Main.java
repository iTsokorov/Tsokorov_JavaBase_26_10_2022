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
        int[] savedElements = new int[0];

        for (int i = 0; i < arrayLottery.length; i++) {
            if (arrayLottery[i] == arrayPlayer[i]) {
                accordance++;
                int oldLength = savedElements.length;
                savedElements = Arrays.copyOf(savedElements, oldLength + 1);
                savedElements[oldLength] = i;
            }
        }
        System.out.println("Elements matched: " + Arrays.toString(savedElements));
        System.out.println("Count of matches: " + accordance);
    }
}
