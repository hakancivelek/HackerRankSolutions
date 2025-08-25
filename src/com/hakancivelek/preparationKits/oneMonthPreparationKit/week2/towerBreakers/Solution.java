package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.towerBreakers;

import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>/
 **/
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        StringBuilder results = new StringBuilder();

        /**
         * Processes each test case:
         * <ul>
         *   <li>Reads the number of towers (n) and the height of each tower (m).</li>
         *   <li>Determines the winner using {@link Result#towerBreakers(int, int)}.</li>
         *   <li>Appends the result (1 or 2) to the output.</li>
         * </ul>
         */
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int result = Result.towerBreakers(n, m);

            results.append(result).append("\n");
        }

        scanner.close();

        System.out.print(results);
    }
}
