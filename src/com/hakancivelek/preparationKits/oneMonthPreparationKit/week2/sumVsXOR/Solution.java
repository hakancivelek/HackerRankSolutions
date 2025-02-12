package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.sumVsXOR;

import java.util.Scanner;

/**
 * The Solution class is the entry point for the program.
 * It reads an input value using Scanner, computes the result using the Result class, and writes the output.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads input, computes the result, and writes the output to the console.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long result = Result.sumXor(n);

        System.out.println(result);

        scanner.close();
    }
}
