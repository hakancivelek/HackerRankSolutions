package com.hakancivelek.java.dataStructures.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<Set<String>> uniquePairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();

            Set<String> pair = new HashSet<>();
            pair.add(str1);
            pair.add(str2);

            uniquePairs.add(pair);

            System.out.println(uniquePairs.size());
        }

        sc.close();
    }
}
