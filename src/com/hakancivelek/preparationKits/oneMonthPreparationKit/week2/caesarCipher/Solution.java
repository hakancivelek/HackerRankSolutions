package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.caesarCipher;

import java.io.*;
import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        String s = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine().trim());

        String result = Result.caesarCipher(s, k);

        System.out.println(result);

        scanner.close();
    }
}
