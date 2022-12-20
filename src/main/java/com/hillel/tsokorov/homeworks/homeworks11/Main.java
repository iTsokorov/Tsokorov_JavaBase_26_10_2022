package com.hillel.tsokorov.homeworks.homeworks11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int M;
        int N;

        System.out.println("You have to put two value for array.");
        System.out.println("Please enter two numbers from 1 to 10.");

        while(true) {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                    if (M >= 1 && M <= 10) {
                        break;
                    } else {
                        System.out.println("Please enter two numbers from 1 to 10");
                    }
                } else {
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
            scanner.nextLine();
        }

        System.out.println("First value: " + '[' + M + ']');

        while(true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 1 && N <= 10) {
                    break;
                } else {
                    System.out.println("Please enter two numbers from 1 to 10");
                }
            } else {
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
            scanner.nextLine();
        }

        System.out.println("Second value: " + '[' + N + ']');

        System.out.println();

        int[][] array1 = new int[M][N];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("BEFORE TRANSPOSE:");
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        int[][] array2 = new int[N][M];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
            array2[j][i] = array1[i][j];
            }
        }

        System.out.println();

        System.out.println("AFTER TRANSPOSE:");
        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
