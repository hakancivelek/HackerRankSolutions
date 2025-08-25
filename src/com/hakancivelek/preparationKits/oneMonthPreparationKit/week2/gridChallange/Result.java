package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.gridChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A utility class that provides a method to determine if a grid of characters can be rearranged
 * so that both its rows and columns are in alphabetical order.
 */
class Result {

    /**
     * Determines whether a grid of characters can be rearranged such that each row is in alphabetical order
     * and each column is also in alphabetical order.
     *
     * @param grid a list of strings representing the grid
     * @return "YES" if the grid can be rearranged to satisfy the conditions; otherwise, "NO"
     */
    public static String gridChallenge(List<String> grid) {
        List<String> sortedRows = new ArrayList<>();
        for (String row : grid) {
            char[] charArr = row.toCharArray();
            Arrays.sort(charArr);
            sortedRows.add(new String(charArr));
        }

        int numRows = grid.size();
        int numColumns = grid.get(0).length();

        for (int col = 0; col < numColumns; col++) {
            char previousChar = sortedRows.get(0).charAt(col);

            for (int row = 1; row < numRows; row++) {
                char currentChar = sortedRows.get(row).charAt(col);

                if (currentChar < previousChar) {
                    return "NO";
                }

                previousChar = currentChar;
            }
        }

        return "YES";
    }
}
