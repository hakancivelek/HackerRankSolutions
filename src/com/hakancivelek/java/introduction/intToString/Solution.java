package com.hakancivelek.java.introduction.intToString;

import java.util.Scanner;

/**
 * This program reads an integer from the user, converts it into a string,
 * and prints "Good job" if the conversion is successful.
 *
 * The expected output is always "Good job" because Integer.toString(n)
 * always works correctly.
 *
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String result = Integer.toString(n);

        if (result.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        scanner.close();
    }
}
