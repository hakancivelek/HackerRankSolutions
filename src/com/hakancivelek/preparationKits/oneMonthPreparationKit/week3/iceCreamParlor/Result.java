package com.hakancivelek.preparationKits.oneMonthPreparationKit.week3.iceCreamParlor;

import java.util.*;

/**
 * The Result class contains the method to find two ice cream flavors whose costs sum up to the amount available.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * This method returns the indices (1-based) of two distinct ice cream flavors whose costs add up to the available amount.
     *
     * @param m   The total amount of money the friends have to spend.
     * @param arr The list of costs for each flavor.
     * @return A list containing the 1-based indices of the two flavors that sum up to the available amount, sorted in ascending order.
     */
    public static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        List<Integer> result = new ArrayList<>(2);
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum == m) {
                    result.add(i + 1);
                    result.add(j + 1);
                    break;
                }
            }
            if (!result.isEmpty()) {
                break;
            }
        }

        Collections.sort(result);
        return result;
    }
}


