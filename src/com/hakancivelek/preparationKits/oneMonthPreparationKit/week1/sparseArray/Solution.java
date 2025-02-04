package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.sparseArray;

import java.io.*;
import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < stringsCount; i++) {
            strings.add(bufferedReader.readLine());
        }

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();
        for (int i = 0; i < queriesCount; i++) {
            queries.add(bufferedReader.readLine());
        }

        List<Integer> res = Result.matchingStrings(strings, queries);

        res.forEach(System.out::println);

        bufferedReader.close();
    }
}
