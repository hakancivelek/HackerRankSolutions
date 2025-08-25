package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.subarrayDivision1;

import java.util.*;

/**
 * This class represents the main solution for the Subarray Division problem.
 * It reads input values from the user, processes them, and calls the birthday method to determine
 * the number of valid ways to divide the chocolate bar.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> chocolateSquares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            chocolateSquares.add(scanner.nextInt());
        }

        int d = scanner.nextInt();
        int m = scanner.nextInt();

        int result = Result.birthday(chocolateSquares, d, m);

        System.out.println(result);

        scanner.close();
    }
}
