package com.hakancivelek.java.introduction.substringComparisons;

import java.util.*;

/**
 * Solution class that finds the lexicographically smallest and largest substrings of a given length.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method that reads input from the user, processes substrings, and prints the results.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int value = in.nextInt();

        int strLength = str.length();
        // Initialize firstStr with the highest possible Unicode character
        String firstStr = "\uFFFF";

        // Initialize lastStr with the lowest possible Unicode character
        String lastStr = "\u0000";

        for (int i = 0; i < strLength - value + 1; i++) {
            String temporaryStr = str.substring(i, i + value);

            if (temporaryStr.compareTo(firstStr) < 0) {
                firstStr = temporaryStr;
            }
            if (temporaryStr.compareTo(lastStr) > 0) {
                lastStr = temporaryStr;
            }
        }

        System.out.println(firstStr);
        System.out.println(lastStr);
    }
}