package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.timeConversion;

import java.io.*;

/**
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}

