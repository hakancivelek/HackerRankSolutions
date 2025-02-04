package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.countingSort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Solution class reads input, processes the counting sort algorithm,
 * and prints the result to the console.
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
                .collect(Collectors.toList());

        List<Integer> result = Result.countingSort(arr);

        System.out.println(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
        );

        bufferedReader.close();
    }
}
