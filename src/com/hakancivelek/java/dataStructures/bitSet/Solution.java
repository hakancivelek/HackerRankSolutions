package com.hakancivelek.java.dataStructures.bitSet;

import java.util.*;

/**
 * This class demonstrates the use of Java's BitSet class to perform bitwise operations.
 * The program reads input values to initialize two BitSet objects and then performs
 * various operations such as AND, OR, XOR, FLIP, and SET.
 * <p>
 * After each operation, the program prints the number of set bits in both BitSet objects.
 *
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        for (int i = 0; i < M; i++) {
            String operation = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            BitSet first = (x == 1) ? B1 : B2;
            BitSet second = (y == 1) ? B1 : B2;

            switch (operation) {
                case "AND" -> first.and(second);
                case "OR" -> first.or(second);
                case "XOR" -> first.xor(second);
                case "FLIP" -> first.flip(y);
                case "SET" -> first.set(y);
            }

            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

        scanner.close();
    }
}
