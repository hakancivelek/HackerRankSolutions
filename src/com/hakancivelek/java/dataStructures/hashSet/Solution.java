package com.hakancivelek.java.dataStructures.hashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * This program reads a series of string pairs, stores unique pairs in a HashSet,
 * and prints the size of the HashSet after each insertion.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads input, processes unique string pairs, and outputs
     * the number of unique pairs after each input.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<Set<String>> uniquePairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();

            Set<String> pair = new HashSet<>();
            pair.add(str1);
            pair.add(str2);

            uniquePairs.add(pair);

            System.out.println(uniquePairs.size());
        }

        sc.close();
    }
}
