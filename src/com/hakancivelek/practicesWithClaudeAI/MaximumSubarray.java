package com.hakancivelek.practicesWithClaudeAI;

/**
 * Maximum Subarray (Java)
 * <p>
 * Simple Java program that finds the **maximum subarray sum** in a given integer array.
 * The program asks the user for the array size and elements, then calculates the
 * largest sum of any contiguous subarray.
 * <p>
 * Subarray = contiguous elements of the array (at least one element)
 * <p>
 * Test Examples:
 * - Input: [-2,1,-3,4,-1,2,1,-5,4] → Output: 6 (subarray: [4,-1,2,1])
 * - Input: [1] → Output: 1
 * - Input: [5,4,-1,7,8] → Output: 23
 * - Input: [-1] → Output: -1
 * - Input: [-2,-3,-1,-5] → Output: -1
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int length = input.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements separated by spaces: ");
        for (int i = 0; i < length; i++) {
            nums[i] = input.nextInt();
        }

        int maxSum = nums[0];

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum += nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
