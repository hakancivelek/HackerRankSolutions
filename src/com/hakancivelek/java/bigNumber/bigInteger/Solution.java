package com.hakancivelek.java.bigNumber.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This class provides a solution to the problem of adding and multiplying large integers
 * using Java's BigInteger class.
 * It handles input of very large numbers, performs addition and multiplication,
 * and outputs the results.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * Main method to execute the solution. It reads two large integers,
     * performs addition and multiplication, and prints the results.
     *
     * @param args Command line arguments (not used in this solution).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger bigInt1 = in.nextBigInteger();
        BigInteger bigInt2 = in.nextBigInteger();

        System.out.println(bigInt1.add(bigInt2));
        System.out.println(bigInt1.multiply(bigInt2));
    }
}
