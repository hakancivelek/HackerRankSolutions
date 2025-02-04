package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.plusMinus;

import java.util.List;

/**
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int lengt = arr.size();
        double positiveNumberCount = 0.0;
        double negativeNumberCount = 0.0;
        double zeroCount = 0D;

        for(int number : arr){
            if(number > 0){
                positiveNumberCount ++;
            } else if(number < 0){
                negativeNumberCount ++;
            } else {
                zeroCount ++;
            }
        }

        System.out.println(String.format("%.6f", positiveNumberCount / lengt));
        System.out.println(String.format("%.6f", negativeNumberCount / lengt));
        System.out.println(String.format("%.6f", zeroCount / lengt));
    }
}
