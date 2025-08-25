package com.hakancivelek.java.introduction.loopsI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Solution class, which reads an integer input from the user and prints its multiplication table from 1 to 10.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + i*number);
        }
    }
}