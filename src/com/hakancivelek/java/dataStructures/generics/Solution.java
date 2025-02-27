package com.hakancivelek.java.dataStructures.generics;

public class Solution {

    public static<T> void printArray(T[] array){
        for(T arg : array)
            System.out.println(arg);
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}
