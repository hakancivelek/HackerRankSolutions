package com.hakancivelek.java.introduction.currencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * The Solution class formats a given numeric input into currency formats
 * for different locales: US, India, China, and France.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double value = in.nextDouble();
        in.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + usFormat.format(value));

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("India: Rs." + indiaFormat.format(value).substring(1));

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + chinaFormat.format(value));

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + franceFormat.format(value));
    }
}