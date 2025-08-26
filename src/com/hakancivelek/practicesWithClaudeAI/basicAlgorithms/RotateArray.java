package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * Rotate Array (Java)
 * <p>
 * Simple Java program that rotates a given integer array to the right by k positions.
 * The rotation is done in-place, one step at a time.
 * <p>
 * Examples:
 * - Input: [1,2,3,4,5,6,7], k=3 → Output: [5,6,7,1,2,3,4]
 * - Input: [-1,-100,3,99], k=2 → Output: [3,99,-1,-100]
 * - Input: [1,2], k=3 → Output: [2,1]
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the rotate count: ");
        int rotateCount = input.nextInt() % size;

        while (rotateCount > 0) {
            int temp = numbers[size - 1];
            for (int i = size - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;
            rotateCount--;
        }

        for (int i : numbers) System.out.print(i + " ");
    }
}
