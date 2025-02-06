package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.subarrayDivision1;

import java.util.List;

/**
 * This class contains the logic to determine how many ways the chocolate squares
 * can be divided into a contiguous subarray of length "month" where the sum equals "day".
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 *
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Determines the number of ways to divide the chocolate squares.
     *
     * @param chocolateSquares A list of integers representing chocolate squares.
     * @param day The target sum of the selected contiguous subarray.
     * @param month The length of the contiguous subarray.
     * @return The number of valid ways to divide the chocolate.
     */
    public static int birthday(List<Integer> chocolateSquares, int day, int month) {
        int waysToDivideChocolate = 0;
        int sizeOfList = chocolateSquares.size();

        if (sizeOfList < month) {
            return 0;
        }

        for (int i = 0; i <= sizeOfList - month; i++) {
            int sumOfSquares = 0;

            for (int j = 0; j < month; j++) {
                sumOfSquares += chocolateSquares.get(i + j);
            }

            if (day == sumOfSquares)
                waysToDivideChocolate++;
        }

        return waysToDivideChocolate;
    }

}
