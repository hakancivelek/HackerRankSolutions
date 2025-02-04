package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.plusMinus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Solution class that handles the input and output for the "Plus Minus" problem.
 * The program first reads the number of integers and then accepts the integers themselves.
 * After that, it computes the positive, negative, and zero counts, and prints the respective fractions.
 * The program uses BufferedReader to read input and processes the numbers with streams.
 *
 * The problem works as follows:
 * - You are given an array of integers, and you need to calculate the fractions of positive, negative, and zero numbers.
 * - The output should consist of three lines:
 *   1. The fraction of positive numbers.
 *   2. The fraction of negative numbers.
 *   3. The fraction of zero numbers.
 *
 * Example:
 * Input:
 * 6
 * -4 3 -9 0 4 1
 * Output:
 * 0.500000
 * 0.333333
 * 0.166667
 *
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

