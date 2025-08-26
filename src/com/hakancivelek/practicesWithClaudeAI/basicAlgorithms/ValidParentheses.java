package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * Valid Parentheses (Java)
 * <p>
 * Simple Java program that checks whether the parentheses in a given text are valid.
 * The program supports round (), curly {}, and square [] brackets.
 * It reads a string from the user and uses a stack to verify if every opening
 * bracket has a corresponding closing bracket in the correct order.
 * <p>
 * Example:
 * Input:  "{[()]}"
 * Output: "Parentheses are valid"
 * <p>
 * Input:  "{[(])}"
 * Output: "Parentheses are invalid"
 * <p>
 *
 * Author: Hakan Civelek
 * Contact: hakancivelek5461@gmail.com
 * LinkedIn: https://www.linkedin.com/in/hakancivelek
 */

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = true;

        System.out.println("Enter the text: ");
        String str = input.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    break;
                }
                char pop = stack.pop();
                if ((pop == '(' && ch != ')') ||
                        (pop == '{' && ch != '}') ||
                        (pop == '[' && ch != ']'))
                    isValid = false;
                break;
            }
        }

        System.out.println("Parentheses are " + (isValid ? "valid" : "invalid"));

    }
}