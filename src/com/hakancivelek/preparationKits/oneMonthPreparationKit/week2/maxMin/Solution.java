package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.maxMin;

import java.io.*;
import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        int k = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(scanner.nextLine().trim()));
        }

        int result = Result.maxMin(k, arr);

        System.out.println(result);

        scanner.close();
    }
}
