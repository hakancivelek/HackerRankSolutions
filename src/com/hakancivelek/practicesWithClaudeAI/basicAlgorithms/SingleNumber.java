package com.hakancivelek.practicesWithClaudeAI.basicAlgorithms;

/**
 * Single Number (Java)
 * <p>
 * This program finds the single number in an integer array where every other
 * number appears exactly twice. It returns the unique number that appears only once.
 *
 * <p>Examples:</p>
 * <ul>
 *     <li>Input: [2, 2, 1] → Output: 1</li>
 *     <li>Input: [4, 1, 2, 1, 2] → Output: 4</li>
 *     <li>Input: [7, 3, 7, 3, 8] → Output: 8</li>
 * </ul>
 *
 * <p>This implementation sorts the array first and then checks adjacent pairs
 * to find the unique number.</p>
 *
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @version 1.0
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers.add(input.nextInt());
        }
        int singleNumber = numbers.get(0);

        Collections.sort(numbers);

        for (int i = 0; i + 1 < numbers.size(); i = i + 2) {
            if (!numbers.get(i).equals(numbers.get(i + 1))) {
                singleNumber = numbers.get(i);
                break;
            }
        }

        System.out.println("Single number is: " + singleNumber);
    }
}
