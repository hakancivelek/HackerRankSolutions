package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.dynamicArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that solves the Dynamic Array problem.
 * It processes updates to `n` arrays and responds to specific queries.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Processes the list of `queries` and manages the dynamic array.
     *
     * @param n       The number of arrays.
     * @param queries The list of queries to be processed.
     * @return A list of `lastAnswer` values generated as output.
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> resultList = new ArrayList<>();
        int lastAnswer = 0;
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } else if (type == 2) {
                List<Integer> seq = arr.get(idx);
                lastAnswer = seq.get(y % seq.size());
                resultList.add(lastAnswer);
            }
        }

        return resultList;
    }
}