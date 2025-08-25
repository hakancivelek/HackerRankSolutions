package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.gridChallange;

import java.io.*;
import java.util.*;

/**
 * The main class that handles input and output for the grid challenge problem.
 */
public class Solution {
    /**
     * Reads input from standard input, processes each test case using the gridChallenge method,
     * and writes the result to the output.
     *
     * @param args command line arguments (not used)
     * @throws IOException if an I/O error occurs
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            List<String> grid = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                grid.add(scanner.nextLine().trim());
            }

            String result = Result.gridChallenge(grid);

            System.out.println(result);
        }

        scanner.close();
    }
}
