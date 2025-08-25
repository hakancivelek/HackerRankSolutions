package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.counterGame;
import java.io.*;
import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            String result = Result.counterGame(n);

            System.out.println(result);
        }

        scanner.close();
    }
}

