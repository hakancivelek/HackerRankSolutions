package com.hakancivelek.preparationKits.oneMonthPreparationKit.week3.sherlockAndTheValidString;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 **/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String result = isValid(s);
        System.out.println(result);

        scan.close();
    }

    public static String isValid(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int f : freq.values()) {
            count.put(f, count.getOrDefault(f, 0) + 1);
        }

        if (count.size() == 1) {
            return "YES";
        } else if (count.size() == 2) {
            List<Integer> keys = new ArrayList<>(count.keySet());
            int k1 = keys.get(0);
            int k2 = keys.get(1);
            int c1 = count.get(k1);
            int c2 = count.get(k2);

            if ((c1 == 1 && (k1 - 1 == k2 || k1 == 1)) ||
                    (c2 == 1 && (k2 - 1 == k1 || k2 == 1))) {
                return "YES";
            }
        }

        return "NO";
    }
}