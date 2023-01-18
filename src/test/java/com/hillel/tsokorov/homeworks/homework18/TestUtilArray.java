package com.hillel.tsokorov.homeworks.homework18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestUtilArray {

    static int[][] array = null;


    @BeforeAll
    public static void beforeAll() {
        array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test1() {
        Assertions.assertEquals(-1, UtilArray.averageTwoDimensionalArray(null));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(-2, UtilArray.averageTwoDimensionalArray(new int[0][0]));
    }

    @Test
    public void test3() {
        Assertions.assertNotEquals(-3, UtilArray.averageTwoDimensionalArray(array));
    }

    @Test
    public void test4() {
        Assertions.assertTrue(UtilArray.matrixIsSquare(array));
    }
}
