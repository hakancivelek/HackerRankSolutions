package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.dynamicArray;

import java.util.*;

/**
 * The main class of the program. Takes inputs from the user and performs the operations.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            queries.add(query);
        }

        scanner.close();

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
