package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.lonelyInteger;

import java.util.List;
import java.util.Objects;

/**
 * The Result class provides a method to find the unique integer in a given list.
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Result {

    /**
     * Finds the integer that appears only once in the given list.
     * All other integers appear exactly twice.
     *
     * @param a The list of integers.
     * @return The unique integer that appears only once.
     */
    public static int lonelyInteger(List<Integer> a) {
        Integer uniqueIndex = null;
        int size = a.size();

        here:
        for (int i = 0; i < size; i++) {
            boolean isUnique = true;
            for (int j = 0; j < size; j++) {
                if (Objects.equals(a.get(i), a.get(j)) && i!= j){
                    isUnique = false;
                    break;
                }
            } if (isUnique){
                uniqueIndex = i;
                break here;
            }
        }

        return a.get(Integer.valueOf(uniqueIndex));
    }
}

