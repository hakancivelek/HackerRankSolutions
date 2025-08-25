package com.hakancivelek.preparationKits.oneMonthPreparationKit.week3.iceCreamParlor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Solution class handles reading input, calling the iceCreamParlor method, and printing the results.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            List<Integer> cost = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                cost.add(scanner.nextInt());
            }

            List<Integer> result = Result.iceCreamParlor(m, cost);

            System.out.println(result.get(0) + " " + result.get(1));
        }
        scanner.close();
    }
}