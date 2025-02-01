package com.hakancivelek.week1.miniMaxSum;

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

/**
 * Calculates and prints the minimum and maximum sum of exactly four out of five given integers.
 *
 * <p>The function takes a list of five positive integers and computes:
 * <ul>
 *     <li>The minimum sum by excluding the largest integer.</li>
 *     <li>The maximum sum by excluding the smallest integer.</li>
 * </ul>
 *
 * <p>The function prints two space-separated values:
 * <ul>
 *     <li>The minimum sum.</li>
 *     <li>The maximum sum.</li>
 * </ul>
 *
 * <p><strong>Constraints:</strong>
 * <ul>
 *     <li>The list contains exactly 5 positive integers.</li>
 *     <li>Each integer is in the range of a 32-bit signed integer.</li>
 *     <li>However, the sum can exceed a 32-bit integer limit.</li>
 * </ul>
 *
 * <p><strong>Example:</strong>
 * <pre>
 * Input:  [1, 2, 3, 4, 5]
 * Output: 10 14
 * </pre>
 *
 * @param arr A list of exactly five positive integers.
 *
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan CİVELEK</a>
 */

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger min = BigInteger.valueOf(arr.get(0))
                .add(BigInteger.valueOf(arr.get(1)))
                .add(BigInteger.valueOf(arr.get(2)))
                .add(BigInteger.valueOf(arr.get(3)));
        BigInteger max = BigInteger.ZERO;

        for (int i = 0; i < 5; i++) {
            sum = BigInteger.ZERO;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    sum = sum.add(BigInteger.valueOf(arr.get(j)));
                }
            }
            if (sum.compareTo(min) < 0) {
                min = sum;
            }
            if (sum.compareTo(max) > 0) {
                max = sum;
            }
        }
        System.out.println(min + " " + max);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
