package com.hillel.tsokorov.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter name of team 1");
        
        String teamName1 = scanner.nextLine();
        System.out.println("Name of team 1 - " + teamName1);

        int countPlayersTeam1 = 5;

        System.out.println("How many frags do have player 1 team 1?");
        int fragsPlayer1Team1 = scanner.nextInt();
        System.out.println("How many frags do have player 2 team 1?");
        int fragsPlayer2Team1 = scanner.nextInt();
        System.out.println("How many frags do have player 3 team 1?");
        int fragsPlayer3Team1 = scanner.nextInt();
        System.out.println("How many frags do have player 4 team 1?");
        int fragsPlayer4Team1 = scanner.nextInt();
        System.out.println("How many frags do have player 5 team 1?");
        int fragsPlayer5Team1 = scanner.nextInt();

        double countFragsTeam1 =  (fragsPlayer1Team1 + fragsPlayer2Team1 +fragsPlayer3Team1 +
                fragsPlayer4Team1 + fragsPlayer5Team1) / (double) countPlayersTeam1;

        System.out.println("Arithmetic average frags of team 1 - " + countFragsTeam1);



        System.out.println("Please, enter name of team 2");

        int countPlayersTeam2 = 5;

        scanner.nextLine();
        String teamName2 = scanner.nextLine();
        System.out.println("Name of team 2 - " + teamName2);

        System.out.println("How many frags do have player 1 team 2?");
        int fragsPlayer1Team2 = scanner.nextInt();
        System.out.println("How many frags do have player 2 team 2?");
        int fragsPlayer2Team2 = scanner.nextInt();
        System.out.println("How many frags do have player 3 team 2?");
        int fragsPlayer3Team2 = scanner.nextInt();
        System.out.println("How many frags do have player 4 team 2?");
        int fragsPlayer4Team2 = scanner.nextInt();
        System.out.println("How many frags do have player 5 team 2?");
        int fragsPlayer5Team2 = scanner.nextInt();

        double countFragsTeam2 = (fragsPlayer1Team2 + fragsPlayer2Team2 + fragsPlayer3Team2 +
                fragsPlayer4Team2 + fragsPlayer5Team2) / (double) countPlayersTeam2;

        System.out.println("Arithmetic average frags of team 2 - " + countFragsTeam2);



        if (countFragsTeam1 > countFragsTeam2) {
            System.out.println("Перемогла команда " + teamName1 + ", набрала " + countFragsTeam1 + " очків.");
        } else if (countFragsTeam1 < countFragsTeam2) {
            System.out.println("Перемогла команда " + teamName2 + ", набрала " + countFragsTeam2 + " очків.");
        } else {
            System.out.println("Ничія!");
        }
    }
}
