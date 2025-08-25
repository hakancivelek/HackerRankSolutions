package com.hakancivelek.java.bigNumber.primalityTest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * The {@code Solution} class provides a method to check whether a given large integer is prime.
 * It utilizes Java's {@code BigInteger} class and its {@code isProbablePrime} method.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * The main method reads an integer from the input, checks if it is prime,
     * and prints "prime" if the number is prime, otherwise prints "not prime".
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number = scanner.nextBigInteger();
        scanner.close();

        if (number.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
