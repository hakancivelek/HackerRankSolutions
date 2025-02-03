package com.hakancivelek.preparationKits.week1.flippingBits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            long n = scanner.nextLong();
            long result = Result.flippingBits(n);
            System.out.println(result);
        }

        scanner.close();
    }
}
