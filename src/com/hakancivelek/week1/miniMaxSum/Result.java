package com.hakancivelek.week1.miniMaxSum;

import java.math.BigInteger;
import java.util.List;

/**
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan CİVELEK</a>
 */

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger min = BigInteger.valueOf(arr.get(0))
                .add(BigInteger.valueOf(arr.get(1)))
                .add(BigInteger.valueOf(arr.get(2)))
                .add(BigInteger.valueOf(arr.get(3)));
        BigInteger max = BigInteger.ZERO;

        for (int i = 0; i < 5; i++) {
            sum = BigInteger.ZERO;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    sum = sum.add(BigInteger.valueOf(arr.get(j)));
                }
            }
            if (sum.compareTo(min) < 0) {
                min = sum;
            }
            if (sum.compareTo(max) > 0) {
                max = sum;
            }
        }
        System.out.println(min + " " + max);
    }
}
