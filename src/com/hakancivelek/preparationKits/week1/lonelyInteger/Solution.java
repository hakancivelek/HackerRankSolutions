package com.hakancivelek.preparationKits.week1.lonelyInteger;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.lonelyInteger(a);

        System.out.println(result);

        bufferedReader.close();
    }
}
