package com.hakancivelek.java.strings.patternSyntaxChecker;

import java.util.*;
import java.util.regex.*;

/**
 * This class validates regular expressions for their syntax.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * Main method to handle input and process each test case.
     * It reads the number of test cases, and for each test case,
     * it checks if the regex pattern is valid or invalid.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < testCases; i++) {
            String pattern = scan.nextLine();
            validateRegex(pattern);
        }

        scan.close();
    }

    /**
     * Validates if the given regex pattern is syntactically valid.
     *
     * This method uses the Pattern.compile() method to check if the regex
     * can be compiled successfully. If it can be compiled, it is considered valid.
     * If a PatternSyntaxException is thrown, the regex is considered invalid.
     *
     * @param pattern The regex pattern to be validated
     */
    public static void validateRegex(String pattern) {
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}
