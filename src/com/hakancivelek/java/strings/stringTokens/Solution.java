package com.hakancivelek.java.strings.stringTokens;

import java.util.*;

/**
 * This class provides methods to split a string into alphabetic tokens and count them.
 * It also prints each token on a new line.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        splitAndPrintTokens(str);
    }

    /**
     * Splits the given string into alphabetic tokens and prints the number of tokens
     * followed by each token on a new line.
     *
     * @param str The input string to be split into tokens.
     */
    static void splitAndPrintTokens(String str) {
        String[] tokens = str.split("[^A-Za-z]+");

        int tokenCount = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenCount++;
            }
        }

        System.out.println(tokenCount);

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
