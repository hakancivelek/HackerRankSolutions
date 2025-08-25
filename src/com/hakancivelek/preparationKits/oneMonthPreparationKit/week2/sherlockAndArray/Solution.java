package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.sherlockAndArray;

import java.util.*;
import static java.util.stream.Collectors.toList;

/**
 * The Solution class handles input/output and calls the balancedSums method
 * for each test case.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            scanner.nextLine();

            List<Integer> arr = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            String result = Result.balancedSums(arr);
            System.out.println(result);
        }

        scanner.close();
    }
}
