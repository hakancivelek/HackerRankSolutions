package com.hakancivelek.java.bigNumber.bigDecimal;

import java.math.BigDecimal;
import java.util.*;

/**
 * This program sorts an array of numeric strings in descending order using BigDecimal for precision.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        int lastIndexOfArray = n - 1;
        BigDecimal b1, b2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lastIndexOfArray - i; j++) {
                b1 = new BigDecimal(s[j]);
                b2 = new BigDecimal(s[j + 1]);
                if (b1.compareTo(b2) < 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}