package com.hillel.tsokorov.homeworks.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] team1 = new int[25];
        int sum1 = 0;
        int countOfTeammates1 = 25;
        int averageAgeTeam1 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random() * 23);
            sum1 += team1[i];
            averageAgeTeam1 = sum1 / countOfTeammates1;
        }
        System.out.println("Age of players of team 1 = " + Arrays.toString(team1));
        System.out.println("Average age of team 1 = " + averageAgeTeam1);

        int[] team2 = new int[25];
        int sum2 = 0;
        int countOfTeammates2 = 25;
        int averageAgeTeam2 = 0;

        for (int i = 0; i < team2.length; i++) {
            team2[i] = 18 + (int) (Math.random() * 23);
            sum2 += team2[i];
            averageAgeTeam2 = sum2 / countOfTeammates2;
        }
        System.out.println("Age of players of team 2 = " + Arrays.toString(team2));
        System.out.println("Average age of team 2 = " + averageAgeTeam2);

        if (averageAgeTeam1 > averageAgeTeam2) {
            System.out.println("Average age of team 1 is bigger than average age of team 2.");
        } else if (averageAgeTeam1 < averageAgeTeam2) {
            System.out.println("Average age of team 1 is smaller than average age of team 2.");
        } else {
            System.out.println("Teams have the same average age.");
        }
    }
}
