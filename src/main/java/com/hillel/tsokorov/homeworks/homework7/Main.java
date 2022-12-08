package com.hillel.tsokorov.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11);

        System.out.println("Computer thought of a random number from 0 to 10. Try to guess it!");

        int countOfTries = 3;
        System.out.println("WARNING! YOU HAVE " + countOfTries + " TRIES!");

        System.out.println("Please enter some number from 0 to 10.");

        int numberOfUser;

        for (int tryOfUser = 1; tryOfUser <= countOfTries; tryOfUser++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    numberOfUser = scanner.nextInt();
                    if (numberOfUser >= 0 && numberOfUser <= 10) {
                        break;
                    } else {
                        System.out.println("Please enter number from 0 to 10.");
                    }
                } else {
                    System.out.println("Wrong data! Try again!");
                }
                scanner.nextLine();
            }

            if (numberOfUser == randomNumber) {
                System.out.println("Your number - " + numberOfUser + ".");
                System.out.println("Random number of computer - " + randomNumber + ".");
                System.out.println("YOU WIN!");
                break;
            }
            if (tryOfUser == countOfTries) {
                System.out.println("Sorry, it was your last try.");
                System.out.println("YOU LOSE!");
                break;
            }
            if (numberOfUser < randomNumber) {
                System.out.println("Try a bigger number.");
                continue;
            }
            if (numberOfUser > randomNumber) {
                System.out.println("Try a smaller number.");
                continue;
            }
        }
    }
}



