package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.drawingBook;

import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int result = Result.pageCount(n, p);

        System.out.println(result);

        scanner.close();
    }
}

