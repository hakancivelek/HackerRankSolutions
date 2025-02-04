package com.hakancivelek.java.introduction.endOfFile;

import java.util.*;

/**
 * This program reads lines of input from standard input (System.in) until it reaches EOF (End of File).
 * Each line is numbered sequentially and printed in the format: "line_number line_content".
 *
 * <p>The program utilizes Java's {@code Scanner.hasNext()} method to detect when EOF is reached.</p>
 *
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * Main method that initializes the scanner and processes input lines.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        processInput(scanner, counter);

        scanner.close();
    }

    /**
     * Reads input lines until EOF is reached or an empty line is entered.
     *
     * @param scanner The Scanner object used to read input.
     * @param counter The starting line number.
     */
    public static void processInput(Scanner scanner, int counter) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) { // Stops when an empty line is entered
                break;
            }
            System.out.println(counter + " " + line);
            counter++;
        }
    }
}
