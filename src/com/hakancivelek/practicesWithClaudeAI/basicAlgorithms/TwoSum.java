package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * Two Sum (Java)
 *
 * Simple Java program that solves the **Two Sum** problem.
 * It asks the user for an array of integers and a target value, then finds two indices whose numbers add up to the target.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int sizeOfArray = input.nextInt();

        int[] nums = new int[sizeOfArray];
        System.out.println("Enter the elements separated by spaces: ");
        for (int i = 0; i < sizeOfArray; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Enter the target number: ");
        int target = input.nextInt();
        int[] result = new int[2];

        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = i + 1; j < sizeOfArray; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
