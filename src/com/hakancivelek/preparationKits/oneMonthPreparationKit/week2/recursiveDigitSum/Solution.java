package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.recursiveDigitSum;

import java.util.Scanner;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>/
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        int k = scanner.nextInt();

        int result = Result.superDigit(n, k);
        System.out.println(result);

        scanner.close();
    }
}


