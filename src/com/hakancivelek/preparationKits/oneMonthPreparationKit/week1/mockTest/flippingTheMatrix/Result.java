package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.mockTest.flippingTheMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class provides a method to maximize the sum of the upper-left quadrant of a 2n x 2n matrix
 * by flipping rows and columns optimally.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Computes the maximum possible sum of the upper-left quadrant of a 2n x 2n matrix
     * by reversing any rows or columns as needed.
     *
     * @param matrix A 2n x 2n matrix of integers.
     * @return The maximum sum of the upper-left quadrant.
     */
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int maxVal = Math.max(
                        Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - j - 1)),
                        Math.max(matrix.get(2 * n - i - 1).get(j), matrix.get(2 * n - i - 1).get(2 * n - j - 1))
                );

                maxSum += maxVal;
            }
        }
        return maxSum;
    }

    /**
     * Reads a 2n x 2n matrix from the console, calls flippingMatrix function, and prints the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n (matrix will be 2n x 2n): ");
        int n = scanner.nextInt();

        int size = 2 * n;
        List<List<Integer>> matrix = new ArrayList<>();

        System.out.println("Enter the " + size + "x" + size + " matrix row by row:");

        for (int i = 0; i < size; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        scanner.close();

        int result = flippingMatrix(matrix);
        System.out.println("Maximum sum of the upper-left quadrant: " + result);
    }
}
