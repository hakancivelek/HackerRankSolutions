package com.hakancivelek.java.introduction.stringsIntroduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);

        String str2 = in.nextLine();
        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);

        int totalLength = str1.length() + str2.length();
        boolean aGreaterThanB = false;
        int compareInt = str1.compareTo(str2);

        if (compareInt > 0) {
            aGreaterThanB = true;
        }

        System.out.println(totalLength);

        if (aGreaterThanB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(str1 + " " + str2);
    }

}