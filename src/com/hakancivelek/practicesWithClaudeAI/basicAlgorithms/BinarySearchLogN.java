package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * Binary Search (Java)
 * <p>
 * Simple Java program that performs a binary search on a sorted integer array.
 * It returns the index of the target number if found, otherwise -1.
 * The search runs in O(log n) time complexity.
 * <p>
 * Examples:
 * - Input: [-1,0,3,5,9,12], target=9 → Output: 4
 * - Input: [-1,0,3,5,9,12], target=2 → Output: -1
 * - Input: [5], target=5 → Output: 0
 * - Input: [1,2,3,4,5], target=1 → Output: 0
 * - Input: [1,2,3,4,5], target=5 → Output: 4
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

import java.util.Scanner;

public class BinarySearchLogN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        int leftIndex = 0, rightIndex = size - 1;
        int mid = (leftIndex + rightIndex) / 2;
        int foundIndex = -1;

        System.out.print("Enter the elements of the sorted array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the search number: ");
        int searchingNumber = input.nextInt();

        while (leftIndex <= rightIndex) {
            if (numbers[mid] == searchingNumber) {
                foundIndex = mid;
                break;
            } else if (numbers[mid] < searchingNumber) {
                leftIndex = mid + 1;
                mid = (leftIndex + rightIndex) / 2;
            } else if (numbers[mid] > searchingNumber) {
                rightIndex = mid - 1;
                mid = (leftIndex + rightIndex) / 2;
            }
        }

        if (foundIndex == -1) {
            System.err.println("Invalid search number");
        } else
            System.out.println("Number " + searchingNumber + " found at index " + foundIndex);
    }
}
