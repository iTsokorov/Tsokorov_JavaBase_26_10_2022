package com.hillel.tsokorov.homeworks.homework4;

public class Parallelepiped {
    public static void main(String[] args) {

        // V = a * b * c;
        int lengthOfSide = 10;
        int widthOfSide = 5;
        int heigthOfSide = 7;

        int volume = lengthOfSide * widthOfSide * heigthOfSide;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        // L = 4 * (a + b + c)
        int length = 4 * (lengthOfSide + widthOfSide + heigthOfSide);

        System.out.println("Сумарна довжина всіх сторін паралелепіпеда = " + length);


    }
}
