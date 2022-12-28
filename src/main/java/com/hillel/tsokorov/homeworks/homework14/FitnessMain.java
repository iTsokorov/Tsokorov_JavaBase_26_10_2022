package com.hillel.tsokorov.homeworks.homework14;

public class FitnessMain {
    public static void main(String[] args) {

        Fitness user1 = new Fitness("Max", "Big", 12, 12, 1999,
                "max@gmail.com", "+380997844099", 80, "130 x 90", 7777);
        Fitness user2 = new Fitness("Alex", "Smith", 11, 3, 1991,
                "alex@gmail.com", "+380932138591", 69, "120 x 80", 8077);
        Fitness user3 = new Fitness("Melissa", "Moll", 22, 2, 2002,
                "melissa@gmail.com", "380632634192", 69, "121 x 82", 10102);


        System.out.println("BEFORE CHANGES:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        System.out.println();

        user2.setWeight(72);
        user2.setPressure("140 x 100");
        user3.setSurName("Hill");
        user3.setDayStepScore(120622);

        System.out.println("AFTER CHANGES:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
