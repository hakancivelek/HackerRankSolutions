package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.permutingTwoArrays;

import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        while (q-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                A.add(scanner.nextInt());
            }

            for (int i = 0; i < n; i++) {
                B.add(scanner.nextInt());
            }

            String result = Result.twoArrays(k, A, B);
            System.out.println(result);
        }

        scanner.close();
    }
}
