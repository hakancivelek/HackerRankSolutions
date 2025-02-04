package com.hakancivelek.preparationKits.week1.diagonalDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Solution class reads a square matrix from the user, calculates the absolute
 * difference between its two diagonal sums, and prints the result.
 *
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            arr.add(row);
        }

        int result = Result.diagonalDifference(arr);
        System.out.println(result);

        scanner.close();
    }
}
