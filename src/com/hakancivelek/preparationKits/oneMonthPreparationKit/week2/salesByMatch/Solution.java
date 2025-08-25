package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.salesByMatch;

import java.util.*;
import java.util.stream.*;

/**
 * The Solution class reads input data, processes the sock counting logic, and prints the result.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads input from the user and calls the sockMerchant method.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> ar = Arrays.stream(scanner.nextLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
