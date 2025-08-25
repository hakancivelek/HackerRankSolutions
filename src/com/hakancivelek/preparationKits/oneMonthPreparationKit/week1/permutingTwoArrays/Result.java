package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.permutingTwoArrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Result class contains the implementation of the twoArrays function.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Determines whether two arrays can be permuted such that for every index i, A[i] + B'[i] >= k.
     *
     * @param minRequiredSum The required minimum sum for each index.
     * @param list1 The first list of integers.
     * @param list2 The second list of integers.
     * @return "YES" if such a permutation exists, otherwise "NO".
     */
    public static String twoArrays(int minRequiredSum, List<Integer> list1, List<Integer> list2) {
        Collections.sort(list1);
        Collections.sort(list2);

        int size = list2.size();
        List<Integer> reverseB = new ArrayList<>(size);
        for (int i = size - 1; i >= 0; i--) {
            reverseB.add(list2.get(i));
        }

        for (int i = 0; i < size; i++) {
            if (list1.get(i) + reverseB.get(i) < minRequiredSum) {
                return "NO";
            }
        }

        return "YES";
    }
}
