package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.sparseArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Determines the frequency of each query string in the given list of input strings.
     *
     * @param strings A list of strings to search.
     * @param queries A list of query strings whose occurrences need to be counted.
     * @return A list of integers where each element represents the frequency of the corresponding query in the strings list.
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for(String query : queries){
            for(String str : strings){
                if(str.equals(query)){
                    counter++;
                }
            }
            result.add(counter);
            counter = 0;
        }
        return result;
    }
}