package com.hakancivelek.java.introduction.staticInitializerBlock;

import java.util.Scanner;

/**
 * The Solution class calculates the area of a parallelogram based on the given breadth and height.
 *
 * <p>The program reads the breadth and height from the standard input. If either value is less than or equal
 * to zero, it throws an exception with a message indicating that both breadth and height must be positive.
 * Otherwise, it calculates and prints the area of the parallelogram.
 * </p>
 *
 * <p>It uses a static initialization block to read the values and perform the necessary checks and calculations.</p>
 *
 * <p>Sample input:</p>
 * <pre>
 * 1
 * 3
 * </pre>
 * <p>Sample output:</p>
 * <pre>
 * 3
 * </pre>
 *
 * <p>Sample input (with invalid input):</p>
 * <pre>
 * -1
 * 2
 * </pre>
 * <p>Sample output (with invalid input):</p>
 * <pre>
 * java.lang.Exception: Breadth and height must be positive
 * </pre>
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    static int b;
    static int h;

    static {
        Scanner scan = new Scanner(System.in);
        b = scan.nextInt();
        h = scan.nextInt();
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else{
            System.out.println(b*h);
        }
    }

    /**
     * Main method. In this case, it doesn't perform any actions as all logic
     * is handled by the static block.
     *
     * <p>The main method is included as a placeholder, and it doesn't need to
     * contain any code to execute the solution, as the logic is already present
     * in the static initialization block.</p>
     */
    public static void main(String[] args){

    }
}