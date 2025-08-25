package com.hakancivelek.java.dataStructures.oneDArray;

import java.util.*;

/**
 * The Solution class handles the process of reading a set of integers from the input,
 * storing them in an array, and then printing each element sequentially.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads the size of the array, followed by the elements to be stored in it,
     * and then prints each element from the array in order.
     *
     * @param args Command line arguments (not used in this solution).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        for (int j : a) {
            System.out.println(j);
        }
    }
}

