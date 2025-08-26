package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * Contains Duplicate (Java)
 * <p>
 * Simple Java program that checks if an integer array contains any duplicate values.
 * Returns true if any duplicates exist, otherwise false.
 * <p>
 * Examples:
 * - Input: [1,2,3,4,5] → Output: false
 * - Input: [1,2,3,2] → Output: true
 * - Input: [5,5,5,5] → Output: true
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        boolean duplicate = false;
        int currentNumber;

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        here:
        for (int i = 0; i < numbers.length; i++) {
            currentNumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNumber == numbers[j]) {
                    duplicate = true;
                    break here;
                }
            }
        }

        System.out.println(duplicate);
    }
}
