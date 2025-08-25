package com.hakancivelek.java.dataStructures.list;

import java.util.*;

/**
 * This class provides a solution to perform Insert and Delete operations on a List.
 * The operations are specified through a series of queries and are executed on an initially provided list.
 */
public class Solution {

    /**
     * The main method that reads input, processes the queries, and outputs the modified list.
     *
     * @param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sizeOfList = in.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < sizeOfList; i++) {
            list.add(in.nextInt());
        }

        int querySize = in.nextInt();

        for (int i = 0; i < querySize; i++) {
            String queryType = in.next();

            if (queryType.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();

                list.add(index, value);
            }
            else if (queryType.equals("Delete")) {
                int index = in.nextInt();

                list.remove(index);
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

