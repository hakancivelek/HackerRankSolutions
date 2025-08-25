package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.caesarCipher;

/**
 * The {@code Result} class provides a method to perform Caesar Cipher encryption.
 * This class contains a static method to encrypt a given string using a Caesar Cipher,
 * which shifts each letter of the string by a specified number of positions in the alphabet.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Encrypts the given string using Caesar Cipher with the given shift value.
     * The method shifts each letter in the input string by a specified number of positions.
     * It handles both uppercase and lowercase letters separately.
     * Non-alphabet characters remain unchanged.
     *
     * @param s The string to be encrypted. This string may contain letters and non-alphabet characters.
     * @param k The number of positions to shift each letter. The shift is done cyclically.
     *          If {@code k} is greater than 26, it will be effectively reduced modulo 26.
     * @return The encrypted string where each letter has been shifted by {@code k} positions.
     * Non-alphabet characters are unchanged.
     * @throws IllegalArgumentException If {@code s} is {@code null}.
     */
    public static String caesarCipher(String s, int k) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder result = new StringBuilder(s);
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            if (Character.isLowerCase(currentChar)) {
                int index = lowercase.indexOf(currentChar);
                result.setCharAt(i, lowercase.charAt((index + k) % 26));
            } else if (Character.isUpperCase(currentChar)) {
                int index = uppercase.indexOf(currentChar);
                result.setCharAt(i, uppercase.charAt((index + k) % 26));
            }
        }

        return result.toString();
    }
}
