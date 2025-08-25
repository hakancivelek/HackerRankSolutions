package com.hakancivelek.java.introduction.dataTypes;

import java.util.*;
import java.math.BigInteger;

/**
 * This program determines the smallest primitive data type that can store a given number.
 * It reads multiple test cases and checks if the number can fit into byte, short, int, or long.
 * If a number cannot fit into any of these data types, it prints that the number cannot be fitted.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            String numStr = scanner.nextLine();
            try {
                BigInteger num = new BigInteger(numStr);

                BigInteger minByte = BigInteger.valueOf(Byte.MIN_VALUE);
                BigInteger maxByte = BigInteger.valueOf(Byte.MAX_VALUE);
                BigInteger minShort = BigInteger.valueOf(Short.MIN_VALUE);
                BigInteger maxShort = BigInteger.valueOf(Short.MAX_VALUE);
                BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);
                BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
                BigInteger minLong = BigInteger.valueOf(Long.MIN_VALUE);
                BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

                boolean canFit = false;

                if (num.compareTo(minByte) >= 0 && num.compareTo(maxByte) <= 0) {
                    if (!canFit) {
                        System.out.println(numStr + " can be fitted in:");
                        canFit = true;
                    }
                    System.out.println("* byte");
                }
                if (num.compareTo(minShort) >= 0 && num.compareTo(maxShort) <= 0) {
                    if (!canFit) {
                        System.out.println(numStr + " can be fitted in:");
                        canFit = true;
                    }
                    System.out.println("* short");
                }
                if (num.compareTo(minInt) >= 0 && num.compareTo(maxInt) <= 0) {
                    if (!canFit) {
                        System.out.println(numStr + " can be fitted in:");
                        canFit = true;
                    }
                    System.out.println("* int");
                }
                if (num.compareTo(minLong) >= 0 && num.compareTo(maxLong) <= 0) {
                    if (!canFit) {
                        System.out.println(numStr + " can be fitted in:");
                        canFit = true;
                    }
                    System.out.println("* long");
                }

                if (!canFit) {
                    System.out.println(numStr + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(numStr + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}