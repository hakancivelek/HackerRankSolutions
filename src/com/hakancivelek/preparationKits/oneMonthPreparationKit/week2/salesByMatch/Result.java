package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.salesByMatch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The Result class contains a method to count matching pairs of socks.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Counts the number of matching pairs of socks from a given list.
     *
     * @param n        The number of socks in the pile.
     * @param sockList A list of integers representing the color of each sock.
     * @return The number of pairs found in the given sock list.
     */
    public static int sockMerchant(int n, List<Integer> sockList) {
        int pairSocks = 0;

        List<Integer> listOfIntegers = new ArrayList<>(sockList);

        Set<Integer> setListOfIntegers = new HashSet<>(listOfIntegers);

        for (Integer value : setListOfIntegers) {
            int sockCount = 0;
            for (Integer arg : sockList) {
                if (value.equals(arg)) {
                    sockCount++;
                }
            }
            pairSocks += sockCount / 2;
        }

        return pairSocks;
    }
}
