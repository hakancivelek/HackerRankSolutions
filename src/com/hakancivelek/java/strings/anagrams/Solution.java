package com.hakancivelek.java.strings.anagrams;

import java.util.*;

/**
 * This class provides a method to check if two input strings are anagrams.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        anagramCheck(str1, str2);
    }

    /**
     * Checks if two given strings are anagrams. An anagram is a word or phrase formed
     * by rearranging the letters of a different word or phrase, using all the original letters exactly once.
     *
     * @param str1 The first input string.
     * @param str2 The second input string.
     */
    static void anagramCheck(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] arrayForStr1 = str1.toLowerCase().toCharArray();
        char[] arrayForStr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arrayForStr1);
        Arrays.sort(arrayForStr2);

        boolean isAnagram = true;
        for (int i = 0; i < arrayForStr1.length; i++) {
            if (arrayForStr1[i] != arrayForStr2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
