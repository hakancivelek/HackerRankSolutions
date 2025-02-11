package com.hakancivelek.java.dataStructures.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Solution class reads a list of integer sequences and processes queries
 * to retrieve specific elements based on given indices.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * Reads integer sequences from input, stores them in a nested list structure,
     * and processes queries to retrieve elements at specified positions.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayListSize = in.nextInt();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        for (int i = 0; i < arrayListSize; i++) {
            int innerListSize = in.nextInt();
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < innerListSize; j++) {
                innerList.add(in.nextInt());
            }
            mainList.add(innerList);
        }

        int queries = in.nextInt();
        for (int i = 0; i < queries; i++) {
            int listIndex = in.nextInt() - 1;
            int numberIndex = in.nextInt() - 1;

            if (numberIndex < mainList.get(listIndex).size()) {
                System.out.println(mainList.get(listIndex).get(numberIndex));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}

