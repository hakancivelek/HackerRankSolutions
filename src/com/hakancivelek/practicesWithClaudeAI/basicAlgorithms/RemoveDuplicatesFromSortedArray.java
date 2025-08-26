package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * RemoveDuplicatesFromSortedArray (Java)
 * <p>
 * Given a sorted array, this program removes duplicates in-place
 * and returns the number of unique elements.
 * <p>
 * Examples:
 * - Input: [0,0,1,1,1,2,2,3,3,4] → Output: 5 (unique: [0,1,2,3,4])
 * - Input: [1,1,2] → Output: 2 (unique: [1,2])
 * - Input: [1] → Output: 1 (unique: [1])
 * <p>
 * Author: <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * LinkedIn: <a href="https://www.linkedin.com/in/hakancivelek">Profile</a>
 */

import java.text.MessageFormat;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int uniqueElements = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[uniqueElements - 1]) {
                numbers[uniqueElements] = numbers[i];
                uniqueElements++;
            }
        }

        System.out.println(uniqueElements);
    }
}
