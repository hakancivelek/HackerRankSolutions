package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.pangrams;

import java.io.*;
import java.util.Scanner;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        System.out.println(Result.pangrams(s));
    }
}
