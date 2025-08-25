package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.zigZagSequence;

import java.util.*;
import java.lang.*;

/**
 * The Main class that solves the Zig-Zag sequence problem.
 * Given an array of distinct integers, this class transforms the array into the lexicographically smallest Zig-Zag sequence.
 * A Zig-Zag sequence is defined as an array where the first part is in increasing order
 * and the second part is in decreasing order.
 *
 * Explanation:
 * The code provided to me was incomplete, and I had to modify at most 3 lines to achieve the solution.
 * The original lines I modified are marked as comments in the code below.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for (int cs = 1; cs <= test_cases; cs++) {
            int n = kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    /**
     * Transforms the given array into the lexicographically smallest Zig-Zag sequence.
     * The first half of the sequence is in increasing order and the second half is in decreasing order.
     *
     * @param a The array to be transformed.
     * @param n The number of elements in the array.
     */
    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
//        int mid = (n+1)/2
        int mid = n / 2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
//        int ed = n - 1;
        int ed = n - 2;
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
//            ed = ed + 1;
            ed = ed - 1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
