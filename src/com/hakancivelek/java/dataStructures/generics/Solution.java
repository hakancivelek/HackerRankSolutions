package com.hakancivelek.java.dataStructures.generics;

/**
 * A generic class demonstrating the use of Java Generics to print elements of an array.
 *
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    /**
     * A generic method that prints each element of the given array.
     * The method can accept arrays of any type due to the use of generics.
     *
     * @param <T>   The type of elements in the array.
     * @param array The array whose elements are to be printed.
     */
    public static <T> void printArray(T[] array) {
        for (T arg : array) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}
