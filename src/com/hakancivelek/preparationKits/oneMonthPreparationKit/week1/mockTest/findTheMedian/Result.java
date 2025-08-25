package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.mockTest.findTheMedian;

import java.util.Collections;
import java.util.List;

/**
 * This class provides a method to find the median of a list of integers.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Finds the median of an odd-sized list of integers.
     *
     * @param arr An unsorted list of integers (must contain an odd number of elements).
     * @return The median value of the sorted list.
     */
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);

        int middleIndex = arr.size() / 2;

        return arr.get(middleIndex);
    }
}
