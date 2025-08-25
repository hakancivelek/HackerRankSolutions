package com.hakancivelek.java.introduction.substring;

import java.util.*;

/**
 * A solution class that reads a string and two integer values from input,
 * then prints the substring of the given string between the specified indices.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads a string and two integer values from standard input.
     * It then extracts and prints the substring between the given start and end indices.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(str.substring(start,end));
    }
}