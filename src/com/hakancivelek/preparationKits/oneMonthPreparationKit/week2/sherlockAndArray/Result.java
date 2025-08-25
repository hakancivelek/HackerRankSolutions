package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.sherlockAndArray;

import java.util.List;

/**
 * The Result class provides a method to check if an element in an array satisfies
 * the condition where the sum of all elements to its left is equal to the sum
 * of all elements to its right.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Determines whether there exists an element in the array such that the sum
     * of all elements to its left is equal to the sum of all elements to its right.
     *
     * @param arr A list of integers representing the array.
     * @return A string "YES" if such an element exists, otherwise "NO".
     */
    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            int rightSum = totalSum - leftSum - arr.get(i);
            if (leftSum == rightSum) {
                return "YES";
            }
            leftSum += arr.get(i);
        }
        return "NO";
    }
}