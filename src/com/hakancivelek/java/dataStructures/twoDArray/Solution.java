package com.hakancivelek.java.dataStructures.twoDArray;

import java.util.Scanner;

/**
 * Solution class for finding the maximum hourglass sum in a 6x6 2D array.
 *
 * <p>An hourglass in a 6x6 matrix consists of the following pattern:</p>
 * <pre>
 * a b c
 *   d
 * e f g
 * </pre>
 * The program reads a 6x6 integer matrix from standard input, computes the sum
 * of all possible hourglasses, and prints the maximum sum found.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    /**
     * The main method reads a 6x6 matrix, computes the hourglass sums,
     * and prints the maximum sum.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        scan.close();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int tempSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if (tempSum > max) {
                    max = tempSum;
                }
            }
        }

        System.out.println(max);
    }
}

