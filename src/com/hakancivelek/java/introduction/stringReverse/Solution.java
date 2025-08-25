package com.hakancivelek.java.introduction.stringReverse;

import java.util.*;

/**
 * The Solution class checks whether a given string is a palindrome.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads an input string, reverses it, and checks if it is a palindrome.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int length = str.length();
        String reverseStr = "";

        for (int i = length - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        if (reverseStr.equals(str)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
