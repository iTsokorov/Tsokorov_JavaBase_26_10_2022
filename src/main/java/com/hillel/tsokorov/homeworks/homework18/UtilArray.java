package com.hillel.tsokorov.homeworks.homework18;

public class UtilArray {
    public static double averageTwoDimensionalArray(int[][] array) {

        // if array = null - return -1
        // if array is empty - return -2
        // if average elements of array = 0 - return -3

        if (array == null) {
            return -1;
        }

        if (array.length == 0) {
            return -2;
        }

        double avg;
        int sumNumbers = 0;
        double countNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumNumbers += array[i][j];
                countNumbers++;
            }
        }

        avg = sumNumbers / countNumbers;
        if (avg == 0) {
            return -3;
        }
        return avg;

    }

    public static boolean matrixIsSquare(int[][] matrix) {

        // if matrix is not square - return false

        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            if (size != matrix[i].length)
                return false;
        }
        return true;
    }
}


