package com.hakancivelek.preparationKits.week1.countingSort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Result class provides an implementation of the counting sort algorithm.
 *
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Result {
    /**
     * Performs counting sort on the given list and returns a frequency list.
     *
     * @param arr The input list containing integers to be sorted.
     * @return A list of size 100 representing the frequency of each number from 0 to 99.
     */
    public static List<Integer> countingSort(List<Integer> arr) {
        int maxValue = 0;

        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        List<Integer> frequencyList = new ArrayList<>(Collections.nCopies(100, 0));

        for (int i = 0; i < arr.size(); i++) {
            frequencyList.set(arr.get(i), frequencyList.get(arr.get(i)) + 1);
        }

        return frequencyList;
    }
}
