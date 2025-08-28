package com.hakancivelek.java.dataStructures.subarray;

import java.util.Scanner;

/**
 * This program counts the number of subarrays within a given integer array
 * that have a negative sum. A subarray is defined as a contiguous sequence
 * of elements within the array.
 * <p>
 * The program reads the array size and its elements from standard input,
 * then iterates through all possible subarrays to calculate their sums
 * and counts how many of them are negative.
 * <p>
 * Sample Input:
 * 5
 * 1 -2 4 -5 1
 * <p>
 * Sample Output:
 * 9
 *
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int negativeSums = 0;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        while (true) {
            for (int start = 0; start < length; start++) {
                int sum = 0;
                for (int end = start; end < length; end++) {
                    sum += arr[end];
                    if (sum < 0) {
                        negativeSums++;
                    }
                }
            }

            break;
        }

        System.out.println(negativeSums);
    }
}
