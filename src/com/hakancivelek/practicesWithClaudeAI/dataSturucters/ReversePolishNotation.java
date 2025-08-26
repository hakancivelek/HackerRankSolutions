package com.hakancivelek.practicesWithClaudeAI.dataSturucters;
/**
 *
 * <p>This class evaluates mathematical expressions written in Reverse Polish Notation (RPN).
 * In RPN, operators follow their operands. The class supports the four basic operators:
 * +, -, *, / (integer division).</p>
 *
 * <p>Example usage (input each line in console):</p>
 * <pre>
 * Input: 2 1 + 3 *
 * Tokens: ["2","1","+","3","*"]
 * Output: 9
 *
 * Input: 4 13 5 / +
 * Tokens: ["4","13","5","/","+"]
 * Output: 6
 *
 * Input: 10 6 9 3 + -11 * / * 17 + 5 +
 * Tokens: ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * <pre>
 *
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter RPN expression (space separated): ");
        String line = input.nextLine();
        String[] tokens = line.trim().split("\\s+");

        int result = calculate(tokens);
        System.out.println("Result: " + result);
    }

    static int calculate(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    int b1 = stack.pop();
                    int a1 = stack.pop();
                    stack.push(a1 + b1);
                    break;
                case "-":
                    int b2 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 - b2);
                    break;
                case "*":
                    int b3 = stack.pop();
                    int a3 = stack.pop();
                    stack.push(a3 * b3);
                    break;
                case "/":
                    int b4 = stack.pop();
                    int a4 = stack.pop();
                    stack.push(a4 / b4); // integer division
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
