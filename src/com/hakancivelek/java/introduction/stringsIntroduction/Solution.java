package com.hakancivelek.java.introduction.stringsIntroduction;

import java.util.Scanner;

/**
 * The Solution class reads two strings from input, capitalizes their first letters,
 * compares them lexicographically, and prints the results.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads two strings from standard input, capitalizes their first letters,
     * calculates their total length, compares them lexicographically, and prints the results.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);

        String str2 = in.nextLine();
        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);

        int totalLength = str1.length() + str2.length();
        boolean aGreaterThanB = false;
        int compareInt = str1.compareTo(str2);

        if (compareInt > 0) {
            aGreaterThanB = true;
        }

        System.out.println(totalLength);

        if (aGreaterThanB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(str1 + " " + str2);
    }

}