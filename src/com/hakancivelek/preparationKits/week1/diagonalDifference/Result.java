package com.hakancivelek.preparationKits.week1.diagonalDifference;

import java.util.*;

/**
 * The Result class provides a method to calculate the absolute difference between
 * the sums of the diagonals of a square matrix.
 *
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Calculates the absolute difference between the sums of the matrix's primary
     * and secondary diagonals.
     *
     * @param arr A square matrix represented as a list of lists
     * @return The absolute difference between the two diagonal sums
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int sumFromLeftToRight = 0;
        int sumFromRightToLeft = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sumFromLeftToRight += arr.get(i).get(j);
                }
            }
        }

        int indexOfArray = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = indexOfArray; j >= 0; j--) {
                if (j == indexOfArray - i) {
                    sumFromRightToLeft += arr.get(i).get(j);
                }
            }
        }

        return Math.abs(sumFromLeftToRight - sumFromRightToLeft);
    }
}
