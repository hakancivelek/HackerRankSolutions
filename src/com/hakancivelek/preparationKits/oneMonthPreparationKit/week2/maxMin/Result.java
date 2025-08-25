package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.maxMin;

import java.util.Collections;
import java.util.List;

/**
 * This class contains a method to calculate the minimum possible unfairness
 * by selecting k elements from an array of integers.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Calculates the minimum unfairness of an array by selecting k elements.
     * The unfairness of an array is calculated as the difference between the
     * maximum and minimum values of the selected k elements.
     *
     * @param k   the number of elements to select
     * @param arr the array of integers
     * @return the minimum possible unfairness
     */
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);

        int minUnfairness = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.size() - k; i++) {
            int subArrayUnfairness = arr.get(i + k - 1) - arr.get(i);
            minUnfairness = Math.min(minUnfairness, subArrayUnfairness);
        }

        return minUnfairness;
    }
}
