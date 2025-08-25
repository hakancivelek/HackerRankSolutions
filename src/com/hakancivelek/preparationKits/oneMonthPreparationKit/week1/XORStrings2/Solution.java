package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.XORStrings2;

import java.util.*;

/**
 * The {@code Solution} class provides a solution to compute the XOR result of two binary strings.
 * It takes two input strings of equal length and performs a bitwise XOR operation for each corresponding
 * pair of characters, appending '1' if the characters are different, or '0' if they are the same.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String result = xorStrings(str1, str2);

        System.out.println(result);
    }

    /**
     * This method calculates the XOR result of two binary strings of equal length.
     * It performs a bitwise XOR operation on each character and returns the result as a new binary string.
     *
     * @param str1 The first binary string.
     * @param str2 The second binary string.
     * @return A binary string representing the XOR result of the input strings.
     */
    public static String xorStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int lengthOfStrings = str1.length();

        for (int i = 0; i < lengthOfStrings; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result.append("1");
            } else {
                result.append("0");
            }
        }

        return result.toString();
    }
}