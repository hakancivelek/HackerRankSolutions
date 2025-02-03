package com.hakancivelek.javaIntroduction.loopsII;

import java.util.*;
/**
 * This class handles reading multiple queries and generating a series of numbers
 * based on the provided formula. Each series is printed as a space-separated line.
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int startingNumber = scanner.nextInt();
            int number = scanner.nextInt();
            int counter = scanner.nextInt();

            printResult(startingNumber,number,counter);
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Prints a series of numbers based on the formula:
     * startingNumber + (2^0 * number), startingNumber + (2^0 * number) + (2^1 * number), ..., up to 'counter' terms.
     *
     * @param startingNumber The initial number to start the series from.
     * @param number The number to be multiplied by powers of 2 in the series.
     * @param counter The number of terms to generate in the series.
     */
    public static void printResult(int startingNumber, int number, int counter){
        for(int i = 0; i < counter; i++){
            startingNumber += Math.pow(2, i) * number;
            System.out.print(startingNumber + " ");
        }
    }
}
