package com.hakancivelek.java.dataStructures.stack;

import java.util.*;
/**
 * Solution class to check if a string contains balanced brackets.
 * This program takes input strings containing brackets (e.g., {}, (), [])
 * and checks if they are balanced or not using a stack data structure.
 *
 * Example Inputs and Outputs:
 * Input: "{}()" => Output: true
 * Input: "({()})" => Output: true
 * Input: "{}(" => Output: false
 * Input: "[]" => Output: true
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Solution {

    /**
     * The main method reads input strings and checks if the brackets are balanced.
     * The method continuously reads strings from the console until the end of input.
     *
     * @param argh Command-line arguments (not used in this program).
     */
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(balanceCheck(input));
        }
    }

    /**
     * Checks if a given string has balanced brackets.
     *
     * A string is considered to have balanced brackets if:
     * - Every opening bracket has a corresponding closing bracket in the correct order.
     * - The brackets are properly nested.
     *
     * The method uses a Stack to validate the brackets:
     * - Push opening brackets ({, (, [) onto the stack.
     * - For closing brackets (}, ), ]), check if they match the top of the stack.
     * - Return false if there's a mismatch or if the stack is empty when a closing bracket is encountered.
     * - At the end, if the stack is not empty, return false.
     *
     * @param str The input string containing brackets to check.
     * @return true if the brackets are balanced, false otherwise.
     */
    static boolean balanceCheck(String str) {
        Stack<Character> charStack = new Stack<>();

        for (Character currentChar : str.toCharArray()) {
            if (currentChar == '{' || currentChar == '(' || currentChar == '[') {
                charStack.push(currentChar);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }

                char topChar = charStack.pop();
                if ((currentChar == '}' && topChar != '{') ||
                        (currentChar == ')' && topChar != '(') ||
                        (currentChar == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}