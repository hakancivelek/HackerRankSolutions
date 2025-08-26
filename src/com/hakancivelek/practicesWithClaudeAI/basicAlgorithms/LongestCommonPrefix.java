package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * LongestCommonPrefix (Java)
 * <p>
 * Finds the longest common prefix among user-entered words.
 * <p>
 * Examples:
 * - ["flower", "flow", "flight"] → "fl"
 * - ["dog", "racecar", "car"] → ""
 * - ["interspecies", "interstellar", "interstate"] → "inters"
 * <p>
 * Author: <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * LinkedIn: <a href="https://www.linkedin.com/in/hakancivelek">Profile</a>
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many words will you enter? ");
        int n = input.nextInt();
        input.nextLine();

        ArrayList<String> strs = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            strs.add(input.nextLine());
        }

        strs.sort(Comparator.comparingInt(String::length));
        String commonPrefix = strs.get(0);

        for (int i = 1; i < strs.size(); i++) {
            String currentStr = strs.get(i);
            int j = 0;
            while (j < commonPrefix.length() &&
                    currentStr.charAt(j) == commonPrefix.charAt(j)) {
                j++;
            }
            commonPrefix = commonPrefix.substring(0, j);
            if (commonPrefix.isEmpty()) break;
        }

        System.out.println(commonPrefix.isEmpty() ? "There is no common prefix!" : commonPrefix);
    }
}
