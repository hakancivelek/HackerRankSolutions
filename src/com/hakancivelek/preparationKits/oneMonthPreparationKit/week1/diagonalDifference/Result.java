package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.diagonalDifference;

import java.util.*;

/**
 * The Result class provides a method to calculate the absolute difference between
 * the sums of the diagonals of a square matrix.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
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

        int indexOfList = size - 1;
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j++){
                if(i == j){
                    sumFromLeftToRight += arr.get(i).get(j);
                } if (j == indexOfList - i) {
                    sumFromRightToLeft += arr.get(i).get(j);
                }
            }
        }

        return Math.abs(sumFromLeftToRight - sumFromRightToLeft);
    }
}
