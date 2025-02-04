package com.hakancivelek.java.introduction.outputFormatting;

import java.util.*;

/**
 * The Solution class reads three pairs of a string and an integer from user input
 * and prints them in a formatted manner.
 * <p>
 * Each string is left-aligned with a width of 15 characters,
 * and each integer is printed as a 3-digit number, padded with leading zeros if necessary.
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int number = scanner.nextInt();
            System.out.printf("%-15s%03d %n", str, number);
        }
        System.out.println("================================");
    }
}