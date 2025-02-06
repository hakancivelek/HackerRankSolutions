package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.XORStrings2;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        StringBuffer result = new StringBuffer();

        int lengthOfStrings = str1.length();

        for (int i = 0; i < lengthOfStrings; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result.append("1");
            } else {
                result.append("0");
            }
        }

        System.out.println(result);
    }
}