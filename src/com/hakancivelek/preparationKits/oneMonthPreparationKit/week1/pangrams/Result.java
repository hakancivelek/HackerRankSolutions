package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.pangrams;

/**
 * This class provides a method to check whether a given string is a pangram.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Determines if the given string is a pangram.
     * A pangram is a sentence that contains every letter of the English alphabet at least once.
     * The function is case-insensitive.
     *
     * @param s the input string to be checked
     * @return "pangram" if the input contains all letters of the alphabet, otherwise "not pangram"
     */
    public static String pangrams(String s) {
        boolean isPangram = true;

        char[] letters = new char[26];
        int[] pangramCheckArray = new int[26];

        for (int i = 0; i < 26; i++) {
            letters[i] = (char) ('a' + i);
        }

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < 26; j++){
                char ch = Character.toLowerCase(s.charAt(i));
                if(ch == letters[j]){
                    pangramCheckArray[j] = 1;
                }
            }
        }

        for (int value : pangramCheckArray) {
            if (value == 0) {
                isPangram = false;
                break;
            }
        }

        if(isPangram){
            return "pangram";
        }

        return "not pangram";
    }

}